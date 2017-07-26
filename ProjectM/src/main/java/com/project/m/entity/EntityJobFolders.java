package com.project.m.entity;

import java.util.Date;

public class EntityJobFolders {

	private Integer entryId;
	private Date createdDate;
	private String folderId;
	private String parentFolderId;
	private Integer jobId;
	private String displayName;
	private String fullPath;
	private String folderClass;
	private Integer parentFolderEntryId;
	private Integer status;
	private String statusMessage;

	public EntityJobFolders() {
		super();
	}

	public Integer getEntryId() {
		return entryId;
	}

	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getFolderId() {
		return folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	public String getParentFolderId() {
		return parentFolderId;
	}

	public void setParentFolderId(String parentFolderId) {
		this.parentFolderId = parentFolderId;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public String getFolderClass() {
		return folderClass;
	}

	public void setFolderClass(String folderClass) {
		this.folderClass = folderClass;
	}

	public Integer getParentFolderEntryId() {
		return parentFolderEntryId;
	}

	public void setParentFolderEntryId(Integer parentFolderEntryId) {
		this.parentFolderEntryId = parentFolderEntryId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((entryId == null) ? 0 : entryId.hashCode());
		result = prime * result + ((folderClass == null) ? 0 : folderClass.hashCode());
		result = prime * result + ((folderId == null) ? 0 : folderId.hashCode());
		result = prime * result + ((fullPath == null) ? 0 : fullPath.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((parentFolderEntryId == null) ? 0 : parentFolderEntryId.hashCode());
		result = prime * result + ((parentFolderId == null) ? 0 : parentFolderId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusMessage == null) ? 0 : statusMessage.hashCode());
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
		EntityJobFolders other = (EntityJobFolders) obj;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (entryId == null) {
			if (other.entryId != null)
				return false;
		} else if (!entryId.equals(other.entryId))
			return false;
		if (folderClass == null) {
			if (other.folderClass != null)
				return false;
		} else if (!folderClass.equals(other.folderClass))
			return false;
		if (folderId == null) {
			if (other.folderId != null)
				return false;
		} else if (!folderId.equals(other.folderId))
			return false;
		if (fullPath == null) {
			if (other.fullPath != null)
				return false;
		} else if (!fullPath.equals(other.fullPath))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (parentFolderEntryId == null) {
			if (other.parentFolderEntryId != null)
				return false;
		} else if (!parentFolderEntryId.equals(other.parentFolderEntryId))
			return false;
		if (parentFolderId == null) {
			if (other.parentFolderId != null)
				return false;
		} else if (!parentFolderId.equals(other.parentFolderId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusMessage == null) {
			if (other.statusMessage != null)
				return false;
		} else if (!statusMessage.equals(other.statusMessage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityJobFolders [entryId=" + entryId + ", folderId=" + folderId + ", parentFolderId=" + parentFolderId + ", jobId=" + jobId + ", displayName=" + displayName + ", fullPath=" + fullPath + ", folderClass=" + folderClass
				+ ", parentFolderEntryId=" + parentFolderEntryId + ", status=" + status + ", statusMessage=" + statusMessage + "]";
	}

}
