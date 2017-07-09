package com.project.m.domian;

import java.util.Date;

import com.project.m.utils.SimpleObject;

import javafx.beans.property.SimpleStringProperty;

public class DtoJobHistories {
	private Integer jobId;
	private String jobStatus;
	private Date timeStarted;
	private Date timeFinished;
	private String itemsTotal; // BigInteger
	private String itemsFailed; // BigInteger
	private String itemsRemaining; // BigInteger
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
	private String statusMessage;
	private Integer priority;
	private Integer percentComplete;
	private String sourceMailbox;
	private String targetMailbox;
	private Integer processingItems;
	private Date statusDate;
	private Integer rehydrationType;
	private String batchName;

	public DtoJobHistories() {
		super();
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
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

	public String getItemsTotal() {
		return itemsTotal;
	}

	public void setItemsTotal(String itemsTotal) {
		this.itemsTotal = itemsTotal;
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

	@Override
	public String toString() {
		return "DtoJobHistories [jobId=" + jobId + ", jobStatus=" + jobStatus + ", timeStarted=" + timeStarted
				+ ", timeFinished=" + timeFinished + ", itemsTotal=" + itemsTotal + ", itemsFailed=" + itemsFailed
				+ ", itemsRemaining=" + itemsRemaining + ", source=" + source + ", target=" + target + ", jobCreatedBy="
				+ jobCreatedBy + ", jobModifiedBy=" + jobModifiedBy + ", jobCreated=" + jobCreated + ", jobModified="
				+ jobModified + ", batchId=" + batchId + ", failedCount=" + failedCount + ", processingInBatch="
				+ processingInBatch + ", processingOnMachine=" + processingOnMachine + ", processingRate="
				+ processingRate + ", lastUpdate=" + lastUpdate + ", statusMessage=" + statusMessage + ", priority="
				+ priority + ", percentComplete=" + percentComplete + ", sourceMailbox=" + sourceMailbox
				+ ", targetMailbox=" + targetMailbox + ", processingItems=" + processingItems + ", statusDate="
				+ statusDate + ", rehydrationType=" + rehydrationType + ", batchName=" + batchName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + ((failedCount == null) ? 0 : failedCount.hashCode());
		result = prime * result + ((itemsFailed == null) ? 0 : itemsFailed.hashCode());
		result = prime * result + ((itemsRemaining == null) ? 0 : itemsRemaining.hashCode());
		result = prime * result + ((itemsTotal == null) ? 0 : itemsTotal.hashCode());
		result = prime * result + ((jobCreated == null) ? 0 : jobCreated.hashCode());
		result = prime * result + ((jobCreatedBy == null) ? 0 : jobCreatedBy.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((jobModified == null) ? 0 : jobModified.hashCode());
		result = prime * result + ((jobModifiedBy == null) ? 0 : jobModifiedBy.hashCode());
		result = prime * result + ((jobStatus == null) ? 0 : jobStatus.hashCode());
		result = prime * result + ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
		result = prime * result + ((percentComplete == null) ? 0 : percentComplete.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((processingInBatch == null) ? 0 : processingInBatch.hashCode());
		result = prime * result + ((processingItems == null) ? 0 : processingItems.hashCode());
		result = prime * result + ((processingOnMachine == null) ? 0 : processingOnMachine.hashCode());
		result = prime * result + ((processingRate == null) ? 0 : processingRate.hashCode());
		result = prime * result + ((rehydrationType == null) ? 0 : rehydrationType.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((sourceMailbox == null) ? 0 : sourceMailbox.hashCode());
		result = prime * result + ((statusDate == null) ? 0 : statusDate.hashCode());
		result = prime * result + ((statusMessage == null) ? 0 : statusMessage.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		result = prime * result + ((targetMailbox == null) ? 0 : targetMailbox.hashCode());
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
		DtoJobHistories other = (DtoJobHistories) obj;
		if (batchId == null) {
			if (other.batchId != null)
				return false;
		} else if (!batchId.equals(other.batchId))
			return false;
		if (batchName == null) {
			if (other.batchName != null)
				return false;
		} else if (!batchName.equals(other.batchName))
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
		if (itemsTotal == null) {
			if (other.itemsTotal != null)
				return false;
		} else if (!itemsTotal.equals(other.itemsTotal))
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

	public SimpleStringProperty getJobIdSimple() {
		SimpleStringProperty jobIdSimple = new SimpleStringProperty(String.valueOf(getJobId()));
		jobIdSimple = SimpleObject.convertNullToSpace(jobIdSimple);
		return jobIdSimple;
	}

	public SimpleStringProperty getJobStatusSimple() {
		SimpleStringProperty jobStatusSimple = new SimpleStringProperty(String.valueOf(getJobStatus()));
		jobStatusSimple = SimpleObject.convertNullToSpace(jobStatusSimple);
		return jobStatusSimple;
	}

	public SimpleStringProperty getTimeStartedSimple() {
		SimpleStringProperty timeStartedSimple = new SimpleStringProperty(String.valueOf(getTimeStarted()));
		timeStartedSimple = SimpleObject.convertNullToSpace(timeStartedSimple);
		return timeStartedSimple;
	}

	public SimpleStringProperty getTimeFinishedSimple() {
		SimpleStringProperty timeFinishedSimple = new SimpleStringProperty(String.valueOf(getTimeFinished()));
		timeFinishedSimple = SimpleObject.convertNullToSpace(timeFinishedSimple);
		return timeFinishedSimple;
	}

	public SimpleStringProperty getItemsTotalSimple() {
		SimpleStringProperty itemsTotalSimple = new SimpleStringProperty(String.valueOf(getItemsTotal()));
		itemsTotalSimple = SimpleObject.convertNullToSpace(itemsTotalSimple);
		return itemsTotalSimple;
	}

	public SimpleStringProperty getItemsFailedSimple() {
		SimpleStringProperty itemsFailedSimple = new SimpleStringProperty(String.valueOf(getItemsFailed()));
		itemsFailedSimple = SimpleObject.convertNullToSpace(itemsFailedSimple);
		return itemsFailedSimple;
	}

	public SimpleStringProperty getItemsRemainingSimple() {
		SimpleStringProperty itemsRemainingSimple = new SimpleStringProperty(String.valueOf(getItemsRemaining()));
		itemsRemainingSimple = SimpleObject.convertNullToSpace(itemsRemainingSimple);
		return itemsRemainingSimple;
	}

	public SimpleStringProperty getSourceSimple() {
		SimpleStringProperty sourceSimple = new SimpleStringProperty(String.valueOf(getSource()));
		sourceSimple = SimpleObject.convertNullToSpace(sourceSimple);
		return sourceSimple;
	}

	public SimpleStringProperty getTargetSimple() {
		SimpleStringProperty targetSimple = new SimpleStringProperty(String.valueOf(getTarget()));
		targetSimple = SimpleObject.convertNullToSpace(targetSimple);
		return targetSimple;
	}

	public SimpleStringProperty getJobCreatedBySimple() {
		SimpleStringProperty jobCreatedBySimple = new SimpleStringProperty(String.valueOf(getJobCreatedBy()));
		jobCreatedBySimple = SimpleObject.convertNullToSpace(jobCreatedBySimple);
		return jobCreatedBySimple;
	}

	public SimpleStringProperty getJobModifiedBySimple() {
		SimpleStringProperty jobModifiedBySimple = new SimpleStringProperty(String.valueOf(getJobModifiedBy()));
		jobModifiedBySimple = SimpleObject.convertNullToSpace(jobModifiedBySimple);
		return jobModifiedBySimple;
	}

	public SimpleStringProperty getJobCreatedSimple() {
		SimpleStringProperty jobCreatedSimple = new SimpleStringProperty(String.valueOf(getJobCreated()));
		jobCreatedSimple = SimpleObject.convertNullToSpace(jobCreatedSimple);
		return jobCreatedSimple;
	}

	public SimpleStringProperty getJobModifiedSimple() {
		SimpleStringProperty jobModifiedSimple = new SimpleStringProperty(String.valueOf(getJobModified()));
		jobModifiedSimple = SimpleObject.convertNullToSpace(jobModifiedSimple);
		return jobModifiedSimple;
	}

	public SimpleStringProperty getBatchIdSimple() {
		SimpleStringProperty batchIdSimple = new SimpleStringProperty(String.valueOf(getBatchId()));
		batchIdSimple = SimpleObject.convertNullToSpace(batchIdSimple);
		return batchIdSimple;
	}

	public SimpleStringProperty getFailedCountSimple() {
		SimpleStringProperty failedCountSimple = new SimpleStringProperty(String.valueOf(getFailedCount()));
		failedCountSimple = SimpleObject.convertNullToSpace(failedCountSimple);
		return failedCountSimple;
	}

	public SimpleStringProperty getProcessingInBatchSimple() {
		SimpleStringProperty processingInBatchSimple = new SimpleStringProperty(String.valueOf(getProcessingInBatch()));
		processingInBatchSimple = SimpleObject.convertNullToSpace(processingInBatchSimple);
		return processingInBatchSimple;
	}

	public SimpleStringProperty getProcessingOnMachineSimple() {
		SimpleStringProperty processingOnMachineSimple = new SimpleStringProperty(
				String.valueOf(getProcessingOnMachine()));
		processingOnMachineSimple = SimpleObject.convertNullToSpace(processingOnMachineSimple);
		return processingOnMachineSimple;
	}

	public SimpleStringProperty getProcessingRateSimple() {
		SimpleStringProperty processingRateSimple = new SimpleStringProperty(String.valueOf(getProcessingRate()));
		processingRateSimple = SimpleObject.convertNullToSpace(processingRateSimple);
		return processingRateSimple;
	}

	public SimpleStringProperty getLastUpdateSimple() {
		SimpleStringProperty lastUpdateSimple = new SimpleStringProperty(String.valueOf(getLastUpdate()));
		lastUpdateSimple = SimpleObject.convertNullToSpace(lastUpdateSimple);
		return lastUpdateSimple;
	}

	public SimpleStringProperty getStatusMessageSimple() {
		SimpleStringProperty statusMessageSimple = new SimpleStringProperty(String.valueOf(getStatusMessage()));
		statusMessageSimple = SimpleObject.convertNullToSpace(statusMessageSimple);
		return statusMessageSimple;
	}

	public SimpleStringProperty getPrioritySimple() {
		SimpleStringProperty prioritySimple = new SimpleStringProperty(String.valueOf(getPriority()));
		prioritySimple = SimpleObject.convertNullToSpace(prioritySimple);
		return prioritySimple;
	}

	public SimpleStringProperty getPercentCompleteSimple() {
		SimpleStringProperty percentCompleteSimple = new SimpleStringProperty(String.valueOf(getPercentComplete()));
		percentCompleteSimple = SimpleObject.convertNullToSpace(percentCompleteSimple);
		return percentCompleteSimple;
	}

	public SimpleStringProperty getSourceMailboxSimple() {
		SimpleStringProperty sourceMailboxSimple = new SimpleStringProperty(String.valueOf(getSourceMailbox()));
		sourceMailboxSimple = SimpleObject.convertNullToSpace(sourceMailboxSimple);
		return sourceMailboxSimple;
	}

	public SimpleStringProperty getTargetMailboxSimple() {
		SimpleStringProperty targetMailboxSimple = new SimpleStringProperty(String.valueOf(getTargetMailbox()));
		targetMailboxSimple = SimpleObject.convertNullToSpace(targetMailboxSimple);
		return targetMailboxSimple;
	}

	public SimpleStringProperty getProcessingItemsSimple() {
		SimpleStringProperty processingItemsSimple = new SimpleStringProperty(String.valueOf(getProcessingItems()));
		processingItemsSimple = SimpleObject.convertNullToSpace(processingItemsSimple);
		return processingItemsSimple;
	}

	public SimpleStringProperty getStatusDateSimple() {
		SimpleStringProperty statusDateSimple = new SimpleStringProperty(String.valueOf(getStatusDate()));
		statusDateSimple = SimpleObject.convertNullToSpace(statusDateSimple);
		return statusDateSimple;
	}

	public SimpleStringProperty getRehydrationTypeSimple() {
		SimpleStringProperty rehydrationTypeSimple = new SimpleStringProperty(String.valueOf(getRehydrationType()));
		rehydrationTypeSimple = SimpleObject.convertNullToSpace(rehydrationTypeSimple);
		return rehydrationTypeSimple;
	}
	
	public SimpleStringProperty getBatchNameSimple() {
		SimpleStringProperty batchNameSimple = new SimpleStringProperty(String.valueOf(getBatchName()));
		batchNameSimple = SimpleObject.convertNullToSpace(batchNameSimple);
		return batchNameSimple;
	}

}
