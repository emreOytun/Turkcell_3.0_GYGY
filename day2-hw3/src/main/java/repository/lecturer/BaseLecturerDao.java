package repository.lecturer;

import entity.Lecturer;

public interface BaseLecturerDao {
    void insert(Lecturer lecturer);
    void update(Lecturer lecturer);
    Lecturer fetch(Integer id);
    void delete(Integer id);
}
