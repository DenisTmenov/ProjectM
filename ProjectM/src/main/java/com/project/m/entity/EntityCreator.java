package com.project.m.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class EntityCreator {
	
	public static DboBatchesEntity createDboBatchesEntity(ResultSet set) throws SQLException {
		Integer batchId = set.getInt("BatchId");
		String batchName = set.getString("BatchName");
		Date createdDate = set.getDate("CreatedDate");
		Boolean isActive = set.getBoolean("IsActive");

		DboBatchesEntity entity = new DboBatchesEntity();

		entity.setBatchesId(batchId);
		entity.setBatchesName(batchName);
		entity.setCreateDate(createdDate);
		entity.setIsActive(isActive);

		return entity;
	}

}
