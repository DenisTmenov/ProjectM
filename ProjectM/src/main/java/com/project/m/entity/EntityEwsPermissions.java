package com.project.m.entity;

public class EntityEwsPermissions {

	private Integer id;
	private Integer jobId;
	private Integer folderId;
	private Boolean canCreateItems;
	private Boolean canCreateSubFolders;
	private Boolean isFolderContact;
	private Boolean isFolderOwner;
	private Boolean isFolderVisible;
	private Integer deleteItems;
	private Integer displayPermissionLevel;
	private Integer editItems;
	private Integer permissionLevel;
	private Integer readItems;
	private String userDisplayName;
	private String userPrimarySmtpAddress;
	private String userSid;
	private Integer userStandardUser;

	public EntityEwsPermissions() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getFolderId() {
		return folderId;
	}

	public void setFolderId(Integer folderId) {
		this.folderId = folderId;
	}

	public Boolean getCanCreateItems() {
		return canCreateItems;
	}

	public void setCanCreateItems(Boolean canCreateItems) {
		this.canCreateItems = canCreateItems;
	}

	public Boolean getCanCreateSubFolders() {
		return canCreateSubFolders;
	}

	public void setCanCreateSubFolders(Boolean canCreateSubFolders) {
		this.canCreateSubFolders = canCreateSubFolders;
	}

	public Boolean getIsFolderContact() {
		return isFolderContact;
	}

	public void setIsFolderContact(Boolean isFolderContact) {
		this.isFolderContact = isFolderContact;
	}

	public Boolean getIsFolderOwner() {
		return isFolderOwner;
	}

	public void setIsFolderOwner(Boolean isFolderOwner) {
		this.isFolderOwner = isFolderOwner;
	}

	public Boolean getIsFolderVisible() {
		return isFolderVisible;
	}

	public void setIsFolderVisible(Boolean isFolderVisible) {
		this.isFolderVisible = isFolderVisible;
	}

	public Integer getDeleteItems() {
		return deleteItems;
	}

	public void setDeleteItems(Integer deleteItems) {
		this.deleteItems = deleteItems;
	}

	public Integer getDisplayPermissionLevel() {
		return displayPermissionLevel;
	}

	public void setDisplayPermissionLevel(Integer displayPermissionLevel) {
		this.displayPermissionLevel = displayPermissionLevel;
	}

	public Integer getEditItems() {
		return editItems;
	}

	public void setEditItems(Integer editItems) {
		this.editItems = editItems;
	}

	public Integer getPermissionLevel() {
		return permissionLevel;
	}

	public void setPermissionLevel(Integer permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	public Integer getReadItems() {
		return readItems;
	}

	public void setReadItems(Integer readItems) {
		this.readItems = readItems;
	}

	public String getUserDisplayName() {
		return userDisplayName;
	}

	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
	}

	public String getUserPrimarySmtpAddress() {
		return userPrimarySmtpAddress;
	}

	public void setUserPrimarySmtpAddress(String userPrimarySmtpAddress) {
		this.userPrimarySmtpAddress = userPrimarySmtpAddress;
	}

	public String getUserSid() {
		return userSid;
	}

	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}

	public Integer getUserStandardUser() {
		return userStandardUser;
	}

	public void setUserStandardUser(Integer userStandardUser) {
		this.userStandardUser = userStandardUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((canCreateItems == null) ? 0 : canCreateItems.hashCode());
		result = prime * result + ((canCreateSubFolders == null) ? 0 : canCreateSubFolders.hashCode());
		result = prime * result + ((deleteItems == null) ? 0 : deleteItems.hashCode());
		result = prime * result + ((displayPermissionLevel == null) ? 0 : displayPermissionLevel.hashCode());
		result = prime * result + ((editItems == null) ? 0 : editItems.hashCode());
		result = prime * result + ((folderId == null) ? 0 : folderId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isFolderContact == null) ? 0 : isFolderContact.hashCode());
		result = prime * result + ((isFolderOwner == null) ? 0 : isFolderOwner.hashCode());
		result = prime * result + ((isFolderVisible == null) ? 0 : isFolderVisible.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((permissionLevel == null) ? 0 : permissionLevel.hashCode());
		result = prime * result + ((readItems == null) ? 0 : readItems.hashCode());
		result = prime * result + ((userDisplayName == null) ? 0 : userDisplayName.hashCode());
		result = prime * result + ((userPrimarySmtpAddress == null) ? 0 : userPrimarySmtpAddress.hashCode());
		result = prime * result + ((userSid == null) ? 0 : userSid.hashCode());
		result = prime * result + ((userStandardUser == null) ? 0 : userStandardUser.hashCode());
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
		EntityEwsPermissions other = (EntityEwsPermissions) obj;
		if (canCreateItems == null) {
			if (other.canCreateItems != null)
				return false;
		} else if (!canCreateItems.equals(other.canCreateItems))
			return false;
		if (canCreateSubFolders == null) {
			if (other.canCreateSubFolders != null)
				return false;
		} else if (!canCreateSubFolders.equals(other.canCreateSubFolders))
			return false;
		if (deleteItems == null) {
			if (other.deleteItems != null)
				return false;
		} else if (!deleteItems.equals(other.deleteItems))
			return false;
		if (displayPermissionLevel == null) {
			if (other.displayPermissionLevel != null)
				return false;
		} else if (!displayPermissionLevel.equals(other.displayPermissionLevel))
			return false;
		if (editItems == null) {
			if (other.editItems != null)
				return false;
		} else if (!editItems.equals(other.editItems))
			return false;
		if (folderId == null) {
			if (other.folderId != null)
				return false;
		} else if (!folderId.equals(other.folderId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isFolderContact == null) {
			if (other.isFolderContact != null)
				return false;
		} else if (!isFolderContact.equals(other.isFolderContact))
			return false;
		if (isFolderOwner == null) {
			if (other.isFolderOwner != null)
				return false;
		} else if (!isFolderOwner.equals(other.isFolderOwner))
			return false;
		if (isFolderVisible == null) {
			if (other.isFolderVisible != null)
				return false;
		} else if (!isFolderVisible.equals(other.isFolderVisible))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (permissionLevel == null) {
			if (other.permissionLevel != null)
				return false;
		} else if (!permissionLevel.equals(other.permissionLevel))
			return false;
		if (readItems == null) {
			if (other.readItems != null)
				return false;
		} else if (!readItems.equals(other.readItems))
			return false;
		if (userDisplayName == null) {
			if (other.userDisplayName != null)
				return false;
		} else if (!userDisplayName.equals(other.userDisplayName))
			return false;
		if (userPrimarySmtpAddress == null) {
			if (other.userPrimarySmtpAddress != null)
				return false;
		} else if (!userPrimarySmtpAddress.equals(other.userPrimarySmtpAddress))
			return false;
		if (userSid == null) {
			if (other.userSid != null)
				return false;
		} else if (!userSid.equals(other.userSid))
			return false;
		if (userStandardUser == null) {
			if (other.userStandardUser != null)
				return false;
		} else if (!userStandardUser.equals(other.userStandardUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityEwsPermissions [id=" + id + ", jobId=" + jobId + ", folderId=" + folderId + ", canCreateItems=" + canCreateItems + ", canCreateSubFolders=" + canCreateSubFolders + ", isFolderContact=" + isFolderContact + ", isFolderOwner="
				+ isFolderOwner + ", isFolderVisible=" + isFolderVisible + ", deleteItems=" + deleteItems + ", displayPermissionLevel=" + displayPermissionLevel + ", editItems=" + editItems + ", permissionLevel=" + permissionLevel + ", readItems="
				+ readItems + ", userDisplayName=" + userDisplayName + ", userPrimarySmtpAddress=" + userPrimarySmtpAddress + ", userSid=" + userSid + ", userStandardUser=" + userStandardUser + "]";
	}

}
