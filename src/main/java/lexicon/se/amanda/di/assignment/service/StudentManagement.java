package lexicon.se.amanda.di.assignment.service;

import java.util.List;

import lexicon.se.amanda.di.assignment.models.Student;

public interface StudentManagement {
	
	
	Student create();
	Student save (Student student);
	Student find (int id);
	Student remove (int id);
	List <Student> findAll();
	Student edit(Student student);
	

}
