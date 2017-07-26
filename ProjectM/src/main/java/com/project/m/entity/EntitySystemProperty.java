package com.project.m.entity;

import java.util.Date;

public class EntitySystemProperty {
	private Integer id;
	private Integer updateStatsSessionId;
	private Date updateStatsLastSuccessDate;

	public EntitySystemProperty() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUpdateStatsSessionId() {
		return updateStatsSessionId;
	}

	public void setUpdateStatsSessionId(Integer updateStatsSessionId) {
		this.updateStatsSessionId = updateStatsSessionId;
	}

	public Date getUpdateStatsLastSuccessDate() {
		return updateStatsLastSuccessDate;
	}

	public void setUpdateStatsLastSuccessDate(Date updateStatsLastSuccessDate) {
		this.updateStatsLastSuccessDate = updateStatsLastSuccessDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((updateStatsLastSuccessDate == null) ? 0 : updateStatsLastSuccessDate.hashCode());
		result = prime * result + ((updateStatsSessionId == null) ? 0 : updateStatsSessionId.hashCode());
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
		EntitySystemProperty other = (EntitySystemProperty) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (updateStatsLastSuccessDate == null) {
			if (other.updateStatsLastSuccessDate != null)
				return false;
		} else if (!updateStatsLastSuccessDate.equals(other.updateStatsLastSuccessDate))
			return false;
		if (updateStatsSessionId == null) {
			if (other.updateStatsSessionId != null)
				return false;
		} else if (!updateStatsSessionId.equals(other.updateStatsSessionId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntitySystemProperty [id=" + id + ", updateStatsSessionId=" + updateStatsSessionId + ", updateStatsLastSuccessDate=" + updateStatsLastSuccessDate + "]";
	}

}