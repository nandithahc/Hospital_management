package dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
Date dob;
int age;
long mobile;
byte[] picture;
@OneToMany
List<Appointment>list;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public byte[] getPicture() {
	return picture;
}
public void setPicture(byte[] picture) {
	this.picture = picture;
}
public List<Appointment> getList() {
	return list;
}
public void setList(List<Appointment> list) {
	this.list = list;
}


}
