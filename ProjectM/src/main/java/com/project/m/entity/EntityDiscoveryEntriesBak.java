package com.project.m.entity;

import java.math.BigInteger;
import java.util.Date;

public class EntityDiscoveryEntriesBak {

	private Integer id;
	private Integer discoveryJobId;
	private Date discoveryDate;
	private String path;
	private BigInteger size;
	private String name;
	private BigInteger folderCount;
	private BigInteger MessageCount;
	private BigInteger EmailCount;
	private BigInteger CalendarCount;
	private BigInteger TaskCount;
	private BigInteger ContactCount;
	private BigInteger OtherCount;
	private String Owner1;
	private String Owner2;
	private String Owner3;

	public EntityDiscoveryEntriesBak() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDiscoveryJobId() {
		return discoveryJobId;
	}

	public void setDiscoveryJobId(Integer discoveryJobId) {
		this.discoveryJobId = discoveryJobId;
	}

	public Date getDiscoveryDate() {
		return discoveryDate;
	}

	public void setDiscoveryDate(Date discoveryDate) {
		this.discoveryDate = discoveryDate;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public BigInteger getSize() {
		return size;
	}

	public void setSize(BigInteger size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getFolderCount() {
		return folderCount;
	}

	public void setFolderCount(BigInteger folderCount) {
		this.folderCount = folderCount;
	}

	public BigInteger getMessageCount() {
		return MessageCount;
	}

	public void setMessageCount(BigInteger messageCount) {
		MessageCount = messageCount;
	}

	public BigInteger getEmailCount() {
		return EmailCount;
	}

	public void setEmailCount(BigInteger emailCount) {
		EmailCount = emailCount;
	}

	public BigInteger getCalendarCount() {
		return CalendarCount;
	}

	public void setCalendarCount(BigInteger calendarCount) {
		CalendarCount = calendarCount;
	}

	public BigInteger getTaskCount() {
		return TaskCount;
	}

	public void setTaskCount(BigInteger taskCount) {
		TaskCount = taskCount;
	}

	public BigInteger getContactCount() {
		return ContactCount;
	}

	public void setContactCount(BigInteger contactCount) {
		ContactCount = contactCount;
	}

	public BigInteger getOtherCount() {
		return OtherCount;
	}

	public void setOtherCount(BigInteger otherCount) {
		OtherCount = otherCount;
	}

	public String getOwner1() {
		return Owner1;
	}

	public void setOwner1(String owner1) {
		Owner1 = owner1;
	}

	public String getOwner2() {
		return Owner2;
	}

	public void setOwner2(String owner2) {
		Owner2 = owner2;
	}

	public String getOwner3() {
		return Owner3;
	}

	public void setOwner3(String owner3) {
		Owner3 = owner3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CalendarCount == null) ? 0 : CalendarCount.hashCode());
		result = prime * result + ((ContactCount == null) ? 0 : ContactCount.hashCode());
		result = prime * result + ((EmailCount == null) ? 0 : EmailCount.hashCode());
		result = prime * result + ((MessageCount == null) ? 0 : MessageCount.hashCode());
		result = prime * result + ((OtherCount == null) ? 0 : OtherCount.hashCode());
		result = prime * result + ((Owner1 == null) ? 0 : Owner1.hashCode());
		result = prime * result + ((Owner2 == null) ? 0 : Owner2.hashCode());
		result = prime * result + ((Owner3 == null) ? 0 : Owner3.hashCode());
		result = prime * result + ((TaskCount == null) ? 0 : TaskCount.hashCode());
		result = prime * result + ((discoveryDate == null) ? 0 : discoveryDate.hashCode());
		result = prime * result + ((discoveryJobId == null) ? 0 : discoveryJobId.hashCode());
		result = prime * result + ((folderCount == null) ? 0 : folderCount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		EntityDiscoveryEntriesBak other = (EntityDiscoveryEntriesBak) obj;
		if (CalendarCount == null) {
			if (other.CalendarCount != null)
				return false;
		} else if (!CalendarCount.equals(other.CalendarCount))
			return false;
		if (ContactCount == null) {
			if (other.ContactCount != null)
				return false;
		} else if (!ContactCount.equals(other.ContactCount))
			return false;
		if (EmailCount == null) {
			if (other.EmailCount != null)
				return false;
		} else if (!EmailCount.equals(other.EmailCount))
			return false;
		if (MessageCount == null) {
			if (other.MessageCount != null)
				return false;
		} else if (!MessageCount.equals(other.MessageCount))
			return false;
		if (OtherCount == null) {
			if (other.OtherCount != null)
				return false;
		} else if (!OtherCount.equals(other.OtherCount))
			return false;
		if (Owner1 == null) {
			if (other.Owner1 != null)
				return false;
		} else if (!Owner1.equals(other.Owner1))
			return false;
		if (Owner2 == null) {
			if (other.Owner2 != null)
				return false;
		} else if (!Owner2.equals(other.Owner2))
			return false;
		if (Owner3 == null) {
			if (other.Owner3 != null)
				return false;
		} else if (!Owner3.equals(other.Owner3))
			return false;
		if (TaskCount == null) {
			if (other.TaskCount != null)
				return false;
		} else if (!TaskCount.equals(other.TaskCount))
			return false;
		if (discoveryDate == null) {
			if (other.discoveryDate != null)
				return false;
		} else if (!discoveryDate.equals(other.discoveryDate))
			return false;
		if (discoveryJobId == null) {
			if (other.discoveryJobId != null)
				return false;
		} else if (!discoveryJobId.equals(other.discoveryJobId))
			return false;
		if (folderCount == null) {
			if (other.folderCount != null)
				return false;
		} else if (!folderCount.equals(other.folderCount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
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
		return "EntityDiscoveryEntriesBak [id=" + id + ", discoveryJobId=" + discoveryJobId + ", discoveryDate=" + discoveryDate + ", path=" + path + ", size=" + size + ", name=" + name + ", folderCount=" + folderCount + ", MessageCount="
				+ MessageCount + ", EmailCount=" + EmailCount + ", CalendarCount=" + CalendarCount + ", TaskCount=" + TaskCount + ", ContactCount=" + ContactCount + ", OtherCount=" + OtherCount + ", Owner1=" + Owner1 + ", Owner2=" + Owner2
				+ ", Owner3=" + Owner3 + "]";
	}

}
