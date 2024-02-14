package com.example.Course;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Topic.Topic;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CourseController {

    @Autowired
    private CourseService topicService;

    @RequestMapping("/topics/{id}/course")
    public List<Course> getTopics(){
        return topicService.getAllTopics(); 
    }

    @RequestMapping("/topics/{TopicId}/course/{id}")
    public Course getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping(value="/topics/{topicId}/course")
    public void addTopic(@RequestBody Course course,@PathVariable String topicId){
        course.topic = new Topic(topicId, "", "")
        CourseService.addCourse(course);
    }

    @PutMapping(value="topics/{TopicId}/course/{courseId}")
    public void putMethodName(@PathVariable String courseId, @RequestBody Course course) {
        topicService.updateTopic(courseId,course);
    }

    @DeleteMapping(value="topics/{TopicId}/course/{courseId}")
    public void deleteMethod(@PathVariable String courseId){
        topicService.deleteTopic(courseId);
    }
}
