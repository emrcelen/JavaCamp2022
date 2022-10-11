package entities.concretes;

public class Course {
    // field | veriable:
    private int courseId;
    private String courseName;
    private double coursePrice;

    // constructor:
    public Course (){
        // default constructor.
    }
    public Course (int courseId, String courseName, double coursePrice){
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    // getter method:
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public double getCoursePrice() {
        return coursePrice;
    }

    // setter method:
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
