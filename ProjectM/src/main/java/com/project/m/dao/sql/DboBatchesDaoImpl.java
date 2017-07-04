package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.project.m.dao.DboBatchesDao;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.DboBatchesEntity;
import com.project.m.entity.EntityCreator;
import com.project.m.exceptions.SqlException;

public class DboBatchesDaoImpl implements DboBatchesDao {

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
	public LinkedList<DboBatchesEntity> loadAllBatches() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<DboBatchesEntity> result = new LinkedList<DboBatchesEntity>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[Batches]");
			set = statement.executeQuery();

			while (set.next()) {
				DboBatchesEntity entity = EntityCreator.createDboBatchesEntity(set);
				result.add(entity);
			}
		} catch (SQLException e) {
			throw new SqlException("Exception in loadAllBatches().", e);
		} finally {
			ConnectionPool.closeDbResources(connection, statement, set);
		}

		return result;
	}

	
}
