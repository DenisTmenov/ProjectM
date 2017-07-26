package com.project.m.entity;

import java.math.BigInteger;
import java.util.Date;

public class EntityJobUpdates {
	private Integer id;
	private Date timeStamp;
	private Integer jobId;
	private Integer jobStatus;
	private BigInteger itemsFailed;
	private BigInteger itemsRemaining;
	private Integer failedCount;
	private Integer processingRate;
	private Integer itemsRate;

	public EntityJobUpdates() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(Integer jobStatus) {
		this.jobStatus = jobStatus;
	}

	public BigInteger getItemsFailed() {
		return itemsFailed;
	}

	public void setItemsFailed(BigInteger itemsFailed) {
		this.itemsFailed = itemsFailed;
	}

	public BigInteger getItemsRemaining() {
		return itemsRemaining;
	}

	public void setItemsRemaining(BigInteger itemsRemaining) {
		this.itemsRemaining = itemsRemaining;
	}

	public Integer getFailedCount() {
		return failedCount;
	}

	public void setFailedCount(Integer failedCount) {
		this.failedCount = failedCount;
	}

	public Integer getProcessingRate() {
		return processingRate;
	}

	public void setProcessingRate(Integer processingRate) {
		this.processingRate = processingRate;
	}

	public Integer getItemsRate() {
		return itemsRate;
	}

	public void setItemsRate(Integer itemsRate) {
		this.itemsRate = itemsRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((failedCount == null) ? 0 : failedCount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemsRate == null) ? 0 : itemsRate.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((jobStatus == null) ? 0 : jobStatus.hashCode());
		result = prime * result + ((processingRate == null) ? 0 : processingRate.hashCode());
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
		EntityJobUpdates other = (EntityJobUpdates) obj;
		if (failedCount == null) {
			if (other.failedCount != null)
				return false;
		} else if (!failedCount.equals(other.failedCount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemsRate == null) {
			if (other.itemsRate != null)
				return false;
		} else if (!itemsRate.equals(other.itemsRate))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (jobStatus == null) {
			if (other.jobStatus != null)
				return false;
		} else if (!jobStatus.equals(other.jobStatus))
			return false;
		if (processingRate == null) {
			if (other.processingRate != null)
				return false;
		} else if (!processingRate.equals(other.processingRate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityJobUpdates [id=" + id + ", jobId=" + jobId + ", jobStatus=" + jobStatus + ", failedCount=" + failedCount + ", processingRate=" + processingRate + ", itemsRate=" + itemsRate + "]";
	}

}