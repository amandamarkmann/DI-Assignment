package lexicon.se.amanda.di.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lexicon.se.amanda.di.assignment.data_access.StudentDao;
import lexicon.se.amanda.di.assignment.models.Student;
import lexicon.se.amanda.di.assignment.util.UserInputService;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

	UserInputService scannerService;
	StudentDao studentDao;
	
	
	@Autowired
	public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao) {
		super();
		this.scannerService = scannerService;
		this.studentDao = studentDao;
	}

	@Override
	public Student create() {
		
		System.out.println("Enter name");
		String name = scannerService.getString();
		int id = scannerService.getInt();
		
		return studentDao.save(new Student(id, name));
	}

	@Override
	public Student save(Student student) {
	
		return studentDao.save(student);
	}

	@Override
	public Student find(int id) {
		
		return studentDao.find(id);
	}

	@Override
	public Student remove(int id) {
		
		return studentDao.delete(id);
	}

	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}

	@Override
	public Student edit(Student student) {
		
		
		return student;
	}

}
