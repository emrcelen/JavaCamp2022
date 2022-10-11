package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

import java.util.ArrayList;

public class OracleCategoryDao implements CategoryDao {
    private ArrayList <Category> categories;

    public OracleCategoryDao(){
        this.categories = new ArrayList<>();
    }
    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("["+category.getCategoryName() + "] added to system with oracle. (Category)");
    }

    @Override
    public void delete(Category category) {
        categories.remove(category);
        System.out.println("["+category.getCategoryName() + "] deleted from system with oracle. (Category)");
    }

    @Override
    public ArrayList<Category> getAll() {
        return categories;
    }
}
