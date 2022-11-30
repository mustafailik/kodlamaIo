package homework.business;

import java.util.List;

import homework.core.logging.Logger;
import homework.dataAccess.InstructorDao;
import homework.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	private List<Instructor> instructors;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers, List<Instructor> instructors) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructors;
	}
	
	public void add(Instructor instructor) {
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
			
		}
		instructorDao.add(instructor);
	}
}
