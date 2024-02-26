package business.lecturer;

import entity.Lecturer;

public interface LecturerService {
    void insert(Lecturer lecturer);
    void update(Lecturer lecturer);
    Lecturer fetch(Integer id);
    void delete(Integer id);
}
