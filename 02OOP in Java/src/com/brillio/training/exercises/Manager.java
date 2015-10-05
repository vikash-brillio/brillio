package com.brillio.training.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee {

	private String currentProject;
	private String projectStartDate;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, String name, double salary, String currentProject, String projectStartDate) {
		super(id, name, salary);
		this.currentProject = currentProject;
		this.projectStartDate = projectStartDate;
	}

	public String getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}

	public Date getProjectStartDate() {
		return stringToDate(projectStartDate);
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	
	private static Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			return null;
		}
	}
}
