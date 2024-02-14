package com.example.Course;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{
    public List<Course> findByTopicId(String name);
}
