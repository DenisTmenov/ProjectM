package com.project.m.entity;

import java.math.BigInteger;
import java.util.Date;

public class EntityStatistic {
	private Integer id;
	private Date lastUpdated;
	private Integer jobId;
	private Integer currentThroughput;
	private Integer itemsThroughput;
	private BigInteger dataMigrated;
	private Integer itemsMigrated;

	public EntityStatistic() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getCurrentThroughput() {
		return currentThroughput;
	}

	public void setCurrentThroughput(Integer currentThroughput) {
		this.currentThroughput = currentThroughput;
	}

	public Integer getItemsThroughput() {
		return itemsThroughput;
	}

	public void setItemsThroughput(Integer itemsThroughput) {
		this.itemsThroughput = itemsThroughput;
	}

	public BigInteger getDataMigrated() {
		return dataMigrated;
	}

	public void setDataMigrated(BigInteger dataMigrated) {
		this.dataMigrated = dataMigrated;
	}

	public Integer getItemsMigrated() {
		return itemsMigrated;
	}

	public void setItemsMigrated(Integer itemsMigrated) {
		this.itemsMigrated = itemsMigrated;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentThroughput == null) ? 0 : currentThroughput.hashCode());
		result = prime * result + ((dataMigrated == null) ? 0 : dataMigrated.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemsMigrated == null) ? 0 : itemsMigrated.hashCode());
		result = prime * result + ((itemsThroughput == null) ? 0 : itemsThroughput.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((lastUpdated == null) ? 0 : lastUpdated.hashCode());
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
		EntityStatistic other = (EntityStatistic) obj;
		if (currentThroughput == null) {
			if (other.currentThroughput != null)
				return false;
		} else if (!currentThroughput.equals(other.currentThroughput))
			return false;
		if (dataMigrated == null) {
			if (other.dataMigrated != null)
				return false;
		} else if (!dataMigrated.equals(other.dataMigrated))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemsMigrated == null) {
			if (other.itemsMigrated != null)
				return false;
		} else if (!itemsMigrated.equals(other.itemsMigrated))
			return false;
		if (itemsThroughput == null) {
			if (other.itemsThroughput != null)
				return false;
		} else if (!itemsThroughput.equals(other.itemsThroughput))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (lastUpdated == null) {
			if (other.lastUpdated != null)
				return false;
		} else if (!lastUpdated.equals(other.lastUpdated))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityStatistic [id=" + id + ", lastUpdated=" + lastUpdated + ", jobId=" + jobId + ", currentThroughput=" + currentThroughput + ", itemsThroughput=" + itemsThroughput + ", dataMigrated=" + dataMigrated + ", itemsMigrated="
				+ itemsMigrated + "]";
	}

}