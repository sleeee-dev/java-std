package ch07;
/*
상속

class 자식클래스 extends 부모클래스 {
    //내용
}

class Parent {} //부모 클래스
class Child extends Parent {} //자식 클래스

- 자손은 조상의 모든 멤버를 상속받는다. (선택해서 받는거 X. 생성자, 초기화 블럭 제외)
- 상속을 여러번 할 수 있기 때문에 자손/조상
- 자손의 변경은 조상에 영향을 미치지 않는다.

상속 vs 포함관계 구분하기
- 대부분 포함관계이나 잘 모르겠으면 문장 만들어보기!!
상속관계 : A는 B 이다.
포함관계 : A는 B를 가지고 있다.

//포함관계
class Circle {
    point c = new Point();
    int r;
}

//상속관계
class Circle extends Point {
    int r;
}

Circle c = new Circle(); // c는 참조변수
System.out.println(c.toString); // Circle@주소값
System.out.println(c); // Circle@주소값 : println의 기능 : 참조변수를 입력하면 toString과 같은 결과가 나옴


 */

class Tv {
    boolean power; // 전원상태(on/off)
    int channel;	// 채널

    void power()       {   power = !power; }
    void channelUp()   {   ++channel;      }
    void channelDown() {   --channel;      }
}

class SmartTv extends Tv {  // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;     // 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
        stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;	// 캡션(자막) 기능을 켠다.
        stv.displayCaption("Hello, World");
    }
}