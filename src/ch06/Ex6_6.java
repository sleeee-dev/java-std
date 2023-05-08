package ch06;
/*
기본형 매개변수
 */

class Data { int x; }// 클래스 생성

class Ex6_6 {
    public static void main(String[] args) {

        Data d = new Data(); //Data타입의 객체 d생성
        d.x = 10; //객체 d의 x에 10 저장
        System.out.println("main() : x = " + d.x); //10

        change(d.x); //메소드 change에 d.x넣어서 실행 : x = 1000; : 메소드 종료 x=1000 이것도 종료
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x); //10 메소드가 종료되었으므로 다시 d.x=10 으로 돌아옴

    }

    static void change(int x) { // 기본형 매개변수 : 읽기만 가능!!!!
        // => 메소드 끝나고 나서도 값이 유지되도록 하려면 참조형 매개변수를 사용해야한다.
        x = 1000; //지역변수 : 메소드 내에서만 유효함
        System.out.println("change() : x = " + x); // 1000 : 메소드 끝~
    }
}


