package com.my_location.member.service;

import com.my_location.member.mapper.MemberMapper;
import com.my_location.member.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public MemberVO getMember(String id) {
        return memberMapper.getMember(id);
    }

    @Transactional
    public int insertMember(MemberVO memberVO) {
        memberVO.setReg_ip("127.0.0.1");
        return memberMapper.insertMember(memberVO);
    }
}
