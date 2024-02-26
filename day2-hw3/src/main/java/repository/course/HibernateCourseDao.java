package repository.course;

import entity.Course;

import java.util.List;

public class HibernateCourseDao implements BaseCourseDao {

    @Override
    public void insert(Course course) {
        System.out.println("Course has been added to database by hibernate.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Course has been updated in database by hibernate.");
    }

    @Override
    public Course fetch(Integer id) {
        System.out.println("Course has been updated in database by hibernate.");
        return null;
    }

    @Override
    public List<Course> fetchAll() {
        System.out.println("Courses has been fetched from database by hibernate.");
        return null;
    }

    @Override
    public List<Course> fetchAllFiltered(List<Integer> lecturerIds, List<Integer> categoryIds) {
        System.out.println("Courses has been fetched with filters from database by hibernate.");
        return null;
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Course has been updated in database by hibernate.");
    }

    @Override
    public Integer countByCourseName(String courseName) {
        return null;
    }
}
