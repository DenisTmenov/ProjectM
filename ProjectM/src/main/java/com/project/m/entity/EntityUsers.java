package com.project.m.entity;

import java.util.Date;

public class EntityUsers {
	private Integer id;
	private String email;
	private String firstName;
	private String lastName;
	private Date createdDate;
	private Boolean notificationOptIn;
	private Boolean termsAgreed;
	private String photo;

	public EntityUsers() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Boolean getNotificationOptIn() {
		return notificationOptIn;
	}

	public void setNotificationOptIn(Boolean notificationOptIn) {
		this.notificationOptIn = notificationOptIn;
	}

	public Boolean getTermsAgreed() {
		return termsAgreed;
	}

	public void setTermsAgreed(Boolean termsAgreed) {
		this.termsAgreed = termsAgreed;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((notificationOptIn == null) ? 0 : notificationOptIn.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((termsAgreed == null) ? 0 : termsAgreed.hashCode());
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
		EntityUsers other = (EntityUsers) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (notificationOptIn == null) {
			if (other.notificationOptIn != null)
				return false;
		} else if (!notificationOptIn.equals(other.notificationOptIn))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (termsAgreed == null) {
			if (other.termsAgreed != null)
				return false;
		} else if (!termsAgreed.equals(other.termsAgreed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntityUsers [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", createdDate=" + createdDate + ", notificationOptIn=" + notificationOptIn + ", termsAgreed=" + termsAgreed + ", photo=" + photo
				+ "]";
	}

}