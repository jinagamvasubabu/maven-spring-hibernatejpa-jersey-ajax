/**
 * 
 */
package com.rzt.human.Domain;

/**
 * @author vasu
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Human", uniqueConstraints = {
		@UniqueConstraint(columnNames = "Name"),
		@UniqueConstraint(columnNames = "Aadhar") })
public class Human implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5353291512425179463L;
	
	private Integer humanId;
	private String Name;
	private String Aadhar;

	public Human() {
	}

	public Human(String Name, String Aadhar) {
		this.Name = Name;
		this.Aadhar = Aadhar;
	}

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "humanId", unique = true, nullable = false)
	public Integer getHumanId() {
		return this.humanId;
	}

	public void setHumanId(Integer humanId) {
		this.humanId = humanId;
	}

	@Column(name = "name", unique = true, nullable = false, length = 10)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Column(name = "Aadhar", unique = true, nullable = false, length = 20)
	public String getAadhar() {
		return Aadhar;
	}

	public void setAadhar(String aadhar) {
		Aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Human [HumanId=" + this.humanId + ", Name=" + this.Name
				+ ", Aadhar=" + this.Aadhar + "]";
	}
	
	

}
