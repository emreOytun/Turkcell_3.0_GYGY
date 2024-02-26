package kodlama.io.devs.controller;

import kodlama.io.devs.business.ProgrammingLanguageService;
import kodlama.io.devs.entity.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguageController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.OK)
    public void insert(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.insert(programmingLanguage);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.update(programmingLanguage);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") String id) throws Exception {
        programmingLanguageService.delete(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProgrammingLanguage getById(@PathVariable("id") String id) throws Exception {
        return programmingLanguageService.getById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }
}
