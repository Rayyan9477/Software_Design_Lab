package Rayyan.SpringBootRest.dao;

import Rayyan.SpringBootRest.entity.CaseFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseFileDao extends JpaRepository<CaseFile, Integer> {
}