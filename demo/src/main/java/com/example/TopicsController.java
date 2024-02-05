package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TopicsController {
    
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getAllTopics(); 
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping(value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping(value="topics/{id}")
    public void putMethodName(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(id,topic);
    }

    @DeleteMapping(value="topics/{id}")
    public void deleteMethod(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
