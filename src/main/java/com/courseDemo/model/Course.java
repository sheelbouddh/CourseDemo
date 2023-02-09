package com.courseDemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Course {
    private int courseId;
    private String title;
    private String description;
    private String link;

    public Course(){

    }

    public Course(String title, String description, String link){
        this.title = title;
        this.description = description;
        this.link = link;
    }
}
