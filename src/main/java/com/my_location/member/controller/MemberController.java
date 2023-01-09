package com.my_location.member.controller;

import com.my_location.member.service.MemberService;
import com.my_location.member.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("member")
@Controller
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/")
    public String signUpForm() {
        return "content/member/login";
    }

    @GetMapping("/main")
    public String main(@ModelAttribute("member") MemberVO memberVO) {
        if (memberVO.getId() == null) {
            return "redirect:/";
        }

        return "content/member/index";
    }

    @PostMapping("/login")
    public String login(MemberVO memberVO, Model model) {
        MemberVO findMember = memberService.getMember(memberVO.getId());

        if (findMember != null && findMember.getPw().equals(memberVO.getPw())) {
            model.addAttribute("member", findMember);
            return "redirect:/main";
        } else {
            return "redirect:/";
        }
    }
}
