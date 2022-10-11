package business.concretes;

import business.abstracts.CategoryService;
import core.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

import java.util.ArrayList;

public class CategoryManager implements CategoryService {
    private int flag;

    private ArrayList <Category> categories;

    private CategoryDao categoryDao;
    private Logger [] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger [] loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Category category) {
        flag = 1;
        this.categories = categoryDao.getAll();

        if(!category.getCategoryName().isEmpty()){
            for (Category c : categories)
                if(c.getCategoryName().equalsIgnoreCase(category.getCategoryName()))
                    flag = 0;
        }
        if(flag == 1){
            this.categoryDao.add(category);
            for(Logger logger:loggers)
                logger.log(category.getCategoryName()+" is added.");
        }
        else
            System.err.println("An undesirable situation has been encountered.");


    }
}
