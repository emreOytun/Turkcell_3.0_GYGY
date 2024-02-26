package repository.lecturer;

import entity.Lecturer;

public class JdbcLecturerDao implements BaseLecturerDao {
    @Override
    public void insert(Lecturer lecturer) {
        System.out.println("Lecturer has been added to database by jdbc.");
    }

    @Override
    public void update(Lecturer lecturer) {
        System.out.println("Lecturer has been updated in database by jdbc.");
    }

    @Override
    public Lecturer fetch(Integer id) {
        System.out.println("Lecturer has been fetched from database by jdbc.");
        return null;
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Lecturer has been deleted from database by jdbc.");
    }
}
