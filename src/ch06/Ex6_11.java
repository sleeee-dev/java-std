package ch06;

/*
생성자
: 인스턴스(객체 = iv 묶음) 초기화 메서드
즉, iv 초기화 메서드

- 생성자는 더 직관적으로 인스턴스 초기화를 할 수 있음
- 생성자가 없으면 기본생성자를 만들어줌
- 생성자는 이름이 클래스 이름과 같아야 한다.
- 오버로딩이 가능하므로 같은 이름으로 여러개 만들기 가능! 즉, 매개변수 유무, 타입 다르면 됨
- 리턴값이 없다 => 앞에 void를 안붙임
- 하나의 클래스에는 최소 하나의 생성자가 존재

=> void가 없는, 클래스와 같은 이름의 메소드

기본 생성자
- 매개변수가 없는 생성자
- 생성자가 하나도 없을때 컴파일러가 기본 생성자 자동으로 추가

 */

class Data_1 { //생성자가 없음 => 컴파일러가 기본 생성자 Data_1(){} 를 자동으로 추가해 줌
    int value;
}

class Data_2 { //생성자가 있음 => 컴파일러가 기본 생성자 Data_2(){} 를 추가해주지 않아서 직접 작성해야함
    int value;

    Data_2(int x) {   // 매개변수가 있는 생성자.
        value = x;
    }
}

class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1(); // 클래스 Data_1에 생성자가 없어서 기본 생성자 Data_1(){}를 자동으로 생성해줬기때문에 가능
//        Data_2 d2 = new Data_2(); // compile error발생
//        => why? 클래스 Data_2에는 생성자가 Data_2(int x)가 있는데 여기에는 안에 매개변수가 있는데
//        실제로 생성한건 매개변수가 없는 생성자(기본생성자)이기때문에...
//        기본 생성자 Data_2(){} 를 추가해주어야함!
    }
}