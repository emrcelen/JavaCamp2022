package dataAccess.abstracts;

import entities.concretes.Category;

import java.util.ArrayList;

public interface CategoryDao {
    void add (Category category);
    void delete (Category category);
    ArrayList<Category> getAll ();

}
