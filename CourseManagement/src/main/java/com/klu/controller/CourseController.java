package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Course;
import com.klu.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }
}