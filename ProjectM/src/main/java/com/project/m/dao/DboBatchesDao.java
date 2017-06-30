package com.project.m.dao;

import com.project.m.dao.exception.SqlException;
import com.project.m.entity.DboBatchesEntity;

public interface DboBatchesDao {
	
	void save(DboBatchesEntity bean) throws SqlException;

	void update(DboBatchesEntity bean) throws SqlException;

	void remove(Integer batchId) throws SqlException;

}
