package com.project.m.dao.factory;

import com.project.m.dao.sql.BatchesDao;
import com.project.m.dao.sql.EnumJobStatusDao;
import com.project.m.dao.sql.EnumMigrationTypeDao;
import com.project.m.dao.sql.EnumRehydrationTypeDao;
import com.project.m.dao.sql.JobEntriesDao;
import com.project.m.dao.sql.JobHistoriesDao;
import com.project.m.exceptions.UnsupportedDaoTypeException;

public class SqlDaoFactory extends DaoFactory {

	SqlDaoFactory() {
		super();
	}

	@Override
	public BatchesDao getBatchesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.BatchesDao");
			Object daoObject = daoClass.newInstance();

			return ((BatchesDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public JobEntriesDao getJobEntriesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.JobEntriesDao");
			Object daoObject = daoClass.newInstance();

			return ((JobEntriesDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public JobHistoriesDao getJobHistoriesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.JobHistoriesDao");
			Object daoObject = daoClass.newInstance();

			return ((JobHistoriesDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public EnumJobStatusDao getEnumJobStatusDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.EnumJobStatusDao");
			Object daoObject = daoClass.newInstance();

			return ((EnumJobStatusDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public EnumMigrationTypeDao getEnumMigrationTypeDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.EnumMigrationTypeDao");
			Object daoObject = daoClass.newInstance();

			return ((EnumMigrationTypeDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public EnumRehydrationTypeDao getEnumRehydrationTypeDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.EnumRehydrationTypeDao");
			Object daoObject = daoClass.newInstance();

			return ((EnumRehydrationTypeDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

}
