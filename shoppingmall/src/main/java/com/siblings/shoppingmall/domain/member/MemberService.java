package com.siblings.shoppingmall.domain.member;

import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {

    public List<Member> memberList() throws Exception;
}
