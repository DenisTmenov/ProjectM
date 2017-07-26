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
	private BigInteger messageCount;
	private BigInteger emailCount;
	private BigInteger calendarCount;
	private BigInteger taskCount;
	private BigInteger contactCount;
	private BigInteger otherCount;
	private String owner1;
	private String owner2;
	private String owner3;

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
		return messageCount;
	}

	public void setMessageCount(BigInteger messageCount) {
		this.messageCount = messageCount;
	}

	public BigInteger getEmailCount() {
		return emailCount;
	}

	public void setEmailCount(BigInteger emailCount) {
		this.emailCount = emailCount;
	}

	public BigInteger getCalendarCount() {
		return calendarCount;
	}

	public void setCalendarCount(BigInteger calendarCount) {
		this.calendarCount = calendarCount;
	}

	public BigInteger getTaskCount() {
		return taskCount;
	}

	public void setTaskCount(BigInteger taskCount) {
		this.taskCount = taskCount;
	}

	public BigInteger getContactCount() {
		return contactCount;
	}

	public void setContactCount(BigInteger contactCount) {
		this.contactCount = contactCount;
	}

	public BigInteger getOtherCount() {
		return otherCount;
	}

	public void setOtherCount(BigInteger otherCount) {
		this.otherCount = otherCount;
	}

	public String getOwner1() {
		return owner1;
	}

	public void setOwner1(String owner1) {
		this.owner1 = owner1;
	}

	public String getOwner2() {
		return owner2;
	}

	public void setOwner2(String owner2) {
		this.owner2 = owner2;
	}

	public String getOwner3() {
		return owner3;
	}

	public void setOwner3(String owner3) {
		this.owner3 = owner3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calendarCount == null) ? 0 : calendarCount.hashCode());
		result = prime * result + ((contactCount == null) ? 0 : contactCount.hashCode());
		result = prime * result + ((emailCount == null) ? 0 : emailCount.hashCode());
		result = prime * result + ((messageCount == null) ? 0 : messageCount.hashCode());
		result = prime * result + ((otherCount == null) ? 0 : otherCount.hashCode());
		result = prime * result + ((owner1 == null) ? 0 : owner1.hashCode());
		result = prime * result + ((owner2 == null) ? 0 : owner2.hashCode());
		result = prime * result + ((owner3 == null) ? 0 : owner3.hashCode());
		result = prime * result + ((taskCount == null) ? 0 : taskCount.hashCode());
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
		if (calendarCount == null) {
			if (other.calendarCount != null)
				return false;
		} else if (!calendarCount.equals(other.calendarCount))
			return false;
		if (contactCount == null) {
			if (other.contactCount != null)
				return false;
		} else if (!contactCount.equals(other.contactCount))
			return false;
		if (emailCount == null) {
			if (other.emailCount != null)
				return false;
		} else if (!emailCount.equals(other.emailCount))
			return false;
		if (messageCount == null) {
			if (other.messageCount != null)
				return false;
		} else if (!messageCount.equals(other.messageCount))
			return false;
		if (otherCount == null) {
			if (other.otherCount != null)
				return false;
		} else if (!otherCount.equals(other.otherCount))
			return false;
		if (owner1 == null) {
			if (other.owner1 != null)
				return false;
		} else if (!owner1.equals(other.owner1))
			return false;
		if (owner2 == null) {
			if (other.owner2 != null)
				return false;
		} else if (!owner2.equals(other.owner2))
			return false;
		if (owner3 == null) {
			if (other.owner3 != null)
				return false;
		} else if (!owner3.equals(other.owner3))
			return false;
		if (taskCount == null) {
			if (other.taskCount != null)
				return false;
		} else if (!taskCount.equals(other.taskCount))
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
				+ messageCount + ", EmailCount=" + emailCount + ", CalendarCount=" + calendarCount + ", TaskCount=" + taskCount + ", ContactCount=" + contactCount + ", OtherCount=" + otherCount + ", Owner1=" + owner1 + ", Owner2=" + owner2
				+ ", Owner3=" + owner3 + "]";
	}

}
