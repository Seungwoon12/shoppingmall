package com.siblings.shoppingmall.service;

import com.siblings.shoppingmall.entity.Member;

import java.util.List;

public interface MemberService {

    public List<Member> lists() throws Exception;
    public Long join(Member member) throws Exception;
}
