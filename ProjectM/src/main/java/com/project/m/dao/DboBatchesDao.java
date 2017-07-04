package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.EntityBatches;
import com.project.m.exceptions.SqlException;

public interface DboBatchesDao {
	
	void save(EntityBatches bean) throws SqlException;

	void update(EntityBatches bean) throws SqlException;

	void remove(Integer batchId) throws SqlException;
	
	public LinkedList<EntityBatches> loadAllBatches();

}
