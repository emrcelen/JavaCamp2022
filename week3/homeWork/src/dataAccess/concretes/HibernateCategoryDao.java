package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

import java.util.ArrayList;

public class HibernateCategoryDao implements CategoryDao {
    private ArrayList <Category> categories;

    public HibernateCategoryDao(){
        this.categories = new ArrayList<>();
    }

    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("["+category.getCategoryName() + "] added to system with hibernate. (Category)");
    }

    @Override
    public void delete(Category category) {
        categories.remove(category);
        System.out.println("["+category.getCategoryName() + "] deleted from system with hibernate. (Category)");
    }

    @Override
    public ArrayList<Category> getAll() {
        return  categories;
    }
}
