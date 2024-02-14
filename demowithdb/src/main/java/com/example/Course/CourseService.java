package com.example.Course;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

    private List<Course> list = new ArrayList<>(Arrays.asList(
            // new Topic(1, "Java", "Complete Java Course"),
            // new Topic(2, "Spring Boot", "Complete Spring Boot Projects"),
            // new Topic(3, "JavaScript", "JavaScript Course")
        ));

    public List<Course> getAllCourses(String topicId){
        
    }

    public Course getCourse(String id){
        for(Course t:list){
            if(t.getName().equals(id)){
                return t;
            }
        }
        return null;
    }

    public void addCourse(Course topic) {
        courseRepo.save(topic);
    }

    public void updateCourse(String id, Course course) {
        courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);
    }
}
