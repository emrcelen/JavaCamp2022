package dataAccess.abstracts;

import entities.concretes.Course;

import java.util.ArrayList;

public interface CourseDao {
    void add (Course course);
    void delete (Course course);
    ArrayList<Course> getAll ();
}
