package business.concretes;

import business.abstracts.CourseService;
import core.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

import java.util.ArrayList;

public class CourseManager implements CourseService {
    private int flag;

    private ArrayList<Course> courses;

    private CourseDao courseDao;
    private Logger [] loggers;


    public CourseManager(CourseDao courseDao, Logger [] loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Course course) {
        flag = 1;
       this.courses = courseDao.getAll();
       if(!course.getCourseName().isEmpty()){
           for(Course c : courses){
               if(c.getCourseName().equalsIgnoreCase(course.getCourseName()))
                   flag = 0;
           }
       }
       if(flag == 1 && course.getCoursePrice() > 0){
          this.courseDao.add(course);
          for(Logger logger : loggers)
              logger.log(course.getCourseName() + " is added.");
       }
       else
           System.err.println("An undesirable situation has been encountered.");
    }
}
