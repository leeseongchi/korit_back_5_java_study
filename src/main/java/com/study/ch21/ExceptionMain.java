package com.study.ch21;

public class ExceptionMain {
    public static void main(String[] args) {

        int[] numArray = new int[] {1,2,3,4,5};

        // 1. 실행 되기 전에 예외처리를 해주는 것이 있다.
        // 2. 실행 된 후에 예외처리를 해주는 것이 있다. (RuntimeException)
        // 3. 입력장치와 출력장치가 없을 때 예외처리를 해준다. (Input Output Exception)
        // 4. DB 에서 예외가 발생 했을 경우 - SQL Exception

        for(int i = 0; i < 6; i++) {
            // 예외가 일어날 거 같은 코드를 try 안에 넣는다.
            try {
                System.out.println(numArray[i]);
                // catch 가 예외가 터졌을 때 잡아준다.
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("예외가 발생했다.");
            }
        }

        System.out.println("프로그램 정상 종료");

    }
}
