package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.DboBatchesEntity;
import com.project.m.exceptions.SqlException;

public interface DboBatchesDao {
	
	void save(DboBatchesEntity bean) throws SqlException;

	void update(DboBatchesEntity bean) throws SqlException;

	void remove(Integer batchId) throws SqlException;
	
	public LinkedList<DboBatchesEntity> loadAllBatches();

}
