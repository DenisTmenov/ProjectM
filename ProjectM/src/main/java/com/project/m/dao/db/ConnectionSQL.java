package com.project.m.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.project.m.utils.PropertiesClass;

public class ConnectionSQL {
	private static Connection connection;

	private ConnectionSQL() {
		try {

			Properties jdbcSettings = PropertiesClass.getSettings("jdbc");

			String url = (String) jdbcSettings.getProperty("jdbc.url");
			String driverName = (String) jdbcSettings.getProperty("jdbc.driver.name");

			Class.forName(driverName);
			connection = DriverManager.getConnection(url);

		} catch (Exception e) {
			throw new RuntimeException("Some errors occurred during create connection!", e);
		}
	}

	public static class SingletonHolder {
		public static final ConnectionSQL HOLDER_INSTANCE = new ConnectionSQL();
	}

	public static ConnectionSQL getInstance() {

		return SingletonHolder.HOLDER_INSTANCE;
	}

	public Connection getConnection() {
		return connection;
	}

	public static void closeDbResources(Connection connection, PreparedStatement statement, ResultSet resultSet) {
		closeResultSet(resultSet);
		closeStatement(statement);
		closeConnection(connection);
	}

	private static void closeConnection(Connection connection) {
		if (connection != null) {
			/*try {
				connection.close();
			} catch (SQLException e) {
			}*/
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
