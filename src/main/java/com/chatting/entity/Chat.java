package com.chatting.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="TB_CHAT")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAT_ID")
    private int chatId; // 채팅 id

    @Column(name = "CHAT_SENDER")
    private String chatSender; // 채팅을 보낸 사람
    
    @Column(name = "CHAT_MESSAGE")
    private String chatMessage; // 메시지

    @Column(name = "CHAT_TIME")
    private LocalDateTime chatTime; // 채팅 발송 시간

    @Column(name = "CHAT_TYPE")
    private MessageType chatType; // 메시지 타입

    @ManyToOne
    @JoinColumn(name = "CHATROOM_ID") // @JoinColumn 으로 Member.team 필드를 TEAM_ID 외래 키와 매핑.
    private ChatRoom chatRoom;
}

