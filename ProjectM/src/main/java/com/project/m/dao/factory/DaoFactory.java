package com.project.m.dao.factory;

import com.project.m.dao.factory.type.StoradgeTypes;
import com.project.m.dao.sql.BatchesDao;
import com.project.m.dao.sql.EnumItemStatusDao;
import com.project.m.dao.sql.EnumJobStatusDao;
import com.project.m.dao.sql.EnumMigrationTypeDao;
import com.project.m.dao.sql.EnumRehydrationTypeDao;
import com.project.m.dao.sql.JobEntriesDao;
import com.project.m.dao.sql.JobHistoriesDao;
import com.project.m.exceptions.UnsupportedStoradgeTypeException;

public abstract class DaoFactory {

	public abstract BatchesDao getBatches();

	public abstract JobEntriesDao getJobEntries();

	public abstract JobHistoriesDao getJobHistories();

	public abstract EnumJobStatusDao getEnumJobStatus();
	
	public abstract EnumMigrationTypeDao getEnumMigrationType();
	
	public abstract EnumRehydrationTypeDao getEnumRehydrationType();
	
	public abstract EnumItemStatusDao getEnumItemStatus();

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
