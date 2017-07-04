package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import org.apache.commons.dbcp2.BasicDataSource;

import com.project.m.dao.DboJobHistoriesDao;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.DboBatchesEntity;
import com.project.m.entity.DboJobHistoriesEntity;
import com.project.m.entity.EntityCreator;
import com.project.m.exceptions.SqlException;

public class DboJobHistoriesDaoImpl implements DboJobHistoriesDao {

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
	public LinkedList<DboJobHistoriesEntity> loadJobHistoriesByBatchId(Integer batchId) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<DboJobHistoriesEntity> result = new LinkedList<DboJobHistoriesEntity>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[JobHistories] WHERE BatchId = ?"); // WHERE
			statement.setInt(1, batchId);

			set = statement.executeQuery();

			while (set.next()) {
				DboJobHistoriesEntity entity = EntityCreator.createDboJobHistoriesEntity(set);
				result.add(entity);
			}
		} catch (SQLException e) {
			throw new SqlException("Exception in loadJobHistoriesByBatchId().", e);
		} finally {
			ConnectionPool.closeDbResources(connection, statement, set);
		}

		return result;
	}

}
