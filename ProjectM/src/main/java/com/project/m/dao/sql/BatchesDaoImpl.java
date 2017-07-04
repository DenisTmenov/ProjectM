package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.project.m.dao.BatchesDao;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.EntityBatches;
import com.project.m.exceptions.SqlException;
import com.project.m.service.CreatorEntity;

public class BatchesDaoImpl implements BatchesDao {

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
	public LinkedList<EntityBatches> loadAllBatches() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<EntityBatches> result = new LinkedList<EntityBatches>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[Batches]");
			set = statement.executeQuery();

			while (set.next()) {
				EntityBatches entity = CreatorEntity.createDboBatchesEntity(set);
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
