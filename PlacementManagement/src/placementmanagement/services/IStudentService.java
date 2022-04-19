package placementmanagement.services;


import placementmanagement.entities.Student;

public interface IStudentService {
	public void addStudent(Student student);  
	public Student updateStudent(Student student);  
	public Student searchStudentById (long id);  

	public Student searchStudentByHallTicket(long id); 

	public Student addCertificate(Student student); 

	public Student updateCertificate(Student student);


	public boolean deleteStudent(long id); 
}
