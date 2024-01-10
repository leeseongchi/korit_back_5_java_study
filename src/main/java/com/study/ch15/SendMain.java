package com.study.ch15;

public class SendMain {

    public static void main(String[] args) {

        // <> 안에 자료형을 넣어주면 그 자료형으로 변환된다.
        // <> 를 제거해주면 Object 로 들어가게 된다.
        SendData<String> sendData1 = new SendData<>(200, "김준일");
//        send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일", "01099881916"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이", "01011112222"));
        send(sendData3);
    }

    // ? = Wild Card(와일드카드)
    // 어떤 자료형이 들어올지 모를 때 쓰거나, 모두 쓰고 싶을 때 쓴다.
    // return 자료형이 어떤 값으로 리턴 될지 모를 때는 return 자료형에도 SendData<?> 를 쓸 수 있다.
    // extends 를 입력하여 자기자신과 자식까지의 범위까지 제한 걸 수가 있다.
    // super 를 입력하여 자기자신과 부모까지의 범위까지 제한 걸 수가 있다.
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();
    }
}
