package com.Insturmentrade.message_service.Service;

import com.Insturmentrade.message_service.Entity.Message;
import com.Insturmentrade.message_service.Repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getMessages(Long userId) {
        return messageRepository.findBySenderIdOrReceiverId(userId, userId);
    }

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }
}
