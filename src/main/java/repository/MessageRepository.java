package com.example.chatappfinal.repository;

import com.example.chatappfinal.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByReceiver(String receiver);
}
