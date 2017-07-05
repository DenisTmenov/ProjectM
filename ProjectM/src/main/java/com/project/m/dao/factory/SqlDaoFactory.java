package com.project.m.dao.factory;

import com.project.m.dao.sql.BatchesDao;
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
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.BatchesDaoImpl");
			Object daoObject = daoClass.newInstance();

			return ((BatchesDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public JobEntriesDao getJobEntriesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.JobEntriesDaoImpl");
			Object daoObject = daoClass.newInstance();

			return ((JobEntriesDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public JobHistoriesDao getJobHistoriesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.JobHistoriesDaoImpl");
			Object daoObject = daoClass.newInstance();

			return ((JobHistoriesDao) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

}
