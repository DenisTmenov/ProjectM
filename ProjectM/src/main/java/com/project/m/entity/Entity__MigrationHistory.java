package com.project.m.entity;

public class Entity__MigrationHistory {

	private String MigrationId;
	private String ContextKey;
	private String Model;
	private String ProductVersion;

	public Entity__MigrationHistory() {
		super();
	}

	public String getBatchId() {
		return MigrationId;
	}

	public void setBatchId(String batchesId) {
		this.MigrationId = batchesId;
	}

	public String getBatchName() {
		return ContextKey;
	}

	public void setBatchName(String batchesName) {
		this.ContextKey = batchesName;
	}

	public String getCreateDate() {
		return Model;
	}

	public void setCreateDate(String createDate) {
		this.Model = createDate;
	}

	public String getIsActive() {
		return ProductVersion;
	}

	public void setIsActive(String isActive) {
		this.ProductVersion = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ContextKey == null) ? 0 : ContextKey.hashCode());
		result = prime * result + ((MigrationId == null) ? 0 : MigrationId.hashCode());
		result = prime * result + ((Model == null) ? 0 : Model.hashCode());
		result = prime * result + ((ProductVersion == null) ? 0 : ProductVersion.hashCode());
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
		Entity__MigrationHistory other = (Entity__MigrationHistory) obj;
		if (ContextKey == null) {
			if (other.ContextKey != null)
				return false;
		} else if (!ContextKey.equals(other.ContextKey))
			return false;
		if (MigrationId == null) {
			if (other.MigrationId != null)
				return false;
		} else if (!MigrationId.equals(other.MigrationId))
			return false;
		if (Model == null) {
			if (other.Model != null)
				return false;
		} else if (!Model.equals(other.Model))
			return false;
		if (ProductVersion == null) {
			if (other.ProductVersion != null)
				return false;
		} else if (!ProductVersion.equals(other.ProductVersion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entity__MigrationHistory [MigrationId=" + MigrationId + ", ContextKey=" + ContextKey + ", Model=" + Model + ", ProductVersion=" + ProductVersion + "]";
	}

}
