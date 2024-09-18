package Rayyan.SpringBootRest.controller;

import Rayyan.SpringBootRest.service.CaseFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Rayyan.SpringBootRest.entity.CaseFile;

import java.util.List;

@RestController
public class CaseFileController {

    @Autowired
    private CaseFileService service;

    @GetMapping("/casefiles")
    public List<CaseFile> retrieveAllCaseFiles() {
        return service.findAll();
    }

    @GetMapping("/casefiles/{id}")
    public CaseFile retrieveCaseFile(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/casefiles")
    public CaseFile createCaseFile(@RequestBody CaseFile caseFile) {
        return service.save(caseFile);
    }

    @DeleteMapping("/casefiles/{id}")
    public void deleteCaseFile(@PathVariable int id) {
        service.deleteById(id);
    }

    @PutMapping("/casefiles/{id}")
    public CaseFile updateCaseFile(@RequestBody CaseFile caseFile, @PathVariable int id) {
        caseFile.setCaseId(id);
        return service.updateCaseFile(caseFile);
    }
}