package com.my_location.member.mapper;

import com.my_location.member.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    MemberVO getMember(String id);
}
