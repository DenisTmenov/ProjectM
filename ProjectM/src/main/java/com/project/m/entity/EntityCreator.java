package com.project.m.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.project.m.exceptions.EntityException;
import com.project.m.exceptions.SqlException;

public class EntityCreator {

	public static DboBatchesEntity createDboBatchesEntity(ResultSet set) {
		Integer batchId = null;
		String batchName = null;
		Date createdDate = null;
		Boolean isActive = null;
		try {
			batchId = set.getInt("BatchId");
			batchName = set.getString("BatchName");
			createdDate = set.getDate("CreatedDate");
			isActive = set.getBoolean("IsActive");
		} catch (SQLException e) {
			throw new EntityException("Exception in createDboBatchesEntity().", e);
		}

		DboBatchesEntity entity = new DboBatchesEntity();

		entity.setBatchesId(batchId);
		entity.setBatchesName(batchName);
		entity.setCreateDate(createdDate);
		entity.setIsActive(isActive);

		return entity;
	}

}
