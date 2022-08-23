package com.example.service;

import com.example.model.Message;
import com.example.repos.MessageRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepo messageRepo;

    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public List<Message> getMessages(){
        return messageRepo.findAll();
    }

}
