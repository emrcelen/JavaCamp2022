package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

import java.util.ArrayList;

public class OracleCourseDao implements CourseDao {
    private ArrayList<Course> courses;

    public OracleCourseDao(){
        this.courses = new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("["+course.getCourseName() + "] added to system with oracle. (Course)");
    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
        System.out.println("["+course.getCourseName() + "] deleted from system with oracle. (Course)");
    }

    @Override
    public ArrayList<Course> getAll() {
        return courses;
    }

}
