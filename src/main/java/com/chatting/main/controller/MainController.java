package com.chatting.main.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chatting.dto.ChatDto;
import com.chatting.dto.MemberDto;
import com.chatting.entity.MessageType;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
    
    @GetMapping("/")
    public String main() {
        return "main";
    }


    @GetMapping("/chat")
    public String chatList(Model model) {
        ChatDto chatDTO = new ChatDto();
        List<ChatDto> chatList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            chatDTO = ChatDto.builder()
                .chatType(MessageType.TALK)
                .chatId("zz"+i+1)
                .chatSender("가가"+i+1)
                .chatMessage("헬롱")
                .chatTime(LocalDateTime.now())
                .build();
            chatList.add(chatDTO);
        }
        model.addAttribute("chatList", chatList);
        return "chatList";
    }

    @GetMapping("/friend")
    public String friendList(Model model) {
        ChatDto chatDTO = new ChatDto();
        MemberDto memberDto = new MemberDto();
        memberDto = MemberDto.builder()
                        .memberId(0)
                        .memberName("이름")
                        .memberMessage("메시지입니다")
                        .build();
        model.addAttribute("member", memberDto);
        List<ChatDto> chatList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            chatDTO = ChatDto.builder()
                .chatType(MessageType.TALK)
                .chatId("zz"+i+1)
                .chatSender("가가"+i+1)
                .chatMessage("헬롱")
                .chatTime(LocalDateTime.now())
                .build();
            chatList.add(chatDTO);
        }
        model.addAttribute("chatList", chatList);
        return "friendList";
    }


}
