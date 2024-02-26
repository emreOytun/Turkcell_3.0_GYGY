package kodlama.io.devs.repository;

import kodlama.io.devs.entity.ProgrammingLanguage;

import java.util.List;

public interface BaseProgrammingLanguageDao {
    void insert(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(String id);
    ProgrammingLanguage getById(String id);
    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage findByLanguageName(String languageName);
}
