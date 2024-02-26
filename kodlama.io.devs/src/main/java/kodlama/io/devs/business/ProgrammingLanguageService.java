package kodlama.io.devs.business;

import kodlama.io.devs.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void insert(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(String id) throws Exception;
    ProgrammingLanguage getById(String id) throws Exception;
    List<ProgrammingLanguage> getAll();
}
