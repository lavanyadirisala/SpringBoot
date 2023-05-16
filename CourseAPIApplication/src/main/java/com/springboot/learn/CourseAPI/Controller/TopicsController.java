package com.springboot.learn.CourseAPI.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn.CourseAPI.Classes.Topics;
import com.springboot.learn.CourseAPI.Services.TopicServices;

@RestController
public class TopicsController {

	@Autowired
	private TopicServices topicService;

	//get all
	@RequestMapping("/topics")
	public List<Topics> getAllTopic() {
		return topicService.getTopics();
	}
	
	//get
	@RequestMapping("/topics/{id}")
	//If names different from path toparamenter @PathVariable("id")int Id
	public Topics getTopicById(@PathVariable int id) {
		return topicService.getTopicsId(id);
	}
	
	//post
	@RequestMapping(method= RequestMethod.POST, value="/topics" )
	public void CreateTopic(@RequestBody Topics topic) {
		topicService.postTopics(topic);
	}
	
	//update
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void UpdateTopic(@PathVariable int id , @RequestBody Topics topic) {
		 topicService.updateTopics(id, topic);		
	}	
	
	//delete
	@RequestMapping(method =RequestMethod.DELETE, value="/topics/{id}")
	public String DeleteTopic(@PathVariable int id) {
		topicService.deleteTopics(id);
		return " Topic deleted Successfully";
	}
	
	
}
