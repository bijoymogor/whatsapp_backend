package com.bijoy.whatsapp.service;

import java.util.List;

import com.bijoy.whatsapp.exception.ChatException;
import com.bijoy.whatsapp.exception.MessageException;
import com.bijoy.whatsapp.exception.UserException;
import com.bijoy.whatsapp.modal.Message;
import com.bijoy.whatsapp.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
