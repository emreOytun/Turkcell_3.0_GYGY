package kodlama.io.devs.business;

import kodlama.io.devs.entity.ProgrammingLanguage;
import kodlama.io.devs.repository.BaseProgrammingLanguageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private BaseProgrammingLanguageDao programmingLanguageDao;

    @Autowired
    public ProgrammingLanguageManager(BaseProgrammingLanguageDao programmingLanguageDao) {
        this.programmingLanguageDao = programmingLanguageDao;
    }

    @Override
    public void insert(ProgrammingLanguage programmingLanguage) throws Exception {
        checkNotNullOrThrowException(programmingLanguage);
        checkNotNullOrThrowException(programmingLanguage.getLanguageName());
        checkLanguageNameNotExistsOrThrowException(programmingLanguage.getLanguageName());
        programmingLanguageDao.insert(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) throws Exception {
        checkNotNullOrThrowException(programmingLanguage);
        checkNotNullOrThrowException(programmingLanguage.getLanguageName());
        checkNotNullOrThrowException(programmingLanguage.getId());
        programmingLanguageDao.update(programmingLanguage);
    }

    @Override
    public void delete(String id) throws Exception {
        checkNotNullOrThrowException(id);
        programmingLanguageDao.delete(id);
    }

    @Override
    public ProgrammingLanguage getById(String id) throws Exception {
        checkNotNullOrThrowException(id);
        return programmingLanguageDao.getById(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageDao.getAll();
    }

    private void checkNotNullOrThrowException(ProgrammingLanguage programmingLanguage) throws Exception {
        if (programmingLanguage == null) {
            throw new Exception("Programming language is null.");
        }
    }

    private void checkNotNullOrThrowException(String notNullExpectedField) throws Exception {
        if (notNullExpectedField == null) {
            throw new Exception("Null field not accepted.");
        }
    }

    private void checkLanguageNameNotExistsOrThrowException(String languageName) throws Exception {
        if (programmingLanguageDao.findByLanguageName(languageName) != null) {
            throw new Exception("Language name cannot repeat. There is a language name inserted before. " +
                    "languageName: " + languageName);
        }
    }
}
