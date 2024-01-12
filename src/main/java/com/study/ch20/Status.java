package com.study.ch20;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    OK(200, "정상적인 요청"), // 생성자의 이름을 만들 수 있다.
    BADREQUEST(400, "비정상적인 요청");

    private int code;
    private String statusName;
}
