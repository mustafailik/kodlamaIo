package homework.business;

import java.util.List;

import homework.core.logging.Logger;
import homework.dataAccess.CourseDao;
import homework.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	
	
	
	public void add(Course course) throws Exception {
		if(course.getPrice()<=0) {
			throw new Exception("kurs ucreti 0'dan kucuk olamaz");
		}
		for (Course c : courses) {
			if(c.getName().equals(c.getName())) {
				throw new Exception("Kurs ismi ayni olamaz");
			}
			
			}
		courseDao.add(course);
			courses.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());
		}
	}
		
}
