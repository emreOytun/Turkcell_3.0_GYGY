package business.course;

import core.logging.BaseLogger;
import core.logging.LoggingHelper;
import entity.Course;
import repository.course.BaseCourseDao;

import java.math.BigDecimal;
import java.util.List;

public class CourseManager implements CourseService {

    private BaseCourseDao courseDao;
    private List<BaseLogger> loggers;

    public CourseManager(BaseCourseDao courseDao, List<BaseLogger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    @Override
    public void insert(Course course) throws Exception {
        if (course.getPrice().compareTo(new BigDecimal(0)) < 0) {
            throw new Exception("Course price cannot be smaller than 0");
        }
        if (courseDao.countByCourseName(course.getName()) != 0) {
            throw new Exception("Course name cannot be repeated");
        }
        courseDao.insert(course);
        LoggingHelper.log(loggers, "Course with name: " + course.getName() + " inserted.");
    }

    @Override
    public void update(Course course) {
        courseDao.update(course);
        LoggingHelper.log(loggers, "Course with name: " + course.getName() + " updated.");
    }

    @Override
    public Course fetch(Integer id) {
        return courseDao.fetch(id);
    }

    @Override
    public List<Course> fetchAll() {
        return courseDao.fetchAll();
    }

    @Override
    public List<Course> fetchAllFiltered(List<Integer> lecturerIds, List<Integer> categoryIds) {
        return courseDao.fetchAllFiltered(lecturerIds, categoryIds);
    }

    @Override
    public void delete(Integer id) {
        courseDao.delete(id);
        LoggingHelper.log(loggers, "Course with id: " + id + " deleted.");
    }
}
