package com.brainmentors.todo.dto;

import java.io.Serializable;
import java.util.Date;

import com.brainmentors.todo.utils.Constants;

public class ToDoDTO implements Constants, Serializable {
	private String name;
	private String desc;
	private String status;
	private Date date;
	
	public ToDoDTO(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
		this.status = NEW;
		this.date = new Date();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ToDoDTO [name=" + name + ", desc=" + desc + ", status=" + status + ", date=" + date + "]";
	}
	
	
	
}
