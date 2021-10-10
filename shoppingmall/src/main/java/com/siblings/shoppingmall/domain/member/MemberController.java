package com.siblings.shoppingmall.domain.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberController {

    private final Logger log = LoggerFactory.getLogger(MemberController.class);

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public String memberList(Model model) throws Exception {
        log.info("컨트롤러 log");
        List<Member> members = memberService.memberList();

        for (Member member : members) {
            //log.info("memberName={}", member.getMember_name());
            System.out.println("memberName= " + member.getMemberName());
        }

        return "members/lists";

    }
}
