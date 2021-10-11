package com.siblings.shoppingmall.service;

import com.siblings.shoppingmall.entity.Member;
import com.siblings.shoppingmall.controller.MemberController;
import com.siblings.shoppingmall.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final Logger log = LoggerFactory.getLogger(MemberController.class);

    private final MemberRepository memberRepository;


    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> lists() throws Exception {
        return null;
    }

    @Override
    public Long join(Member member) throws Exception {
        member.setMemberNo(memberRepository.getNo());
        memberRepository.save(member);
        return member.getMemberNo();
    }
}
