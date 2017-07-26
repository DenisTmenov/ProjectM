package com.project.m.dao;

import java.util.LinkedList;

import com.project.m.entity.EntityJobEntries;

public interface JobEntriesDaoInterface {

	public LinkedList<EntityJobEntries> loadJobEntriesByBatchId(Integer batchId);

}
