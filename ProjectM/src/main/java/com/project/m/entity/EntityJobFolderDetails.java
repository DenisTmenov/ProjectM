package com.project.m.entity;

public class EntityJobFolderDetails {

	private Integer entryId;
	private Integer jobId;
	private Integer childFolderCount;
	private Boolean unreadCount;
	private Boolean totalCount;
	private Boolean creationTime;
	private Boolean modificationTime;
	private Boolean isMailEnabled;
	private Integer mailEnabledId;
	private Integer mailEnabledAddress;
	private Integer size;

	public EntityJobFolderDetails() {
		super();
	}

	public Integer getEntryId() {
		return entryId;
	}

	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getChildFolderCount() {
		return childFolderCount;
	}

	public void setChildFolderCount(Integer childFolderCount) {
		this.childFolderCount = childFolderCount;
	}

	public Boolean getUnreadCount() {
		return unreadCount;
	}

	public void setUnreadCount(Boolean unreadCount) {
		this.unreadCount = unreadCount;
	}

	public Boolean getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Boolean totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Boolean creationTime) {
		this.creationTime = creationTime;
	}

	public Boolean getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Boolean modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Boolean getIsMailEnabled() {
		return isMailEnabled;
	}

	public void setIsMailEnabled(Boolean isMailEnabled) {
		this.isMailEnabled = isMailEnabled;
	}

	public Integer getMailEnabledId() {
		return mailEnabledId;
	}

	public void setMailEnabledId(Integer mailEnabledId) {
		this.mailEnabledId = mailEnabledId;
	}

	public Integer getMailEnabledAddress() {
		return mailEnabledAddress;
	}

	public void setMailEnabledAddress(Integer mailEnabledAddress) {
		this.mailEnabledAddress = mailEnabledAddress;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childFolderCount == null) ? 0 : childFolderCount.hashCode());
		result = prime * result + ((creationTime == null) ? 0 : creationTime.hashCode());
		result = prime * result + ((entryId == null) ? 0 : entryId.hashCode());
		result = prime * result + ((isMailEnabled == null) ? 0 : isMailEnabled.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((mailEnabledAddress == null) ? 0 : mailEnabledAddress.hashCode());
		result = prime * result + ((mailEnabledId == null) ? 0 : mailEnabledId.hashCode());
		result = prime * result + ((modificationTime == null) ? 0 : modificationTime.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((totalCount == null) ? 0 : totalCount.hashCode());
		result = prime * result + ((unreadCount == null) ? 0 : unreadCount.hashCode());
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
		EntityJobFolderDetails other = (EntityJobFolderDetails) obj;
		if (childFolderCount == null) {
			if (other.childFolderCount != null)
				return false;
		} else if (!childFolderCount.equals(other.childFolderCount))
			return false;
		if (creationTime == null) {
			if (other.creationTime != null)
				return false;
		} else if (!creationTime.equals(other.creationTime))
			return false;
		if (entryId == null) {
			if (other.entryId != null)
				return false;
		} else if (!entryId.equals(other.entryId))
			return false;
		if (isMailEnabled == null) {
			if (other.isMailEnabled != null)
				return false;
		} else if (!isMailEnabled.equals(other.isMailEnabled))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (mailEnabledAddress == null) {
			if (other.mailEnabledAddress != null)
				return false;
		} else if (!mailEnabledAddress.equals(other.mailEnabledAddress))
			return false;
		if (mailEnabledId == null) {
			if (other.mailEnabledId != null)
				return false;
		} else if (!mailEnabledId.equals(other.mailEnabledId))
			return false;
		if (modificationTime == null) {
			if (other.modificationTime != null)
				return false;
		} else if (!modificationTime.equals(other.modificationTime))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (totalCount == null) {
			if (other.totalCount != null)
				return false;
		} else if (!totalCount.equals(other.totalCount))
			return false;
		if (unreadCount == null) {
			if (other.unreadCount != null)
				return false;
		} else if (!unreadCount.equals(other.unreadCount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityJobFolderDetails [entryId=" + entryId + ", jobId=" + jobId + ", childFolderCount=" + childFolderCount + ", unreadCount=" + unreadCount + ", totalCount=" + totalCount + ", creationTime=" + creationTime + ", modificationTime="
				+ modificationTime + ", isMailEnabled=" + isMailEnabled + ", mailEnabledId=" + mailEnabledId + ", mailEnabledAddress=" + mailEnabledAddress + ", size=" + size + "]";
	}

}
