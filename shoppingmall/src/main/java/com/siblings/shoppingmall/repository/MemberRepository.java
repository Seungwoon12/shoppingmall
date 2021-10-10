package com.siblings.shoppingmall.repository;

import com.siblings.shoppingmall.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository {

    public List<Member> memberList() throws Exception;
}
