package com.chatting.dto;

import java.time.LocalDateTime;

import com.chatting.entity.MessageType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatDto {

    private String chatId; // 방 번호

    private String chatSender; // 채팅을 보낸 사람
    
    @Setter
    private String chatMessage; // 메시지

    private LocalDateTime chatTime; // 채팅 발송 시간

    private MessageType chatType; // 메시지 타입

}
