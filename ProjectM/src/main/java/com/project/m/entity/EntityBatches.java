package com.project.m.entity;

import java.util.Date;

import com.project.m.utils.SimpleObject;

import javafx.beans.property.SimpleStringProperty;

public class EntityBatches {

	private Integer batchesId;
	private String batchesName;
	private Date createDate;
	private Boolean isActive;

	public Integer getBatchesId() {
		return batchesId;
	}

	public void setBatchesId(Integer batchesId) {
		this.batchesId = batchesId;
	}

	public String getBatchesName() {
		return batchesName;
	}

	public void setBatchesName(String batchesName) {
		this.batchesName = batchesName;
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
		result = prime * result + ((batchesId == null) ? 0 : batchesId.hashCode());
		result = prime * result + ((batchesName == null) ? 0 : batchesName.hashCode());
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
		if (batchesId == null) {
			if (other.batchesId != null)
				return false;
		} else if (!batchesId.equals(other.batchesId))
			return false;
		if (batchesName == null) {
			if (other.batchesName != null)
				return false;
		} else if (!batchesName.equals(other.batchesName))
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
		return "DboBatchesDao [batchesId=" + batchesId + ", batchesName=" + batchesName + ", createDate=" + createDate
				+ ", isActive=" + isActive + "]";
	}

	public SimpleStringProperty getBatchesIdSimple() {
		SimpleStringProperty batchesIdSimple = new SimpleStringProperty(String.valueOf(getBatchesId()));
		batchesIdSimple = SimpleObject.convertNullToSpace(batchesIdSimple);
		return batchesIdSimple;
	}

	public SimpleStringProperty getBatchesNameSimple() {
		SimpleStringProperty batchesNameSimple = new SimpleStringProperty(String.valueOf(getBatchesName()));
		batchesNameSimple = SimpleObject.convertNullToSpace(batchesNameSimple);
		return batchesNameSimple;
	}

	public SimpleStringProperty getCreateDateSimple() {
		SimpleStringProperty createDateSimple = new SimpleStringProperty(String.valueOf(getCreateDate()));
		createDateSimple = SimpleObject.convertNullToSpace(createDateSimple);
		return createDateSimple;
	}

	public SimpleStringProperty getIsActiveSimple() {
		SimpleStringProperty isActiveSimple = new SimpleStringProperty(String.valueOf(getIsActive()));
		isActiveSimple = SimpleObject.convertNullToSpace(isActiveSimple);
		return isActiveSimple;
	}

}