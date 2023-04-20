package com.chatting.controller.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chatting.dto.ChatDTO;
import com.chatting.dto.ChatDTO.MessageType;

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
        ChatDTO chatDTO = new ChatDTO();
        List<ChatDTO> chatList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            chatDTO = ChatDTO.builder()
                .type(MessageType.TALK)
                .roomId("zz"+i+1)
                .sender("가가"+i+1)
                .message("헬롱")
                .time("시간이다~")
                .build();
            chatList.add(chatDTO);
        }
        model.addAttribute("chatList", chatList);
        return "chatList";
    }


}
