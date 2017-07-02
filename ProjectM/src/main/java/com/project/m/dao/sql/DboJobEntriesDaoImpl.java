package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.project.m.dao.DboBatchesDao;
import com.project.m.dao.DboJobEntriesDao;
import com.project.m.dao.db.ConnectionSQL;
import com.project.m.entity.DboBatchesEntity;
import com.project.m.entity.DboJobEntriesEntity;
import com.project.m.entity.EntityCreator;
import com.project.m.exceptions.SqlException;

public class DboJobEntriesDaoImpl implements DboJobEntriesDao {

	@Override
	public void save(DboBatchesEntity bean) throws SqlException {
	}

	@Override
	public void update(DboBatchesEntity bean) throws SqlException {
	}

	@Override
	public void remove(Integer batchId) throws SqlException {
	}

	@Override
	public LinkedList<DboJobEntriesEntity> loadEntriesByBatchId(Integer batchId){
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<DboJobEntriesEntity> result = new LinkedList<DboJobEntriesEntity>();

		try {
			connection = ConnectionSQL.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[JobEntries] WHERE JobId = ?");
			statement.setInt(1, batchId);
			
			set = statement.executeQuery();

			while (set.next()) {
				DboJobEntriesEntity entity = EntityCreator.createDboJobEntriesEntity(set);
				result.add(entity);
			}
		} catch (SQLException e) {
			throw new SqlException("Exception in loadEntriesByBatchId().", e);
		} finally {
			ConnectionSQL.closeDbResources(connection, statement, set);
		}

		return result;
	}

	
}
