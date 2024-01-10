package com.study.ch15;

public class VipMember extends Member {

    private final String GRADE = "VIP";

    // Member 클래스 안에는 AllArg 만 있고, NoArg 가 없기 때문에 AllArg 를 생성을 해줘야 한다.
    public VipMember(String name, String phone) {
        super(name, phone);
    }
}
