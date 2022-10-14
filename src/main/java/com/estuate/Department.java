package com.estuate;

public class Department {
	private  String departmentname;
	private int dept_id;
	private String project;
	private  int dept_size;
	public Department(String departmentname, int dept_id, String project, int dept_size) {
		super();
		this.departmentname = departmentname;
		this.dept_id = dept_id;
		this.project = project;
		this.dept_size = dept_size;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getDept_size() {
		return dept_size;
	}
	public void setDept_size(int dept_size) {
		this.dept_size = dept_size;
	}
	@Override
	public String toString() {
		
		return "Department "+"{ departmentname: "+departmentname+"\t" +"dept_id: " +dept_id+"\t"+"project: " +project +"\t"+"dept_size:" +dept_size+"}";
	}
	

}
