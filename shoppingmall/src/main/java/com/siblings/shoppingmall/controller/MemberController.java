package com.siblings.shoppingmall.controller;

import com.siblings.shoppingmall.entity.Member;
import com.siblings.shoppingmall.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/member")
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
=======
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
>>>>>>> 5c5aae017ab6ee97a09d7bc5eb0dba69b13b2f6e
public class MemberController {

    private final Logger log = LoggerFactory.getLogger(MemberController.class);

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

<<<<<<< HEAD

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        log.info("call test");
        return "test success!";
    }

=======
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        log.info("vue-spring connection test");
        return "TEST SUCCESS!!";
    }


>>>>>>> 5c5aae017ab6ee97a09d7bc5eb0dba69b13b2f6e
    @GetMapping("/join")
    public String createForm(Model model) throws Exception{

        return "member/joinForm";
    }

    @PostMapping("/join")
    public String create(@ModelAttribute Member member) throws Exception{
        memberService.join(member);
        return "redirect:http://localhost:8081/";
    }

    @GetMapping("/success")
    public String success() throws Exception{
        return "member/success";
    }

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Member>> memberList(Model model) throws Exception {
        log.info("멤버 리스트");
        List<Member> members = memberService.lists();

        return new ResponseEntity<>(members, HttpStatus.OK);

    }
}