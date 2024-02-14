package com.example.Topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepo;

    private List<Topic> list = new ArrayList<>(Arrays.asList(
            // new Topic(1, "Java", "Complete Java Course"),
            // new Topic(2, "Spring Boot", "Complete Spring Boot Projects"),
            // new Topic(3, "JavaScript", "JavaScript Course")
        ));

    public List<Topic> getAllTopics(){
        List<Topic> list= new ArrayList<>();
        for(Topic t:topicRepo.findAll()) list.add(t);
        return list; 
    }

    public Topic getTopic(String id){
        for(Topic t:list){
            if(t.getName().equals(id)){
                return t;
            }
        }
        return null;
    }

    public void addTopic(Topic topic) {
        topicRepo.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepo.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepo.deleteById(id);
    }
}
