package com.studentapi.studentapi.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Students {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name="name")
private String name;
@Column(name="degreeName")
private String degreeName;
@Column(name="degreeType")
private String degreeType;
@Column(name="mobNo")
private String mobNo;
@Column(name="emailId")
private String emailId;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDegreeName() {
	return degreeName;
}
public void setDegreeName(String degreeName) {
	this.degreeName = degreeName;
}
public String getDegreeType() {
	return degreeType;
}
public void setDegreeType(String degreeType) {
	this.degreeType = degreeType;
}
public String getMobNo() {
	return mobNo;
}
public void setMobNo(String mobNo) {
	this.mobNo = mobNo;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}


}
