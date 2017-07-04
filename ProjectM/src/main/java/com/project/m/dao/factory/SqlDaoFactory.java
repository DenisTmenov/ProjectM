package com.project.m.dao.factory;

import com.project.m.dao.sql.BatchesDaoImpl;
import com.project.m.dao.sql.JobEntriesDaoImpl;
import com.project.m.dao.sql.JobHistoriesDaoImpl;
import com.project.m.exceptions.UnsupportedDaoTypeException;

public class SqlDaoFactory extends DaoFactory {

	SqlDaoFactory() {
		super();
	}

	@Override
	public BatchesDaoImpl getBatchesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.BatchesDaoImpl");
			Object daoObject = daoClass.newInstance();

			return ((BatchesDaoImpl) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public JobEntriesDaoImpl JobEntriesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.JobEntriesDaoImpl");
			Object daoObject = daoClass.newInstance();

			return ((JobEntriesDaoImpl) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

	@Override
	public JobHistoriesDaoImpl JobHistoriesDao() {
		try {
			Class<?> daoClass = Class.forName("com.project.m.dao.sql.JobHistoriesDaoImpl");
			Object daoObject = daoClass.newInstance();

			return ((JobHistoriesDaoImpl) daoObject);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new UnsupportedDaoTypeException();
		}
	}

}
