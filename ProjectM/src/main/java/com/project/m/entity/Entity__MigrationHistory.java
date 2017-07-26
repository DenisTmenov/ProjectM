package com.project.m.entity;

public class Entity__MigrationHistory {

	private String migrationId;
	private String contextKey;
	private String model;
	private String productVersion;

	public Entity__MigrationHistory() {
		super();
	}

	public String getMigrationId() {
		return migrationId;
	}

	public void setMigrationId(String migrationId) {
		this.migrationId = migrationId;
	}

	public String getContextKey() {
		return contextKey;
	}

	public void setContextKey(String contextKey) {
		this.contextKey = contextKey;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contextKey == null) ? 0 : contextKey.hashCode());
		result = prime * result + ((migrationId == null) ? 0 : migrationId.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((productVersion == null) ? 0 : productVersion.hashCode());
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
		if (contextKey == null) {
			if (other.contextKey != null)
				return false;
		} else if (!contextKey.equals(other.contextKey))
			return false;
		if (migrationId == null) {
			if (other.migrationId != null)
				return false;
		} else if (!migrationId.equals(other.migrationId))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (productVersion == null) {
			if (other.productVersion != null)
				return false;
		} else if (!productVersion.equals(other.productVersion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entity__MigrationHistory [migrationId=" + migrationId + ", contextKey=" + contextKey + ", model=" + model + ", productVersion=" + productVersion + "]";
	}

}
