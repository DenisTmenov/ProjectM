package com.project.m.entity;

import java.util.Date;

public class EntityBatches {

	private Integer batchId;
	private String batchName;
	private Date createDate;
	private Boolean isActive;

	public EntityBatches() {
		super();
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchesId) {
		this.batchId = batchesId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchesName) {
		this.batchName = batchesName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityBatches other = (EntityBatches) obj;
		if (batchId == null) {
			if (other.batchId != null)
				return false;
		} else if (!batchId.equals(other.batchId))
			return false;
		if (batchName == null) {
			if (other.batchName != null)
				return false;
		} else if (!batchName.equals(other.batchName))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DboBatchesDao [batchesId=" + batchId + ", batchesName=" + batchName + ", createDate=" + createDate
				+ ", isActive=" + isActive + "]";
	}

}
