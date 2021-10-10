 package com.example.retsservice.fullstack.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table")
public class Todo {
	
@Id	
@GeneratedValue
private Long id;
private String username;
private String Description;
private Date targetDate;
private boolean isDone;

protected Todo() {}

public Todo(long id, String username, String description, Date targetDate, boolean isDone) {
	this.id = id;
	this.username = username;
	Description = description;
	this.targetDate = targetDate;
	this.isDone = isDone;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public Date getTargetDate() {
	return targetDate;
}
public void setTargetDate(Date targetDate) {
	this.targetDate = targetDate;
}
public boolean isDone() {
	return isDone;
}
public void setDone(boolean isDone) {
	this.isDone = isDone;
}

@Override
public String toString() {
	return "Todo [id=" + id + ", username=" + username + ", Description=" + Description + ", targetDate=" + targetDate
			+ ", isDone=" + isDone + "]";
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Todo other = (Todo) obj;
	return id == other.id;
}


}
