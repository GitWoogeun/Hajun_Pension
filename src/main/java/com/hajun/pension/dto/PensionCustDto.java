package com.hajun.pension.dto;

import lombok.Data;

@Data
public class PensionCustDto {

    private int custNo;                        // 고객번호
    private String custId;                    // 고객아이디
    private String custPassword;       // 고객비밀번호
    private String custName;              // 고객명
    private String custAddress;         // 고객주소
    private String custPhonNumber; // 고객휴대번호
    private String socialIdYn;             // 소셜아이디여부
    private String regDate;                 // 회원가입날짜
    private String modDate;                // 회원수정날짜
    private String delDate;                  // 회원삭제날짜
}
