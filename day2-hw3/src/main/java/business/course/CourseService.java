package business.course;

import entity.Course;

import java.util.List;

public interface CourseService {
    void insert(Course course) throws Exception;
    void update(Course course);
    Course fetch(Integer id);
    List<Course> fetchAll();
    List<Course> fetchAllFiltered(List<Integer> lecturerIds, List<Integer> categoryIds);
    void delete(Integer id);
}
