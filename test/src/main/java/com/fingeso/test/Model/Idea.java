package com.fingeso.test.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class Idea {

    private String idNumber;
    private String description;
    private String name;
    private int assessment;
    private List<Integer> assessments;


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public List<Integer> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Integer> assessments) {
        this.assessments = assessments;
    }

    public void calculateAssessment(){

        List<Integer> assessments = this.getAssessments();
        int assessment = 0;
        for (int value : assessments){

            if (assessment == 0){
                assessment = value;
            }
            else{
                assessment = assessment + value;
            }
        }
        int prom = assessment/assessments.size();
        this.setAssessment(prom);
    }
}
