package placementmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="students")
public class Student {
	
	@Id
	
	@Column(name="id")
	private long id;
	
	@Column(name="name")    
	private String name;
	
	@Column(name="college")
	private String college;
	
	@Column(name="roll")
	private long roll;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="course")
	private String course;

	@Column(name="year")
	private int year;
	
	@Column(name="certificate")
	private String certificate;
	
	@Column(name="hallTicketNo")
	private long hallTicketNo;
	
	public Student() {
	}
	
	
	public Student(String name, String college, long roll, String qualification, String course, int year,
			String certificate, long hallTicketNo) 
	{
		
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallTicketNo = hallTicketNo;
	}
	
	


	public long getId() {
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


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public long getRoll() {
		return roll;
	}


	public void setRoll(long roll) {
		this.roll = roll;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCertificate(Student student) {
		return certificate;
	}


	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}


	public long getHallTicketNo() {
		return hallTicketNo;
	}


	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", qualification="
				+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
				+ ", hallTicketNo=" + hallTicketNo + "]";
	}
	
}
	