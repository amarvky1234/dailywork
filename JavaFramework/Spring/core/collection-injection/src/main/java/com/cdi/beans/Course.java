package com.cdi.beans;

import java.util.List;
import java.util.Set;

public class Course {
    private List<String> subjects;
    private Set<String> faculties;

    public Course(Set<String> faculties) {
        this.faculties = faculties;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subjects=" + subjects +
                ", faculties=" + faculties +
                '}';
    }
}
