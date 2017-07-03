package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Properties;

import com.project.m.dao.DboBatchesDao;
import com.project.m.dao.DboJobEntriesDao;
import com.project.m.dao.db.ConnectionSQL;
import com.project.m.entity.DboBatchesEntity;
import com.project.m.entity.DboJobEntriesEntity;
import com.project.m.entity.EntityCreator;
import com.project.m.exceptions.SqlException;
import com.project.m.utils.PropertiesClass;

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
	public LinkedList<DboJobEntriesEntity> loadJobEntriesByBatchId(Integer batchId){
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<DboJobEntriesEntity> result = new LinkedList<DboJobEntriesEntity>();

		try {
//connection = ConnectionSQL.getInstance().getConnection();
			
			
			Properties jdbcSettings = PropertiesClass.getSettings("jdbc");

			String url = (String) jdbcSettings.getProperty("jdbc.url");
			String driverName = (String) jdbcSettings.getProperty("jdbc.driver.name");

			try {
				Class.forName(driverName);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(url);
			
			
			
			
			
			statement = connection.prepareStatement("SELECT * FROM [dbo].[JobEntries] WHERE JobId = ?");
			statement.setInt(1, batchId);
			
			set = statement.executeQuery();

			while (set.next()) {
				DboJobEntriesEntity entity = EntityCreator.createDboJobEntriesEntity(set);
				result.add(entity);
			}
		} catch (SQLException e) {
			throw new SqlException("Exception in loadJobEntriesByBatchId().", e);
		} finally {
			ConnectionSQL.closeDbResources(connection, statement, set);
		}

		return result;
	}

	
}
