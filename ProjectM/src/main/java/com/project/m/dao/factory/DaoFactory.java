package com.project.m.dao.factory;

import com.project.m.dao.sql.BatchesDaoImpl;
import com.project.m.dao.sql.JobEntriesDaoImpl;
import com.project.m.dao.sql.JobHistoriesDaoImpl;
import com.project.m.exceptions.UnsupportedStoradgeTypeException;

public abstract class DaoFactory {

	public abstract BatchesDaoImpl getBatchesDao();

	public abstract JobEntriesDaoImpl getJobEntriesDao();
	
	public abstract JobHistoriesDaoImpl getJobHistoriesDao();
	
	public static DaoFactory getFactory() {
		return getFactory(StoradgeTypes.Sql);
	}

	public static DaoFactory getFactory(StoradgeTypes type) {
		switch (type) {
			case Sql: {
				return new SqlDaoFactory();
			}
			
		}

		throw new UnsupportedStoradgeTypeException();
	}

}
