package com.siblings.shoppingmall.repository;

import com.siblings.shoppingmall.domain.member.Member;
import com.siblings.shoppingmall.domain.member.MemberController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository {

    public List<Member> memberList() throws Exception;
}
