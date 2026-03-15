package com.klu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klu.model.Course;
import com.klu.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    public Course saveCourse(Course c) {
        return repo.save(c);
    }

    public void deleteCourse(int id) {
        repo.deleteById(id);
    }
}