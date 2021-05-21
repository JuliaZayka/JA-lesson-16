package ua.lviv.dao;

import java.util.List;
//import ua.lviv.lesson16.Student;

import ua.lviv.Student;

public interface StudentDao {
	
	void create(Student student);

	Student readById(int id);

	List<Student> readAll();

//	void update(Student student);

	void delete(int id);
}
