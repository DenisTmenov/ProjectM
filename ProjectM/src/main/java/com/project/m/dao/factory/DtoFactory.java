package com.project.m.dao.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.project.m.dao.sql.BatchesDao;
import com.project.m.dao.sql.EnumItemStatusDao;
import com.project.m.dao.sql.EnumJobStatusDao;
import com.project.m.dao.sql.EnumMigrationTypeDao;
import com.project.m.dao.sql.JobEntriesDao;
import com.project.m.dao.sql.JobHistoriesDao;
import com.project.m.domian.DtoBatches;
import com.project.m.domian.DtoJobEntries;
import com.project.m.domian.DtoJobHistories;
import com.project.m.entity.EntityBatches;
import com.project.m.entity.EntityJobEntries;
import com.project.m.entity.EntityJobHistories;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DtoFactory {
	private DtoFactory() {

	}

	public static DtoFactory getFactory() {
		return new DtoFactory();
	}

	public ObservableList<DtoJobHistories> getAllJobHistories() {

		ObservableList<DtoJobHistories> result = FXCollections.observableArrayList();

		DaoFactory daoFactory = DaoFactory.getSqlFactory();
		JobHistoriesDao jobHistoriesDao = daoFactory.getJobHistories();

		LinkedList<EntityJobHistories> entityJobHistories = jobHistoriesDao.loadAllJobHistories();

		EnumJobStatusDao enumJobStatusDao = daoFactory.getEnumJobStatus();
		Map<Integer, String> enumJobStatus = enumJobStatusDao.loadEnumJobStatus();

		BatchesDao batchesDao = daoFactory.getBatches();
		LinkedList<EntityBatches> batches = batchesDao.loadAllBatches();

		EnumMigrationTypeDao enumMigrationTypeDao = daoFactory.getEnumMigrationType();
		Map<Integer, String> enumMigrationType = enumMigrationTypeDao.loadEnumMigrationType();

		for (EntityJobHistories entity : entityJobHistories) {
			Mapper mapper = new DozerBeanMapper();
			DtoJobHistories dto = mapper.map(entity, DtoJobHistories.class);

			String jobStatus = dto.getJobStatus();
			String textJobStatus = enumJobStatus.get(Integer.parseInt(jobStatus));
			dto.setJobStatus(textJobStatus);

			String source = dto.getSource();
			String textSource = enumMigrationType.get(Integer.parseInt(source));
			dto.setSource(textSource);

			String target = dto.getTarget();
			String textTarget = enumMigrationType.get(Integer.parseInt(target));
			dto.setTarget(textTarget);

			Integer batchIdDTO = dto.getBatchId();
			for (EntityBatches entityBatches : batches) {
				String batchName = entityBatches.getBatchName();
				Integer batchIdENTITY = entityBatches.getBatchId();
				if (batchIdDTO == batchIdENTITY) {
					dto.setBatchName(batchName);
				}
			}

			result.add(dto);
		}

		return result;
	}

	public ObservableList<DtoJobHistories> getJobHistoriesByStatus(String status) {
		ObservableList<DtoJobHistories> result = FXCollections.observableArrayList();

		ObservableList<DtoJobHistories> linkedList = getAllJobHistories();

		for (DtoJobHistories dtoJobHistories : linkedList) {
			if (dtoJobHistories.getJobStatus().equals(status)) {
				result.add(dtoJobHistories);
			}
		}
		return result;
	}

	public LinkedList<DtoJobEntries> getJobEntries(Integer batchId) {

		LinkedList<DtoJobEntries> dtoLinkedList = new LinkedList<DtoJobEntries>();

		DaoFactory daoFactory = DaoFactory.getSqlFactory();
		JobEntriesDao jobEntriesDao = daoFactory.getJobEntries();

		EnumItemStatusDao enumItemStatusDao = daoFactory.getEnumItemStatus();
		Map<Integer, String> enumItemStatus = enumItemStatusDao.loadEnumItemStatus();

		LinkedList<EntityJobEntries> entityJobEntries = jobEntriesDao.loadJobEntriesByBatchId(batchId);
		for (EntityJobEntries entity : entityJobEntries) {
			Mapper mapper = new DozerBeanMapper();
			DtoJobEntries dto = mapper.map(entity, DtoJobEntries.class);

			String status = dto.getItemStatus();
			String textStatus = enumItemStatus.get(Integer.parseInt(status));
			dto.setItemStatus(textStatus);

			dtoLinkedList.add(dto);
		}

		return dtoLinkedList;
	}

	public LinkedList<DtoBatches> getAllBatches() {

		LinkedList<DtoBatches> dtoLinkedList = new LinkedList<DtoBatches>();

		DaoFactory daoFactory = DaoFactory.getSqlFactory();
		BatchesDao batchesDao = daoFactory.getBatches();

		LinkedList<EntityBatches> entityJobHistories = batchesDao.loadAllBatches();
		for (EntityBatches entity : entityJobHistories) {
			Mapper mapper = new DozerBeanMapper();
			DtoBatches dto = mapper.map(entity, DtoBatches.class);

			dtoLinkedList.add(dto);
		}

		return dtoLinkedList;
	}

	public List<String> getEnumStatus() {
		List<String> enumStatus = new ArrayList<String>();

		DaoFactory daoFactory = DaoFactory.getSqlFactory();
		EnumJobStatusDao enumJobStatusDao = daoFactory.getEnumJobStatus();
		Map<Integer, String> enumJobStatus = enumJobStatusDao.loadEnumJobStatus();

		for (Map.Entry<Integer, String> entry : enumJobStatus.entrySet()) {
			String value = entry.getValue();
			enumStatus.add(value);
		}

		return enumStatus;
	}

}
