package com.project.m.entity;

import java.util.Date;

import javafx.beans.property.SimpleStringProperty;

public class DboJobHistoriesEntity {
	private Integer jobId;
	private Integer jobStatus;
	private Date timeStarted;
	private Date timeFinished;
	private String targetType;
	private String sourceType;
	private Date dateFrom;
	private Date dateTo;
	private String ItemsTotal; // BigInteger
	private String itemsFailed; // BigInteger
	private String itemsRemaining; // BigInteger
	private String sMVersion;
	private Integer source;
	private Integer target;
	private String jobCreatedBy;
	private String jobModifiedBy;
	private Date jobCreated;
	private Date jobModified;
	private Integer batchId;
	private Integer failedCount;
	private Integer processingInBatch;
	private String processingOnMachine;
	private Integer processingRate;
	private Date lastUpdate;
	private String config;
	private String statusMessage;
	private Integer priority;
	private Integer percentComplete;
	private String sourceMailbox;
	private String targetMailbox;
	private Integer processingItems;
	private Date statusDate;
	private Integer rehydrationType;
	private Integer ownerId;

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

	public Date getTimeStarted() {
		return timeStarted;
	}

	public void setTimeStarted(Date timeStarted) {
		this.timeStarted = timeStarted;
	}

	public Date getTimeFinished() {
		return timeFinished;
	}

	public void setTimeFinished(Date timeFinished) {
		this.timeFinished = timeFinished;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getItemsTotal() {
		return ItemsTotal;
	}

	public void setItemsTotal(String itemsTotal) {
		ItemsTotal = itemsTotal;
	}

	public String getItemsFailed() {
		return itemsFailed;
	}

	public void setItemsFailed(String itemsFailed) {
		this.itemsFailed = itemsFailed;
	}

	public String getItemsRemaining() {
		return itemsRemaining;
	}

	public void setItemsRemaining(String itemsRemaining) {
		this.itemsRemaining = itemsRemaining;
	}

	public String getSMVersion() {
		return sMVersion;
	}

	public void setSMVersion(String sMVersion) {
		this.sMVersion = sMVersion;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public String getJobCreatedBy() {
		return jobCreatedBy;
	}

	public void setJobCreatedBy(String jobCreatedBy) {
		this.jobCreatedBy = jobCreatedBy;
	}

	public String getJobModifiedBy() {
		return jobModifiedBy;
	}

	public void setJobModifiedBy(String jobModifiedBy) {
		this.jobModifiedBy = jobModifiedBy;
	}

	public Date getJobCreated() {
		return jobCreated;
	}

	public void setJobCreated(Date jobCreated) {
		this.jobCreated = jobCreated;
	}

	public Date getJobModified() {
		return jobModified;
	}

	public void setJobModified(Date jobModified) {
		this.jobModified = jobModified;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public Integer getFailedCount() {
		return failedCount;
	}

	public void setFailedCount(Integer failedCount) {
		this.failedCount = failedCount;
	}

	public Integer getProcessingInBatch() {
		return processingInBatch;
	}

	public void setProcessingInBatch(Integer processingInBatch) {
		this.processingInBatch = processingInBatch;
	}

	public String getProcessingOnMachine() {
		return processingOnMachine;
	}

	public void setProcessingOnMachine(String processingOnMachine) {
		this.processingOnMachine = processingOnMachine;
	}

	public Integer getProcessingRate() {
		return processingRate;
	}

	public void setProcessingRate(Integer processingRate) {
		this.processingRate = processingRate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getPercentComplete() {
		return percentComplete;
	}

	public void setPercentComplete(Integer percentComplete) {
		this.percentComplete = percentComplete;
	}

	public String getSourceMailbox() {
		return sourceMailbox;
	}

	public void setSourceMailbox(String sourceMailbox) {
		this.sourceMailbox = sourceMailbox;
	}

	public String getTargetMailbox() {
		return targetMailbox;
	}

	public void setTargetMailbox(String targetMailbox) {
		this.targetMailbox = targetMailbox;
	}

	public Integer getProcessingItems() {
		return processingItems;
	}

	public void setProcessingItems(Integer processingItems) {
		this.processingItems = processingItems;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Integer getRehydrationType() {
		return rehydrationType;
	}

	public void setRehydrationType(Integer rehydrationType) {
		this.rehydrationType = rehydrationType;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ItemsTotal == null) ? 0 : ItemsTotal.hashCode());
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + ((config == null) ? 0 : config.hashCode());
		result = prime * result + ((dateFrom == null) ? 0 : dateFrom.hashCode());
		result = prime * result + ((dateTo == null) ? 0 : dateTo.hashCode());
		result = prime * result + ((failedCount == null) ? 0 : failedCount.hashCode());
		result = prime * result + ((itemsFailed == null) ? 0 : itemsFailed.hashCode());
		result = prime * result + ((itemsRemaining == null) ? 0 : itemsRemaining.hashCode());
		result = prime * result + ((jobCreated == null) ? 0 : jobCreated.hashCode());
		result = prime * result + ((jobCreatedBy == null) ? 0 : jobCreatedBy.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((jobModified == null) ? 0 : jobModified.hashCode());
		result = prime * result + ((jobModifiedBy == null) ? 0 : jobModifiedBy.hashCode());
		result = prime * result + ((jobStatus == null) ? 0 : jobStatus.hashCode());
		result = prime * result + ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
		result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
		result = prime * result + ((percentComplete == null) ? 0 : percentComplete.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((processingInBatch == null) ? 0 : processingInBatch.hashCode());
		result = prime * result + ((processingItems == null) ? 0 : processingItems.hashCode());
		result = prime * result + ((processingOnMachine == null) ? 0 : processingOnMachine.hashCode());
		result = prime * result + ((processingRate == null) ? 0 : processingRate.hashCode());
		result = prime * result + ((rehydrationType == null) ? 0 : rehydrationType.hashCode());
		result = prime * result + ((sMVersion == null) ? 0 : sMVersion.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((sourceMailbox == null) ? 0 : sourceMailbox.hashCode());
		result = prime * result + ((sourceType == null) ? 0 : sourceType.hashCode());
		result = prime * result + ((statusDate == null) ? 0 : statusDate.hashCode());
		result = prime * result + ((statusMessage == null) ? 0 : statusMessage.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		result = prime * result + ((targetMailbox == null) ? 0 : targetMailbox.hashCode());
		result = prime * result + ((targetType == null) ? 0 : targetType.hashCode());
		result = prime * result + ((timeFinished == null) ? 0 : timeFinished.hashCode());
		result = prime * result + ((timeStarted == null) ? 0 : timeStarted.hashCode());
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
		DboJobHistoriesEntity other = (DboJobHistoriesEntity) obj;
		if (ItemsTotal == null) {
			if (other.ItemsTotal != null)
				return false;
		} else if (!ItemsTotal.equals(other.ItemsTotal))
			return false;
		if (batchId == null) {
			if (other.batchId != null)
				return false;
		} else if (!batchId.equals(other.batchId))
			return false;
		if (config == null) {
			if (other.config != null)
				return false;
		} else if (!config.equals(other.config))
			return false;
		if (dateFrom == null) {
			if (other.dateFrom != null)
				return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		if (dateTo == null) {
			if (other.dateTo != null)
				return false;
		} else if (!dateTo.equals(other.dateTo))
			return false;
		if (failedCount == null) {
			if (other.failedCount != null)
				return false;
		} else if (!failedCount.equals(other.failedCount))
			return false;
		if (itemsFailed == null) {
			if (other.itemsFailed != null)
				return false;
		} else if (!itemsFailed.equals(other.itemsFailed))
			return false;
		if (itemsRemaining == null) {
			if (other.itemsRemaining != null)
				return false;
		} else if (!itemsRemaining.equals(other.itemsRemaining))
			return false;
		if (jobCreated == null) {
			if (other.jobCreated != null)
				return false;
		} else if (!jobCreated.equals(other.jobCreated))
			return false;
		if (jobCreatedBy == null) {
			if (other.jobCreatedBy != null)
				return false;
		} else if (!jobCreatedBy.equals(other.jobCreatedBy))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (jobModified == null) {
			if (other.jobModified != null)
				return false;
		} else if (!jobModified.equals(other.jobModified))
			return false;
		if (jobModifiedBy == null) {
			if (other.jobModifiedBy != null)
				return false;
		} else if (!jobModifiedBy.equals(other.jobModifiedBy))
			return false;
		if (jobStatus == null) {
			if (other.jobStatus != null)
				return false;
		} else if (!jobStatus.equals(other.jobStatus))
			return false;
		if (lastUpdate == null) {
			if (other.lastUpdate != null)
				return false;
		} else if (!lastUpdate.equals(other.lastUpdate))
			return false;
		if (ownerId == null) {
			if (other.ownerId != null)
				return false;
		} else if (!ownerId.equals(other.ownerId))
			return false;
		if (percentComplete == null) {
			if (other.percentComplete != null)
				return false;
		} else if (!percentComplete.equals(other.percentComplete))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (processingInBatch == null) {
			if (other.processingInBatch != null)
				return false;
		} else if (!processingInBatch.equals(other.processingInBatch))
			return false;
		if (processingItems == null) {
			if (other.processingItems != null)
				return false;
		} else if (!processingItems.equals(other.processingItems))
			return false;
		if (processingOnMachine == null) {
			if (other.processingOnMachine != null)
				return false;
		} else if (!processingOnMachine.equals(other.processingOnMachine))
			return false;
		if (processingRate == null) {
			if (other.processingRate != null)
				return false;
		} else if (!processingRate.equals(other.processingRate))
			return false;
		if (rehydrationType == null) {
			if (other.rehydrationType != null)
				return false;
		} else if (!rehydrationType.equals(other.rehydrationType))
			return false;
		if (sMVersion == null) {
			if (other.sMVersion != null)
				return false;
		} else if (!sMVersion.equals(other.sMVersion))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (sourceMailbox == null) {
			if (other.sourceMailbox != null)
				return false;
		} else if (!sourceMailbox.equals(other.sourceMailbox))
			return false;
		if (sourceType == null) {
			if (other.sourceType != null)
				return false;
		} else if (!sourceType.equals(other.sourceType))
			return false;
		if (statusDate == null) {
			if (other.statusDate != null)
				return false;
		} else if (!statusDate.equals(other.statusDate))
			return false;
		if (statusMessage == null) {
			if (other.statusMessage != null)
				return false;
		} else if (!statusMessage.equals(other.statusMessage))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		if (targetMailbox == null) {
			if (other.targetMailbox != null)
				return false;
		} else if (!targetMailbox.equals(other.targetMailbox))
			return false;
		if (targetType == null) {
			if (other.targetType != null)
				return false;
		} else if (!targetType.equals(other.targetType))
			return false;
		if (timeFinished == null) {
			if (other.timeFinished != null)
				return false;
		} else if (!timeFinished.equals(other.timeFinished))
			return false;
		if (timeStarted == null) {
			if (other.timeStarted != null)
				return false;
		} else if (!timeStarted.equals(other.timeStarted))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DboJobHistoriesEntity [jobId=" + jobId + ", jobStatus=" + jobStatus + ", timeStarted=" + timeStarted
				+ ", timeFinished=" + timeFinished + ", targetType=" + targetType + ", sourceType=" + sourceType
				+ ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", ItemsTotal=" + ItemsTotal + ", itemsFailed="
				+ itemsFailed + ", itemsRemaining=" + itemsRemaining + ", sMVersion=" + sMVersion + ", source=" + source
				+ ", target=" + target + ", jobCreatedBy=" + jobCreatedBy + ", jobModifiedBy=" + jobModifiedBy
				+ ", jobCreated=" + jobCreated + ", jobModified=" + jobModified + ", batchId=" + batchId
				+ ", failedCount=" + failedCount + ", processingInBatch=" + processingInBatch + ", processingOnMachine="
				+ processingOnMachine + ", processingRate=" + processingRate + ", lastUpdate=" + lastUpdate
				+ ", config=" + config + ", statusMessage=" + statusMessage + ", priority=" + priority
				+ ", percentComplete=" + percentComplete + ", sourceMailbox=" + sourceMailbox + ", targetMailbox="
				+ targetMailbox + ", processingItems=" + processingItems + ", statusDate=" + statusDate
				+ ", rehydrationType=" + rehydrationType + ", ownerId=" + ownerId + "]";
	}

	public SimpleStringProperty getJobIdSimple() {
		SimpleStringProperty jobIdSimple = new SimpleStringProperty(String.valueOf(getJobId()));
		return jobIdSimple;
	}

	public SimpleStringProperty getJobStatusSimple() {
		SimpleStringProperty jobStatusSimple = new SimpleStringProperty(String.valueOf(getJobStatus()));
		return jobStatusSimple;
	}

	public SimpleStringProperty getTimeStartedSimple() {
		SimpleStringProperty timeStartedSimple = new SimpleStringProperty(String.valueOf(getTimeStarted()));
		return timeStartedSimple;
	}

	public SimpleStringProperty getTimeFinishedSimple() {
		SimpleStringProperty timeFinishedSimple = new SimpleStringProperty(String.valueOf(getTimeFinished()));
		return timeFinishedSimple;
	}

	public SimpleStringProperty getTargetTypeSimple() {
		SimpleStringProperty targetTypeSimple = new SimpleStringProperty(String.valueOf(getTargetType()));
		return targetTypeSimple;
	}

	public SimpleStringProperty getSourceTypeSimple() {
		SimpleStringProperty sourceTypeSimple = new SimpleStringProperty(String.valueOf(getSourceType()));
		return sourceTypeSimple;
	}

	public SimpleStringProperty getDateFromSimple() {
		SimpleStringProperty dateFromSimple = new SimpleStringProperty(String.valueOf(getDateFrom()));
		return dateFromSimple;
	}

	public SimpleStringProperty getDateToSimple() {
		SimpleStringProperty dateToSimple = new SimpleStringProperty(String.valueOf(getDateTo()));
		return dateToSimple;
	}

	public SimpleStringProperty getItemsTotalSimple() {
		SimpleStringProperty ItemsTotalSimple = new SimpleStringProperty(String.valueOf(getItemsTotal()));
		return ItemsTotalSimple;
	}

	public SimpleStringProperty getItemsFailedSimple() {
		SimpleStringProperty itemsFailedSimple = new SimpleStringProperty(String.valueOf(getItemsFailed()));
		return itemsFailedSimple;
	}

	public SimpleStringProperty getItemsRemainingSimple() {
		SimpleStringProperty itemsRemainingSimple = new SimpleStringProperty(String.valueOf(getItemsRemaining()));
		return itemsRemainingSimple;
	}

	public SimpleStringProperty getSMVersionSimple() {
		SimpleStringProperty sMVersionSimple = new SimpleStringProperty(String.valueOf(getSMVersion()));
		return sMVersionSimple;
	}

	public SimpleStringProperty getSourceSimple() {
		SimpleStringProperty sourceSimple = new SimpleStringProperty(String.valueOf(getSource()));
		return sourceSimple;
	}

	public SimpleStringProperty getTargetSimple() {
		SimpleStringProperty targetSimple = new SimpleStringProperty(String.valueOf(getTarget()));
		return targetSimple;
	}

	public SimpleStringProperty getJobCreatedBySimple() {
		SimpleStringProperty jobCreatedBySimple = new SimpleStringProperty(String.valueOf(getJobCreatedBy()));
		return jobCreatedBySimple;
	}

	public SimpleStringProperty getJobModifiedBySimple() {
		SimpleStringProperty jobModifiedBySimple = new SimpleStringProperty(String.valueOf(getJobModifiedBy()));
		return jobModifiedBySimple;
	}

	public SimpleStringProperty getJobCreatedSimple() {
		SimpleStringProperty jobCreatedSimple = new SimpleStringProperty(String.valueOf(getJobCreated()));
		return jobCreatedSimple;
	}

	public SimpleStringProperty getJobModifiedSimple() {
		SimpleStringProperty jobModifiedSimple = new SimpleStringProperty(String.valueOf(getJobModified()));
		return jobModifiedSimple;
	}

	public SimpleStringProperty getBatchIdSimple() {
		SimpleStringProperty batchIdSimple = new SimpleStringProperty(String.valueOf(getBatchId()));
		return batchIdSimple;
	}

	public SimpleStringProperty getFailedCountSimple() {
		SimpleStringProperty failedCountSimple = new SimpleStringProperty(String.valueOf(getFailedCount()));
		return failedCountSimple;
	}

	public SimpleStringProperty getProcessingInBatchSimple() {
		SimpleStringProperty processingInBatchSimple = new SimpleStringProperty(String.valueOf(getProcessingInBatch()));
		return processingInBatchSimple;
	}

	public SimpleStringProperty getProcessingOnMachineSimple() {
		SimpleStringProperty processingOnMachineSimple = new SimpleStringProperty(
				String.valueOf(getProcessingOnMachine()));
		return processingOnMachineSimple;
	}

	public SimpleStringProperty getProcessingRateSimple() {
		SimpleStringProperty processingRateSimple = new SimpleStringProperty(String.valueOf(getProcessingRate()));
		return processingRateSimple;
	}

	public SimpleStringProperty getLastUpdateSimple() {
		SimpleStringProperty lastUpdateSimple = new SimpleStringProperty(String.valueOf(getLastUpdate()));
		return lastUpdateSimple;
	}

	public SimpleStringProperty getConfigSimple() {
		SimpleStringProperty configSimple = new SimpleStringProperty(String.valueOf(getConfig()));
		return configSimple;
	}

	public SimpleStringProperty getStatusMessageSimple() {
		SimpleStringProperty statusMessageSimple = new SimpleStringProperty(String.valueOf(getStatusMessage()));
		return statusMessageSimple;
	}

	public SimpleStringProperty getPrioritySimple() {
		SimpleStringProperty prioritySimple = new SimpleStringProperty(String.valueOf(getPriority()));
		return prioritySimple;
	}

	public SimpleStringProperty getPercentCompleteSimple() {
		SimpleStringProperty percentCompleteSimple = new SimpleStringProperty(String.valueOf(getPercentComplete()));
		return percentCompleteSimple;
	}

	public SimpleStringProperty getSourceMailboxSimple() {
		SimpleStringProperty sourceMailboxSimple = new SimpleStringProperty(String.valueOf(getSourceMailbox()));
		return sourceMailboxSimple;
	}

	public SimpleStringProperty getTargetMailboxSimple() {
		SimpleStringProperty targetMailboxSimple = new SimpleStringProperty(String.valueOf(getTargetMailbox()));
		return targetMailboxSimple;
	}

	public SimpleStringProperty getProcessingItemsSimple() {
		SimpleStringProperty processingItemsSimple = new SimpleStringProperty(String.valueOf(getProcessingItems()));
		return processingItemsSimple;
	}

	public SimpleStringProperty getStatusDateSimple() {
		SimpleStringProperty statusDateSimple = new SimpleStringProperty(String.valueOf(getStatusDate()));
		return statusDateSimple;
	}

	public SimpleStringProperty getRehydrationTypeSimple() {
		SimpleStringProperty rehydrationTypeSimple = new SimpleStringProperty(String.valueOf(getRehydrationType()));
		return rehydrationTypeSimple;
	}

	public SimpleStringProperty getOwnerIdSimple() {
		SimpleStringProperty ownerIdSimple = new SimpleStringProperty(String.valueOf(getOwnerId()));
		return ownerIdSimple;
	}

}
