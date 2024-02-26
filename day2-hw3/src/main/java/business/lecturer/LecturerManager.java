package business.lecturer;

import core.logging.BaseLogger;
import core.logging.LoggingHelper;
import entity.Lecturer;
import repository.lecturer.BaseLecturerDao;

import java.util.List;

public class LecturerManager implements LecturerService {

    private BaseLecturerDao lecturerDao;
    private List<BaseLogger> loggers;

    public LecturerManager(BaseLecturerDao lecturerDao, List<BaseLogger> loggers) {
        this.lecturerDao = lecturerDao;
        this.loggers = loggers;
    }

    @Override
    public void insert(Lecturer lecturer) {
        lecturerDao.insert(lecturer);
        LoggingHelper.log(loggers, "Lecturer with name: " + lecturer.getFullName() + " inserted.");
    }

    @Override
    public void update(Lecturer lecturer) {
        lecturerDao.update(lecturer);
        LoggingHelper.log(loggers, "Lecturer with name: " + lecturer.getFullName() + " updated.");
    }

    @Override
    public Lecturer fetch(Integer id) {
        return lecturerDao.fetch(id);
    }

    @Override
    public void delete(Integer id) {
        lecturerDao.delete(id);
        LoggingHelper.log(loggers, "Lecturer with id: " + id + " deleted.");
    }
}
