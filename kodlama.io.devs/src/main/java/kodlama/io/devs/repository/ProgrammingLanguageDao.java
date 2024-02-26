package kodlama.io.devs.repository;

import kodlama.io.devs.entity.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class ProgrammingLanguageDao implements BaseProgrammingLanguageDao {
    private Map<String, ProgrammingLanguage> programmingLanguageMap;

    public ProgrammingLanguageDao() {
        this.programmingLanguageMap = new HashMap<>();
    }

    @Override
    public void insert(ProgrammingLanguage programmingLanguage) {
        programmingLanguage.setId(UUID.randomUUID().toString());
        programmingLanguageMap.put(programmingLanguage.getId(), programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageMap.put(programmingLanguage.getId(), programmingLanguage);
    }

    @Override
    public void delete(String id) {
        programmingLanguageMap.remove(id);
    }

    @Override
    public ProgrammingLanguage getById(String id) {
        return programmingLanguageMap.get(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageMap.values().stream().toList();
    }

    @Override
    public ProgrammingLanguage findByLanguageName(String languageName) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguageMap.values()) {
            if (programmingLanguage.getLanguageName().equals(languageName)) {
                return programmingLanguage;
            }
        }
        return null;
    }
}
