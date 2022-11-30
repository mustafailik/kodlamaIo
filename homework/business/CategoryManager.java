package homework.business;

import java.util.List;

import homework.core.logging.Logger;
import homework.dataAccess.CategoryDao;
import homework.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> category) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = category;
	}
	
	public void add(Category category) throws Exception {
		for (Category ctgry : categories) {
			if(ctgry.getName().equals(ctgry.getName())) {
				throw new Exception("Kategori ismi kayitli");
			}
			
			}
		categoryDao.add(category);
			categories.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
		}
	}
	
	
}
