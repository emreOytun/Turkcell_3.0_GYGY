package repository.course;

import entity.Course;

import java.util.List;

public interface BaseCourseDao {
    void insert(Course course);
    void update(Course course);
    Course fetch(Integer id);
    List<Course> fetchAll();
    List<Course> fetchAllFiltered(List<Integer> lecturerIds, List<Integer> categoryIds);
    void delete(Integer id);
    Integer countByCourseName(String courseName);
}
