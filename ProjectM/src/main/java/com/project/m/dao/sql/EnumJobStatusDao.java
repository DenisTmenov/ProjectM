package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.project.m.dao.EnumJobStatusDaoInterface;
import com.project.m.dao.JobHistoriesDaoInterface;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.EntityBatches;
import com.project.m.entity.EntityJobHistories;
import com.project.m.exceptions.DaoException;
import com.project.m.service.CreatorEntity;

public class EnumJobStatusDao implements EnumJobStatusDaoInterface {

	@Override
	public void save(EntityBatches bean) throws DaoException {
	}

	@Override
	public void update(EntityBatches bean) throws DaoException {
	}

	@Override
	public void remove(Integer batchId) throws DaoException {
	}

	@Override
	public Map<Integer, String> loadEnumJobStatus() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		Map<Integer, String> result = new HashMap<>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[Enum_JobStatus]");

			set = statement.executeQuery();

			while (set.next()) {
				result.put(set.getInt("Id"), set.getString("Description"));
			}
		} catch (SQLException e) {
			throw new DaoException("Exception in loadJobHistoriesByBatchId().", e);
		} finally {
			ConnectionPool.closeDbResources(connection, statement, set);
		}

		return result;
	}

}
