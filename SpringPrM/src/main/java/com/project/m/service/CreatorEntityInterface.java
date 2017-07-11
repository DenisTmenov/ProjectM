package com.project.m.service;

import java.sql.ResultSet;

import com.project.m.entity.EntityBatches;
import com.project.m.entity.EntityJobEntries;
import com.project.m.entity.EntityJobHistories;

public interface CreatorEntityInterface {

	public EntityBatches createDboBatchesEntity(ResultSet set);

	public EntityJobHistories createDboJobHistoriesEntity(ResultSet set);

	public EntityJobEntries createDboJobEntriesEntity(ResultSet set);

}
