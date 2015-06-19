package com.demo.get.message.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.get.message.domain.Message;

public class MessageService {

	/**
	 * This method use to add some hard coded messages to a list
	 * 
	 * @return  List of messages
	 */
	public List<Message> getMessage(){
		List<Message> msgList = new ArrayList<Message>();
		
		Message msg1 = new Message(1,"AA");
		Message msg2 = new Message(2, "BB");
		msgList.add(msg1);
		msgList.add(msg2);
		
		return msgList;			
	}
}
