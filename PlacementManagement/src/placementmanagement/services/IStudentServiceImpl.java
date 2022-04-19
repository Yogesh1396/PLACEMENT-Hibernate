package placementmanagement.services;

import placementmanagement.dao.IStudentDao;
import placementmanagement.dao.IStudentDaoImpl;
import placementmanagement.entities.Student;

public class IStudentServiceImpl implements IStudentService {
	IStudentDao sd;
	public IStudentServiceImpl() {
		sd=  new IStudentDaoImpl();
	}
	@Override
	
	public void addStudent(Student student) {
      sd.beginTransaction();
      sd.addStudent(student);
      sd.commitTrasaction();
		
	}

	@Override
	public Student updateStudent(Student student) {
		sd.beginTransaction();
		sd.updateStudent(student);
		sd.commitTrasaction();
		return student;
	}

	@Override
	public Student searchStudentById(long id) {
		Student student = sd.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long hallTicketNo) {
		Student student = sd.searchStudentByHallTicket(hallTicketNo);
		return student;
	}

	@Override
	public Student addCertificate(Student student) {
		sd.beginTransaction();
		sd.addCertificate(student);
		sd.commitTrasaction();
		return student;
	}

	@Override
	public Student updateCertificate(Student student) {
		sd.beginTransaction();
		sd.updateCertificate(student);
		sd.commitTrasaction();
		return student;
	}

	@Override
	public boolean deleteStudent(long id) {
		sd.beginTransaction();
		sd.deleteStudent(id);
		sd.commitTrasaction();
		return true ;
	}
}