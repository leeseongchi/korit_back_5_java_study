package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public interface MemberService {
    // 강제성으로 무조건 예외처리를 할 때 throws 를 쓴다.
    public void printMemberList(ArrayList<Member> members) throws Exception;
}
