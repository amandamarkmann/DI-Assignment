package lexicon.se.amanda.di.assignment.data_access;

import java.util.List;



import lexicon.se.amanda.di.assignment.models.Student;


public interface StudentDao {
	
	Student save (Student student);
	Student find (int id);
	List <Student> findAll();
	void delete (int id);

}
