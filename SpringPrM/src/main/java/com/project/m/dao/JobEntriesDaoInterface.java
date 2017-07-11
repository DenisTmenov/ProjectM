package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.EntityBatches;
import com.project.m.entity.EntityJobEntries;
import com.project.m.exceptions.DaoException;

public interface JobEntriesDaoInterface {
	
	void save(EntityBatches bean) throws DaoException;

	void update(EntityBatches bean) throws DaoException;

	void remove(Integer batchId) throws DaoException;
	
	public LinkedList<EntityJobEntries> loadJobEntriesByBatchId(Integer batchId);

}
