package com.my_location.member.service;

import com.my_location.member.mapper.MemberMapper;
import com.my_location.member.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public MemberVO getMember(String id) {
        return memberMapper.getMember(id);
    }
}
