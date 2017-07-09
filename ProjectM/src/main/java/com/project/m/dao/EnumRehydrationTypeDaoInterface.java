package com.project.m.dao;

import java.util.Map;

import com.project.m.entity.EntityBatches;
import com.project.m.exceptions.DaoException;

public interface EnumRehydrationTypeDaoInterface {
	
	void save(EntityBatches bean) throws DaoException;

	void update(EntityBatches bean) throws DaoException;

	void remove(Integer batchId) throws DaoException;
	
	public Map<Integer, String> loadEnumRehydrationType();

}
