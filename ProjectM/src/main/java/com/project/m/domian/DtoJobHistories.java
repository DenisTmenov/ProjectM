package com.project.m.domian;

import java.math.BigInteger;
import java.util.Date;

import com.project.m.utils.SimpleBigIntegerProperty;
import com.project.m.utils.SimpleObject;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class DtoJobHistories {
	private Integer jobId;
	private Integer batchId;
	private String batchName;
	private String jobStatus;
	private Date statusDate;
	private String source;
	private String target;
	private String sourceMailbox;
	private String targetMailbox;
	private BigInteger itemsTotal;
	private BigInteger itemsFailed;
	private BigInteger itemsRemaining;
	private String statusMessage;

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

	public BigInteger getItemsTotal() {
		return itemsTotal;
	}

	public void setItemsTotal(BigInteger itemsTotal) {
		this.itemsTotal = itemsTotal;
	}

	public BigInteger getItemsFailed() {
		return itemsFailed;
	}

	public void setItemsFailed(BigInteger itemsFailed) {
		this.itemsFailed = itemsFailed;
	}

	public BigInteger getItemsRemaining() {
		return itemsRemaining;
	}

	public void setItemsRemaining(BigInteger itemsRemaining) {
		this.itemsRemaining = itemsRemaining;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
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

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	@Override
	public String toString() {
		return "DtoJobHistories [jobId=" + jobId + ", batchId=" + batchId + ", batchName=" + batchName + ", jobStatus=" + jobStatus + ", statusDate=" + statusDate + ", source=" + source + ", target=" + target + ", sourceMailbox=" + sourceMailbox
				+ ", targetMailbox=" + targetMailbox + ", itemsTotal=" + itemsTotal + ", itemsFailed=" + itemsFailed + ", itemsRemaining=" + itemsRemaining + ", statusMessage=" + statusMessage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + ((itemsFailed == null) ? 0 : itemsFailed.hashCode());
		result = prime * result + ((itemsRemaining == null) ? 0 : itemsRemaining.hashCode());
		result = prime * result + ((itemsTotal == null) ? 0 : itemsTotal.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((jobStatus == null) ? 0 : jobStatus.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((sourceMailbox == null) ? 0 : sourceMailbox.hashCode());
		result = prime * result + ((statusDate == null) ? 0 : statusDate.hashCode());
		result = prime * result + ((statusMessage == null) ? 0 : statusMessage.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		result = prime * result + ((targetMailbox == null) ? 0 : targetMailbox.hashCode());
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
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (jobStatus == null) {
			if (other.jobStatus != null)
				return false;
		} else if (!jobStatus.equals(other.jobStatus))
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
		return true;
	}

	public SimpleIntegerProperty getJobIdSimple() {
		SimpleIntegerProperty jobIdSimple = new SimpleIntegerProperty(getJobId());
		return jobIdSimple;
	}

	public SimpleStringProperty getJobStatusSimple() {
		SimpleStringProperty jobStatusSimple = new SimpleStringProperty(String.valueOf(getJobStatus()));
		jobStatusSimple = SimpleObject.convertNullToSpace(jobStatusSimple);
		return jobStatusSimple;
	}

	public SimpleBigIntegerProperty getItemsTotalSimple() {
		SimpleBigIntegerProperty itemsTotalSimple = new SimpleBigIntegerProperty(getItemsTotal());
		return itemsTotalSimple;
	}

	public SimpleBigIntegerProperty getItemsFailedSimple() {
		SimpleBigIntegerProperty itemsFailedSimple = new SimpleBigIntegerProperty(getItemsFailed());
		return itemsFailedSimple;
	}

	public SimpleBigIntegerProperty getItemsRemainingSimple() {
		SimpleBigIntegerProperty itemsRemainingSimple = new SimpleBigIntegerProperty(getItemsRemaining());
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

	public SimpleIntegerProperty getBatchIdSimple() {
		SimpleIntegerProperty batchIdSimple = new SimpleIntegerProperty(getBatchId());
		return batchIdSimple;
	}

	public SimpleStringProperty getStatusMessageSimple() {
		SimpleStringProperty statusMessageSimple = new SimpleStringProperty(String.valueOf(getStatusMessage()));
		statusMessageSimple = SimpleObject.convertNullToSpace(statusMessageSimple);
		return statusMessageSimple;
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

	public SimpleStringProperty getBatchNameSimple() {
		SimpleStringProperty batchNameSimple = new SimpleStringProperty(String.valueOf(getBatchName()));
		batchNameSimple = SimpleObject.convertNullToSpace(batchNameSimple);
		return batchNameSimple;
	}

}
