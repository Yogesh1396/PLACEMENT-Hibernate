package placementmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import placementmanagement.entities.Student;




public class IStudentDaoImpl implements IStudentDao {
 private EntityManager em;
	


	public IStudentDaoImpl() {

		em=Configuration.getEntityManager();
	
	}

	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}

	@Override
	public Student updateStudent(Student student) {
		em.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(long id) {
		Student student = em.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long hallTicketNo) {
		Student student = em.find(Student.class, hallTicketNo);
		return student;
	}

	@Override
	public Student deleteStudent(long id) {
		em.remove(id);
		return null;
	}

	@Override
	public Student addCertificate(Student student) {
		em.persist(student);
		return student;
	}

	@Override
	public Student updateCertificate(Student student) {
		em.persist(student);
		return student;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();	
	}

	@Override
	public void commitTrasaction() {
		em.getTransaction().commit();
		
	}

}
