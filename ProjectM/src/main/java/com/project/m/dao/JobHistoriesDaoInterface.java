package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.EntityJobHistories;

public interface JobHistoriesDaoInterface {

	public LinkedList<EntityJobHistories> loadJobHistoriesByBatchId(Integer batchId);

	public LinkedList<EntityJobHistories> loadAllJobHistories();

}
