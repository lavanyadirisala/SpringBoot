package com.springboot.learn.CourseAPI.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.learn.CourseAPI.Classes.Topics;

@Service
public class TopicServices {
	private List<Topics>listofTopics = new ArrayList<>( Arrays.asList(new Topics(1, "Java", "This Course Is used for designing stand-Alone web Applications"),
				new Topics(2, "Biztalk", "This is Middleware System that allows to automate business processes")));
	
	public List<Topics> getTopics(){
		return listofTopics;
	}
	
	public Topics getTopicsId(int id) {
		return listofTopics.stream().filter(row -> row.getId()==(id)).findFirst().get();
	}
	
	public Topics postTopics(Topics topic) {
		listofTopics.add(topic);
		return topic;
	}
	public void updateTopics(int id, Topics topic) {
		for(int i=0;i<listofTopics.size();i++) {
			if(listofTopics.get(i).getId()==id) {
				listofTopics.set(id, topic);
				return;
			}
		}
	}

	public void deleteTopics(int id) {
		//Topics findTopic = listofTopics.stream().filter(row -> row.getId()==(id)).findFirst().get();
		//System.out.println(findTopic.getId());
		for(int i=0;i<listofTopics.size();i++) {
			if(listofTopics.get(i).getId()==id) {
				listofTopics.remove(i);
			}
		}
	}
}
