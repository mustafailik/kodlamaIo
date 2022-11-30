package homework;

import java.util.ArrayList;
import java.util.List;

import homework.business.CategoryManager;
import homework.business.CourseManager;
import homework.business.InstructorManager;
import homework.core.logging.DatabaseLogger;
import homework.core.logging.FileLogger;
import homework.core.logging.Logger;
import homework.core.logging.MailLogger;
import homework.dataAccess.HibernateDao;
import homework.entities.Category;
import homework.entities.Course;
import homework.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		Instructor instructor = new Instructor("Engin",36);
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers, null);
		instructorManager.add(instructor);
		
		List<Category> list1 = new ArrayList<Category>();
		Category category = new Category(1, "NTP");
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers, list1);
		categoryManager.add(category);
		
//		Category category2 = new Category(2,"NTP");
//		categoryManager.add(category2);
		
		List<Course> list2 = new ArrayList<Course>();
		Course course = new Course("Java",1,10);
		
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers, list2);
		courseManager.add(course);
		
//		Course course2 = new Course("Java",1,10);
//		courseManager.add(course2);
	}

}
