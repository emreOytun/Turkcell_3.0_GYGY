package kodlama.io.devs.entity;

import java.util.Objects;

public class ProgrammingLanguage {
    private String id;
    private String languageName;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(String id, String languageName) {
        this.id = id;
        this.languageName = languageName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return Objects.equals(id, that.id) && Objects.equals(languageName, that.languageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, languageName);
    }
}
