package com.study.ch21;

import lombok.Getter;

import java.util.Map;

@Getter
public class ResponseException extends RuntimeException {

    private Map<String, Object> errorMap;

    // message 만 넣는 생성자를 만들어서 메세지 내용을 출력한다.
    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }
}
