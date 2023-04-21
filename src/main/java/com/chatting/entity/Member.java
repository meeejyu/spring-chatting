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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "TB_MEMBER")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseTimeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private int memberId;

    @Column(name = "MEMBER_NAME")
    private String memberName;

    @Column(name = "MEMBER_MESSAGE")
    private String memberMessage;

    @Column(name = "MEMBER_LOGINID")
    private String memberLoginId;

    @Column(name = "MEMBER_PW")
    private String memberPw;

    @OneToMany(mappedBy = "member")
    private List<ChatLink> chatLinks = new ArrayList<>();
}
