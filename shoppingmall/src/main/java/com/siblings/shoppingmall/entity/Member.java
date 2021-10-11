package com.siblings.shoppingmall.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Member {
    private Long memberNo;
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberNick;
    private String memberBirth;
    private String memberAddress;
    private String memberPhone;
    private String memberAuth;
    private Integer memberPoint;
    private String memberGrade;
    private Date memberJoin;
}
