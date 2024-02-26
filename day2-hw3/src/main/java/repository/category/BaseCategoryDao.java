package repository.category;

import entity.Category;

public interface BaseCategoryDao {
    void insert(Category category);
    void update(Category category);
    Category fetch(Integer id);
    void delete(Integer id);
    Integer countByCategoryName(String categoryName);
}
