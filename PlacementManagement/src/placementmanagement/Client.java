package placementmanagement;



import placementmanagement.entities.Student;
import placementmanagement.services.IStudentService;
import placementmanagement.services.IStudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		Student student = new Student();
		IStudentService service = new IStudentServiceImpl();
		/*student.setId(21);
		student.setName("YOG");
		student.setCollege("YTIET");
		student.setRoll(624);
		student.setQualification("B.E");
		student.setCourse("Engineering");
		student.setYear(2021);
		student.setHallTicketNo(6240);
		student.setCertificate("00");
		service.addStudent(student);
		
		  System.out.print("ID:" + student.getId()); System.out.println(" Name:" + student.getName()); System.out.println("College:" + student.getCollege());
		  System.out.println("Roll:" + student.getRoll());
		  System.out.println("Qualification:" + student.getQualification());
		  System.out.println("Course:" + student.getCourse());
		  System.out.println("Year:" + student.getYear());
		  System.out.println("Certificate:" + student.getCertificate(student));
		  System.out.println("HallTicketNo:" + student.getHallTicketNo());
		 

		System.out.println("End of program/Life cycle completed...");*/
		
//      Retrieve
//      student= service.searchStudentById(5);
//      System.out.println("ID is:"+student.getId());
//      System.out.println("Roll is:"+student.getRoll());
//      System.out.println("College is:"+student.getCollege().getName());

//    Update
      student= service.searchStudentById(21);
      student.setQualification("ME");
      service.updateStudent(student);
      System.out.println("update is successful");

//      delete by id
//      student= service.searchStudentById(5);
//      service.deleteStudent(student);
//      System.out.println("deletion is successful");

//
////        delete by hallTicket.
//      student= service.searchStudentByHallTicketNo(1);
//      service.deleteStudent(student);
//      System.out.println("deletion is successful");



  }
		
	}

