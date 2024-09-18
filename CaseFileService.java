package Rayyan.SpringBootRest.service;

import Rayyan.SpringBootRest.dao.CaseFileDao;
import Rayyan.SpringBootRest.entity.CaseFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CaseFileService {

    @Autowired
    private CaseFileDao caseFileDao;

    public List<CaseFile> findAll() {
        return caseFileDao.findAll();
    }

    public CaseFile save(CaseFile caseFile) {
        // Assign a random category
        String[] categories = {"Category1", "Category2", "Category3"};
        caseFile.setCategory(categories[new Random().nextInt(categories.length)]);
        caseFileDao.save(caseFile);
        return caseFile;
    }

    public CaseFile findOne(int id) {
        return caseFileDao.findById(id).get();
    }

    public void deleteById(int id) {
        CaseFile entity = caseFileDao.findById(id).get();
        caseFileDao.delete(entity);
    }

    public CaseFile updateCaseFile(CaseFile updatedCaseFile) {
        caseFileDao.save(updatedCaseFile);
        return updatedCaseFile;
    }
}