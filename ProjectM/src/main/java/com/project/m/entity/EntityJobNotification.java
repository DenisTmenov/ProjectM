package com.project.m.entity;

import java.util.Date;

public class EntityJobNotification {
	private Integer id;
	private Integer jobId;
	private Integer notificationType;
	private Date sentDate;

	public EntityJobNotification() {
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

	public Integer getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(Integer notificationType) {
		this.notificationType = notificationType;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((notificationType == null) ? 0 : notificationType.hashCode());
		result = prime * result + ((sentDate == null) ? 0 : sentDate.hashCode());
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
		EntityJobNotification other = (EntityJobNotification) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (notificationType == null) {
			if (other.notificationType != null)
				return false;
		} else if (!notificationType.equals(other.notificationType))
			return false;
		if (sentDate == null) {
			if (other.sentDate != null)
				return false;
		} else if (!sentDate.equals(other.sentDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityJobNotification [id=" + id + ", jobId=" + jobId + ", notificationType=" + notificationType + ", sentDate=" + sentDate + "]";
	}

}