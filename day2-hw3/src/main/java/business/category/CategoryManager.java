package business.category;

import core.logging.BaseLogger;
import core.logging.LoggingHelper;
import entity.Category;
import repository.category.BaseCategoryDao;

import java.util.List;

public class CategoryManager implements CategoryService {

    private BaseCategoryDao categoryDao;
    private List<BaseLogger> loggers;

    public CategoryManager(BaseCategoryDao categoryDao, List<BaseLogger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    @Override
    public void insert(Category category) throws Exception {
        if (categoryDao.countByCategoryName(category.getName()) != 0) {
            throw new Exception("Category name cannot be repeated.");
        }
        categoryDao.insert(category);
        LoggingHelper.log(loggers, "Category with name: " + category.getName() + " inserted.");
    }

    @Override
    public void update(Category category) {
        categoryDao.update(category);
        LoggingHelper.log(loggers, "Category with name: " + category.getName() + " updated.");
    }

    @Override
    public Category fetch(Integer id) {
        return categoryDao.fetch(id);
    }

    @Override
    public void delete(Integer id) {
        categoryDao.delete(id);
        LoggingHelper.log(loggers, "Category with id: " + id + " deleted.");
    }
}
