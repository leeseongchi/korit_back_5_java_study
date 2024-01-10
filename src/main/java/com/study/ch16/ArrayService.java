package com.study.ch16;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {

    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1]; // 기존보다 하나 많아야한다.
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;

        strArray[strArray.length - 1] = str; // 배열의 끝에 넣어주겠다.
    }

    public void remove(int index) {
        // 기존보다 크기가 1 적은 배열을 새로 만든다. o
        // 매개변수로 받은 인덱스의 값을 기준으로 작은 index 들은 그대로 옮기고 큰 인덱스들은 -1하여 옮긴다.
        // strArray의 배열을 새로운 배열로 바꾼다. o
        String[] newArray = new String[strArray.length - 1];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1];
//            if(i < index) {
//                newArray[i] = strArray[i];
//            }else {
//                newArray[i] = strArray[i + 1];
//            }
       }
        strArray = newArray;
    }

    public String get(int index) {
        return strArray[index];
    }

    public int indexOf(String str) {
        // 선형 탐색
        if(str == null) {
            return -1;
        }
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[ ";

        for(int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length - 1) {
                result += ", ";
            }
        }

        result += " ]";

        return result;
    }
}
