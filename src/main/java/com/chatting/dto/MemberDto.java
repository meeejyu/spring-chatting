package com.chatting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class MemberDto {
    
    private int memberId;

    private String memberName;

    private String memberMessage;

    private String memberLoginId;

    private String memberPw;

}
