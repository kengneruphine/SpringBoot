package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

 private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","spring framework","spring framework description"),
	new Topic("java","java framework","java core framework description"),
	new Topic("javascript","javascriptframework","javascript core framework description")
	));

public List<Topic> getAllTopics(){
	List<Topic> topics= new ArrayList<>();
	topicRepository.findAll().forEach(topics::add);
	return topics;
}
 
public Topic getTopic(String id) {
	return topicRepository.findOne(id);
}

public void addTopic(Topic topic) {
	topicRepository.save(topic);
}

public void updateTopic(String id, Topic topic) {
	 topicRepository.save(topic);
}

public void deleteTopic(String id) { 
	topicRepository.delete(id);
	
}

}
