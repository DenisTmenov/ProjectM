package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.project.m.dao.DboBatchesDao;
import com.project.m.dao.db.ConnectionSQL;
import com.project.m.dao.exception.SqlException;
import com.project.m.entity.DboBatchesEntity;
import com.project.m.entity.EntityCreator;

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

	public LinkedList<DboBatchesEntity> loadByAllBatches() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<DboBatchesEntity> result = new LinkedList<DboBatchesEntity>();

		try {
			connection = ConnectionSQL.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[Batches]");
			set = statement.executeQuery();

			while (set.next()) {
				DboBatchesEntity entity = EntityCreator.createDboBatchesEntity(set);
				result.add(entity);
			}
		} catch (SQLException e) {
			throw new SqlException("Exception from DboBatchesDaoImpl in loadByAllBatches().", e);
		} finally {
			ConnectionSQL.closeDbResources(connection, statement, set);
		}

		return result;
	}

	
}
