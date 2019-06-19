package com.wd.modeldubboclient.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
    private static final long serialVersionUID = -5619492437092077170L;

    private Integer id;

    private Integer grade;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
