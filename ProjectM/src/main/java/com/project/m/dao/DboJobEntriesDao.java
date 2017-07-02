package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.DboBatchesEntity;
import com.project.m.entity.DboJobEntriesEntity;
import com.project.m.exceptions.SqlException;

public interface DboJobEntriesDao {
	
	void save(DboBatchesEntity bean) throws SqlException;

	void update(DboBatchesEntity bean) throws SqlException;

	void remove(Integer batchId) throws SqlException;
	
	public LinkedList<DboJobEntriesEntity> loadEntriesByBatchId(Integer batchId);

}
