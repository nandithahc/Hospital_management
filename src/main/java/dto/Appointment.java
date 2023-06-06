package dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
LocalDateTime datetime;
String problems;
@ManyToOne
Doctor doctor;
@ManyToOne
Patient patient;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDateTime getDatetime() {
	return datetime;
}
public void setDatetime(LocalDateTime datetime) {
	this.datetime = datetime;
}
public String getProblems() {
	return problems;
}
public void setProblems(String problems) {
	this.problems = problems;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
public Patient getPatient() {
	return patient;
}
public void setPatient(Patient patient) {
	this.patient = patient;
}

}
