package com.chatting.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="TB_CHATROOM")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChatRoom extends BaseTimeEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHATROOM_ID")
    private int chatRoomId;

    @Column(name = "CHATROOM_NAME")
    private String chatRoomName;

    @Column(name = "CHATROOM_CAPACITY")
    private int chatRoomCapacity;

    @OneToMany(mappedBy = "chatRoom")
    private List<Chat> chats = new ArrayList<>();

    @OneToMany(mappedBy = "chatRoom")
    private List<ChatLink> chatLinks = new ArrayList<>();

}
