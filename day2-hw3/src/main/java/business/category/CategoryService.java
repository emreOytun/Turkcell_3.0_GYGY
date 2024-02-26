package business.category;

import entity.Category;

public interface CategoryService {
    void insert(Category category) throws Exception;
    void update(Category category);
    Category fetch(Integer id);
    void delete(Integer id);
}
