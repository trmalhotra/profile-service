package com.ventura.profile.model;

import java.util.List;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profile")
public class Profile {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNumber;
	private String title;
	private Float numberOfYearsExp;
	private String profileSummary;
	private List<String> primarySkills;
	private List<String> secondarySkills;
	private Binary resume;
	private Boolean isActive;

	public Profile() {
	}

	public Profile(String id, String firstName, String lastName, String emailId, String phoneNumber, String title,
			Float numberOfYearsExp, String profileSummary, List<String> primarySkills, List<String> secondarySkills,
			Binary resume, Boolean isActive) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.title = title;
		this.numberOfYearsExp = numberOfYearsExp;
		this.profileSummary = profileSummary;
		this.primarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.resume = resume;
		this.isActive = isActive;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getNumberOfYearsExp() {
		return numberOfYearsExp;
	}

	public void setNumberOfYearsExp(Float numberOfYearsExp) {
		this.numberOfYearsExp = numberOfYearsExp;
	}

	public String getProfileSummary() {
		return profileSummary;
	}

	public void setProfileSummary(String profileSummary) {
		this.profileSummary = profileSummary;
	}

	public List<String> getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(List<String> primarySkills) {
		this.primarySkills = primarySkills;
	}

	public List<String> getSecondarySkills() {
		return secondarySkills;
	}

	public void setSecondarySkills(List<String> secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	public Binary getResume() {
		return resume;
	}

	public void setResume(Binary resume) {
		this.resume = resume;
	}

}
