package com.project.m.entity;

import java.math.BigInteger;

public class EntityJobQueuesBak {
	private Integer entryId;
	private Integer jobId;
	private Integer itemStatus;
	private String mailbox;
	private String msgId;
	private BigInteger size;
	private String discriminator;
	private Integer failCount;
	private Boolean hashBytes;
	private String extraData;

	public EntityJobQueuesBak() {
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

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public BigInteger getSize() {
		return size;
	}

	public void setSize(BigInteger size) {
		this.size = size;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public Boolean getHashBytes() {
		return hashBytes;
	}

	public void setHashBytes(Boolean hashBytes) {
		this.hashBytes = hashBytes;
	}

	public String getExtraData() {
		return extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discriminator == null) ? 0 : discriminator.hashCode());
		result = prime * result + ((entryId == null) ? 0 : entryId.hashCode());
		result = prime * result + ((extraData == null) ? 0 : extraData.hashCode());
		result = prime * result + ((failCount == null) ? 0 : failCount.hashCode());
		result = prime * result + ((hashBytes == null) ? 0 : hashBytes.hashCode());
		result = prime * result + ((itemStatus == null) ? 0 : itemStatus.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((mailbox == null) ? 0 : mailbox.hashCode());
		result = prime * result + ((msgId == null) ? 0 : msgId.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		EntityJobQueuesBak other = (EntityJobQueuesBak) obj;
		if (discriminator == null) {
			if (other.discriminator != null)
				return false;
		} else if (!discriminator.equals(other.discriminator))
			return false;
		if (entryId == null) {
			if (other.entryId != null)
				return false;
		} else if (!entryId.equals(other.entryId))
			return false;
		if (extraData == null) {
			if (other.extraData != null)
				return false;
		} else if (!extraData.equals(other.extraData))
			return false;
		if (failCount == null) {
			if (other.failCount != null)
				return false;
		} else if (!failCount.equals(other.failCount))
			return false;
		if (hashBytes == null) {
			if (other.hashBytes != null)
				return false;
		} else if (!hashBytes.equals(other.hashBytes))
			return false;
		if (itemStatus == null) {
			if (other.itemStatus != null)
				return false;
		} else if (!itemStatus.equals(other.itemStatus))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (mailbox == null) {
			if (other.mailbox != null)
				return false;
		} else if (!mailbox.equals(other.mailbox))
			return false;
		if (msgId == null) {
			if (other.msgId != null)
				return false;
		} else if (!msgId.equals(other.msgId))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityJobQueuesBak [entryId=" + entryId + ", jobId=" + jobId + ", itemStatus=" + itemStatus + ", mailbox=" + mailbox + ", msgId=" + msgId + ", size=" + size + ", discriminator=" + discriminator + ", failCount=" + failCount
				+ ", hashBytes=" + hashBytes + ", extraData=" + extraData + "]";
	}

}