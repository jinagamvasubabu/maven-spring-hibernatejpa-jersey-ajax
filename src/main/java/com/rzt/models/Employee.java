/**
 * 
 */
package com.rzt.models;

/**
 * @author vasu
 *
 */
public class Employee {

	private int id;
	private String name;
	private String skills;
	
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
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", skills="+this.skills+"]";
	}
 
	
}
