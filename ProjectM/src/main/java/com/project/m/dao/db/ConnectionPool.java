package com.project.m.dao.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.PropertyConfigurator;

import com.project.m.utils.PropertiesClass;

public class ConnectionPool {
	private BasicDataSource ds;

	private ConnectionPool() {
		try {
			PropertyConfigurator.configure(getClass().getResource("/settings/log4j.properties"));
			
			Properties jdbcSettings = PropertiesClass.getSettings("jdbc");

			String url = (String) jdbcSettings.getProperty("jdbc.url");
			String driverName = (String) jdbcSettings.getProperty("jdbc.driver.name");

			ds = new BasicDataSource();
			ds.setDriverClassName(driverName);
			ds.setUrl(url);

		} catch (Exception e) {
			throw new RuntimeException("Some errors occurred during create connection!", e);
		}
	}

	public static class SingletonHolder {
		private static final ConnectionPool HOLDER_INSTANCE = new ConnectionPool();
	}

	public static ConnectionPool getInstance() {

		return SingletonHolder.HOLDER_INSTANCE;
	}

	public Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

	public static void closeDbResources(Connection connection, PreparedStatement statement, ResultSet resultSet) {
		closeResultSet(resultSet);
		closeStatement(statement);
		closeConnection(connection);
	}

	private static void closeConnection(Connection connection) {
		if (connection != null) {
			/*
			 * try { connection.close(); } catch (SQLException e) { }
			 */
		}
	}

	private static void closeStatement(PreparedStatement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
			}
		}
	}

	private static void closeResultSet(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
	}

}
