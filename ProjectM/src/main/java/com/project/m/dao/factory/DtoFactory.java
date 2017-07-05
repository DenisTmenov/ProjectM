package com.project.m.dao.factory;

import java.util.LinkedList;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.project.m.dao.sql.JobEntriesDao;
import com.project.m.dao.sql.JobHistoriesDao;
import com.project.m.domian.DtoJobEntries;
import com.project.m.domian.DtoJobHistories;
import com.project.m.entity.EntityJobEntries;
import com.project.m.entity.EntityJobHistories;

public class DtoFactory {

	public static DtoFactory getFactory() {
		return new DtoFactory();
	}

	public LinkedList<DtoJobHistories> getAllJobHistories() {

		LinkedList<DtoJobHistories> dtoLinkedList = new LinkedList<DtoJobHistories>();

		DaoFactory daoFactory = DaoFactory.getSqlFactory();
		JobHistoriesDao jobHistoriesDao = daoFactory.getJobHistoriesDao();

		LinkedList<EntityJobHistories> entityJobHistories = jobHistoriesDao.loadAllJobHistories();
		for (EntityJobHistories entity : entityJobHistories) {
			Mapper mapper = new DozerBeanMapper();
			DtoJobHistories dto = mapper.map(entity, DtoJobHistories.class);

			dtoLinkedList.add(dto);
		}

		return dtoLinkedList;
	}

	public LinkedList<DtoJobEntries> getJobEntries(Integer batchId) {

		LinkedList<DtoJobEntries> dtoLinkedList = new LinkedList<DtoJobEntries>();

		DaoFactory daoFactory = DaoFactory.getSqlFactory();
		JobEntriesDao jobEntriesDao = daoFactory.getJobEntriesDao();

		LinkedList<EntityJobEntries> entityJobEntries = jobEntriesDao.loadJobEntriesByBatchId(batchId);
		for (EntityJobEntries entity : entityJobEntries) {
			Mapper mapper = new DozerBeanMapper();
			DtoJobEntries dto = mapper.map(entity, DtoJobEntries.class);

			dtoLinkedList.add(dto);
		}

		return dtoLinkedList;
	}

}
