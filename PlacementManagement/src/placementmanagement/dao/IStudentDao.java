package placementmanagement.dao;

import placementmanagement.entities.Student;

public interface IStudentDao {



	public void addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);
	public Student searchStudentByHallTicket(long hallTicketNo);
	public Student deleteStudent(long id);
	
	public Student addCertificate(Student student);
	public Student updateCertificate(Student student);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();


}
