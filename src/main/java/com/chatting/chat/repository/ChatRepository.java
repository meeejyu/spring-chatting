package com.chatting.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatting.entity.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    
}
