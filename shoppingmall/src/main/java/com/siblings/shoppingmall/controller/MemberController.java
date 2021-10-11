package com.siblings.shoppingmall.controller;

import com.siblings.shoppingmall.entity.Member;
import com.siblings.shoppingmall.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    private final Logger log = LoggerFactory.getLogger(MemberController.class);

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/join")
    public String createForm(Model model) throws Exception{

        return "member/join";
    }

    @PostMapping("/join")
    public String create(Model model, Member member) throws Exception{

        return "";
    }














    @GetMapping
    public String memberList(Model model) throws Exception {
        log.info("컨트롤러 log");
        List<Member> members = memberService.lists();

        for (Member member : members) {
            //log.info("memberName={}", member.getMember_name());
            System.out.println("memberName= " + member.getMemberName());
        }

        return "member/lists";

    }
}
