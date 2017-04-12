package com.ddworld.todo.beans;

import org.springframework.data.annotation.Id;


public class Task {
	
	@Id
	private String id;
	private String taskDesc;
	private String taskNote;
	private String owner;
	private String status;
	
	private String plannedStartDt;
	private String plannedEndDt;
	private String actualStartDt;
	private String actualEndDt;
	
	private String priority;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskNote() {
		return taskNote;
	}

	public void setTaskNote(String taskNote) {
		this.taskNote = taskNote;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlannedStartDt() {
		return plannedStartDt;
	}

	public void setPlannedStartDt(String plannedStartDt) {
		this.plannedStartDt = plannedStartDt;
	}

	public String getPlannedEndDt() {
		return plannedEndDt;
	}

	public void setPlannedEndDt(String plannedEndDt) {
		this.plannedEndDt = plannedEndDt;
	}

	public String getActualStartDt() {
		return actualStartDt;
	}

	public void setActualStartDt(String actualStartDt) {
		this.actualStartDt = actualStartDt;
	}

	public String getActualEndDt() {
		return actualEndDt;
	}

	public void setActualEndDt(String actualEndDt) {
		this.actualEndDt = actualEndDt;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	
}
