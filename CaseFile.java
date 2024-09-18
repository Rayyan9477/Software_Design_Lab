package Rayyan.SpringBootRest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CaseFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer caseId;
    private String description;
    private String keySuspects;
    private String evidenceCollected;
    private String category;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeySuspects() {
        return keySuspects;
    }

    public void setKeySuspects(String keySuspects) {
        this.keySuspects = keySuspects;
    }

    public String getEvidenceCollected() {
        return evidenceCollected;
    }

    public void setEvidenceCollected(String evidenceCollected) {
        this.evidenceCollected = evidenceCollected;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
public String toString() {
    return "CaseFile{" +
            "caseId=" + caseId +
            ", description='" + description + '\'' +
            ", keySuspects='" + keySuspects + '\'' +
            ", evidenceCollected='" + evidenceCollected + '\'' +
            ", category='" + category + '\'' +
            '}';
}

}