package com.project.m.entity;

import java.util.Date;

public class EntityService {
	private Integer id;
	private String machineName;
	private String serviceName;
	private Boolean isInteractive;
	private Date lastPingDate;
	private Integer batchId;

	public EntityService() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Boolean getIsInteractive() {
		return isInteractive;
	}

	public void setIsInteractive(Boolean isInteractive) {
		this.isInteractive = isInteractive;
	}

	public Date getLastPingDate() {
		return lastPingDate;
	}

	public void setLastPingDate(Date lastPingDate) {
		this.lastPingDate = lastPingDate;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isInteractive == null) ? 0 : isInteractive.hashCode());
		result = prime * result + ((machineName == null) ? 0 : machineName.hashCode());
		result = prime * result + ((serviceName == null) ? 0 : serviceName.hashCode());
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
		EntityService other = (EntityService) obj;
		if (batchId == null) {
			if (other.batchId != null)
				return false;
		} else if (!batchId.equals(other.batchId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isInteractive == null) {
			if (other.isInteractive != null)
				return false;
		} else if (!isInteractive.equals(other.isInteractive))
			return false;
		if (machineName == null) {
			if (other.machineName != null)
				return false;
		} else if (!machineName.equals(other.machineName))
			return false;
		if (serviceName == null) {
			if (other.serviceName != null)
				return false;
		} else if (!serviceName.equals(other.serviceName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityService [id=" + id + ", machineName=" + machineName + ", serviceName=" + serviceName + ", isInteractive=" + isInteractive + ", batchId=" + batchId + "]";
	}

}