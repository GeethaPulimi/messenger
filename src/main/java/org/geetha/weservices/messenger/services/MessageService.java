package org.geetha.weservices.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.geetha.weservices.messenger.database.DataBase;
import org.geetha.weservices.messenger.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages = DataBase.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1L,"Hello World","Geetha"));
		messages.put(2L, new Message(2L,"Hello Jersey","Koushik"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(Long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message ) {
		message.setId((long) (messages.size()+1));
	    messages.put(message.getId(), message);
	    return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
