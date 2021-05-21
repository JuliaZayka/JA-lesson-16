package ua.lviv;

//import org.springframework.beans.factory.annotation.Qualifier;  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.dao.StudentDao;
import ua.lviv.dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {

	@Bean(name = "studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao;
	}
	
	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Name1");
		student.setAge(30);

		return student;
	}
}