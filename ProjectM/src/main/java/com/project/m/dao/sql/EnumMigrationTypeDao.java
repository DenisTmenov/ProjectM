package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.project.m.dao.EnumMigrationTypeDaoInterface;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.EntityBatches;
import com.project.m.exceptions.DaoException;

public class EnumMigrationTypeDao implements EnumMigrationTypeDaoInterface {

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
	public Map<Integer, String> loadEnumMigrationType() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		Map<Integer, String> result = new HashMap<>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[Enum_MigrationType]");

			set = statement.executeQuery();

			while (set.next()) {
				result.put(set.getInt("Id"), set.getString("Description"));
			}
		} catch (SQLException e) {
			throw new DaoException("Exception in loadEnumMigrationType().", e);
		} finally {
			ConnectionPool.closeDbResources(connection, statement, set);
		}

		return result;
	}

}
