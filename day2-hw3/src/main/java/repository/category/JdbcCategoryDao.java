package repository.category;

import entity.Category;

public class JdbcCategoryDao implements BaseCategoryDao {
    @Override
    public void insert(Category category) {
        System.out.println("Lecturer has been added to database by jdbc.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Lecturer has been updated in database by jdbc.");
    }

    @Override
    public Category fetch(Integer id) {
        System.out.println("Lecturer has been fetched from database by jdbc.");
        return null;
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Lecturer has been deleted from database by jdbc.");
    }

    @Override
    public Integer countByCategoryName(String categoryName) {
        return null;
    }
}
