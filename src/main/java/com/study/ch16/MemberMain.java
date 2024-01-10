package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Member[]> members = new ArrayList<>();
        String selectedMenu = null;

        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름을 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();

            // 순서 1 (등록) - 5 - 4 (조회) - 6 (삭제) - 2 - 3 (수정)
            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if("1".equals(selectedMenu)) {
                /**
                 * [회원 등록하기 ]
                 * 이름 >> 김준일
                 * 주소 >> 부산 동래구
                 * << 등록이 완료되었습니다. >>
                 */

                String name = null;
                String address = null;

                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();
                System.out.println("<< 등록이 완료되었습니다. >>");

                Member[] members1 = new Member[Integer.parseInt(scanner.nextLine())];
                members.add(members1);

                for (int i = 0; i < members.size(); i++) {
                    members1 = members.get(i);
                }

            } else if("2".equals(selectedMenu)) {
                /**
                 * [ 회원 이름 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요 >> 김준일
                 * 이름 >> 김준이
                 * << 수정이 완료되었습니다. >>
                 */

                System.out.println("[ 회원 이름 수정하기 ]");
            } else if("3".equals(selectedMenu)) {
                /**
                 * [ 회원 주소 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요 >> 김준이
                 * 해당 이름의 회원이 존재하지 않습니다.
                 * 주소 >> 부산 동래구 사직동
                 * << 수정이 완료되었습니다. >>
                 */

                System.out.println("[ 회원 주소 수정하기 ]");
            } else if("4".equals(selectedMenu)) {
                /**
                 * [ 회원 이름으로 조회하기 ]
                 * 조회 할 회원의 이름을 입력하세요 >> 김준이
                 * Member 객체 toString();
                 * << 조회가 완료되었습니다. >>
                 */

                System.out.println("[ 회원 이름으로 조회하기 ]");
            } else if("5".equals(selectedMenu)) {
                /**
                 * [ 회원 전체 조회하기 ]
                 * MemberList 전체 반복 toString();
                 * << 조회가 완료되었습니다. >>
                 */

                System.out.println("[ 회원 전체 조회하기 ]");


            } else if("6".equals(selectedMenu)) {
                /**
                 * [ 회원 이름으로 삭제하기 ]
                 * 삭제 할 회원의 이름을 입력하세요 >> 김준이
                 * 삭제 된 Member 객체 toString();
                 * << 삭제가 완료되었습니다. >>
                 */
                String name = null;
                String address = null;

                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.print("삭제 할 회원의 이름을 입력하세요 >> ");
                name = scanner.nextLine();

            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료.");
    }
}
