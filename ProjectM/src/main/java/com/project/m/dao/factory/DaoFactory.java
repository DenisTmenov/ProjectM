package com.project.m.dao.factory;

import com.project.m.dao.factory.type.StoradgeTypes;
import com.project.m.dao.sql.BatchesDao;
import com.project.m.dao.sql.EnumJobStatusDao;
import com.project.m.dao.sql.JobEntriesDao;
import com.project.m.dao.sql.JobHistoriesDao;
import com.project.m.exceptions.UnsupportedStoradgeTypeException;

public abstract class DaoFactory {

	public abstract BatchesDao getBatchesDao();

	public abstract JobEntriesDao getJobEntriesDao();

	public abstract JobHistoriesDao getJobHistoriesDao();

	public abstract EnumJobStatusDao getEnumJobStatusDao();

	public static DaoFactory getSqlFactory() {
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
