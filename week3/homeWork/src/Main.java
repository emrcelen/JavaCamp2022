import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import core.abstracts.Logger;
import core.concretes.DatabaseLogger;
import core.concretes.FileLogger;
import core.concretes.MailLogger;
import dataAccess.concretes.HibernateCourseDao;
import dataAccess.concretes.OracleCategoryDao;
import entities.concretes.Category;
import entities.concretes.Course;

public class Main {
    public static void main(String[] args) {
        /*
        Detail:
        kodlama.io web sitesinin ana sayfasında bulunan eğitmen, kategori ve kurs bölümlerini katmanlı mimaride kodlamak istiyoruz.
        Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.
        Çoklu loglama yapısını simule ediniz.

        Aşağıdaki isterleri gerçekleştiriniz.
        -> Kurs ismi tekrar edemez
        -> Kategori ismi tekrar edemez
        -> Bir kursun fiyatı 0 dan küçük olamaz
        -> Kodlarınızı github'a aktarınız
         */


        Logger[] loggers = {new MailLogger(), new FileLogger(), new DatabaseLogger()};

        Course course = new Course(1,"(2022) Yazılım Geliştirici Yetiştirme Kampı - Java",100);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);
        // courseManager.add(course);
        System.out.println("");
        Category category = new Category(1,"Programlama","Programlama Kurslarının Bulunduğu Alan");
        CategoryManager categoryManager = new CategoryManager(new OracleCategoryDao(),loggers);
        categoryManager.add(category);
        categoryManager.add(category);
    }
}
