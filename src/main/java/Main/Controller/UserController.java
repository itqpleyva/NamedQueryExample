package Main.Controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Main.Model.Student;

@RestController
public class UserController {

	@Autowired
	private EntityManager em;
	
	@RequestMapping("/getbyemail/{email}")
	@SuppressWarnings("unchecked")
	public List<Student> getUserByEmail(@PathVariable String email) {		

	List<Student> student = (List<Student>) em.createNamedQuery("Student.findByEmailAddress")
                .setParameter("email", email)
                .getResultList();
	return student;
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/getbyname/{name}")
	public List<Student> getUserByname(@PathVariable String name) {
		
	List<Student> students = (List<Student>) em.createNamedQuery("Student.findByName")
                .setParameter("name", name)
                .getResultList();
	return students;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/all")
	public List<Student> getALL() {
		
	List<Student> students = (List<Student>) em.createNamedQuery("Student.findAll")
                .getResultList();
	return students;
	}

}
