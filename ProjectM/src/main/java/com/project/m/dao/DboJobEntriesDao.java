package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.EntityBatches;
import com.project.m.entity.EntityJobEntries;
import com.project.m.exceptions.SqlException;

public interface DboJobEntriesDao {
	
	void save(EntityBatches bean) throws SqlException;

	void update(EntityBatches bean) throws SqlException;

	void remove(Integer batchId) throws SqlException;
	
	public LinkedList<EntityJobEntries> loadJobEntriesByBatchId(Integer batchId);

}
