package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import org.apache.commons.dbcp2.BasicDataSource;

import com.project.m.dao.JobHistoriesDao;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.EntityBatches;
import com.project.m.entity.EntityJobHistories;
import com.project.m.exceptions.SqlException;
import com.project.m.service.CreatorEntity;

public class JobHistoriesDaoImpl implements JobHistoriesDao {

	@Override
	public void save(EntityBatches bean) throws SqlException {
	}

	@Override
	public void update(EntityBatches bean) throws SqlException {
	}

	@Override
	public void remove(Integer batchId) throws SqlException {
	}

	@Override
	public LinkedList<EntityJobHistories> loadJobHistoriesByBatchId(Integer batchId) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<EntityJobHistories> result = new LinkedList<EntityJobHistories>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[JobHistories] WHERE BatchId = ?"); // WHERE
			statement.setInt(1, batchId);

			set = statement.executeQuery();

			while (set.next()) {
				EntityJobHistories entity = CreatorEntity.createDboJobHistoriesEntity(set);
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
