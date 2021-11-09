package EMS.EMS_springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "employees")
public class Employee {

	private long id;
  @NotNull
	private String firstName;
   @NotNull
	private String lastName;
  @Email
   @NotNull
	private String emailId;
   @NotNull
	private String dept;
   @NotNull
	private String designation;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId,String dept,String designation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.dept=dept;
		this.designation=designation;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Column(name = "dept", nullable = false)
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Column(name = "designation", nullable = false)
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation= designation;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", dept=" + dept + ", designation=" + designation + "]";
	}
	
	
}
