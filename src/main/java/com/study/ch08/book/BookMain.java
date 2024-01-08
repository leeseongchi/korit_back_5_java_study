package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        // 데이터자료
        // 추가(Create), 조회(Read), 수정(Update), 삭제(Delete)
        // 는 Repository에 나머지 자료는 Service에 넣는다.
        // 코드를 작성할 때 결합도는 낮추고, 응집도는 높여야 한다.

        Scanner scanner = new Scanner(System.in);
        String selectMenu = null;
        boolean loopFlag = true;

        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);


        while (loopFlag) {
            System.out.println();
            System.out.println("책 관리 프로그램");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectMenu)) {
                System.out.println("프로그램 종료중...");
                loopFlag = false;

            } else if("1".equals(selectMenu)) {
                System.out.println("<<< 책 등록 페이지 >>> ");

                String name = null;
                String kind = null;

                if(bookService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("이름: ");
                name = scanner.nextLine();
                System.out.print("종류: ");
                kind = scanner.nextLine();

                Book book = new Book(name, kind);
                bookService.append(book);

            } else if("2".equals(selectMenu)) {
                System.out.println("<<< 책 조회 페이지 >>>");
                bookService.printBookList();

            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
