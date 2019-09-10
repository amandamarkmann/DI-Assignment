package lexicon.se.amanda.di.assignment.data_access;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lexicon.se.amanda.di.assignment.models.Student;

@Component
public class StudentDaoListImpl implements StudentDao {

	List<Student> students = new ArrayList<>();
	
	
	@Override
	public Student save(Student student) {
		students.add(student);
		
		return student;
	}

	@Override
	public Student find(int id) {
		for(Student student : students) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<Student> findAll() {
		
		return students;
	}

	@Override
	public void delete(int id) {
		
		students.remove(find(id));
		
	}

}
