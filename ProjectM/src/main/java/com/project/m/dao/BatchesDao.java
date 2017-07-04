package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.EntityBatches;
import com.project.m.exceptions.DaoException;

public interface BatchesDao {
	
	void save(EntityBatches bean) throws DaoException;

	void update(EntityBatches bean) throws DaoException;

	void remove(Integer batchId) throws DaoException;
	
	public LinkedList<EntityBatches> loadAllBatches();

}
