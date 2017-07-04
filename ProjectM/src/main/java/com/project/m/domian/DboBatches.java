package com.project.m.domian;

import java.util.Date;

import com.project.m.utils.SimpleObject;

import javafx.beans.property.SimpleStringProperty;

public class DboBatches {

	private Integer batchesId;
	private String batchesName;
	private Date createDate;
	private Boolean isActive;
	private Integer jobCount;

	public DboBatches() {
		super();
	}

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

	public Integer getJobCount() {
		return jobCount;
	}

	public void setJobCount(Integer jobCount) {
		this.jobCount = jobCount;
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
	
	public SimpleStringProperty getJobCountSimple() {
		SimpleStringProperty jobCountSimple = new SimpleStringProperty(String.valueOf(getJobCount()));
		jobCountSimple = SimpleObject.convertNullToSpace(jobCountSimple);
		return jobCountSimple;
	}

}
