package ch06;

/*
클래스 : 객체를 정의해 놓은 것
용도 : 객체를 생성하는데 사용

객체 : 실제로 존재하는것. 사물 or 개념
용도 : 객체가 갖고 있는 기능과 속성에 따라 다름

클래스 : 객체
=제품설계도 : 제품
=TV설계도 : TV
=붕어빵 기계 : 붕어빵

객체지향개념

객체 = 속성(변수) + 기능(메소드)
클래스를 통해 인스턴스(객체)를 만드는 것 : 인스턴스화

클래스 : 객체 생성
객체 : 우리가 사용
객체의 사용 : 객체가 가진 속성(변수)과 기능(메소드)을 사용


클래스 작성법



 */


class Ex6_1 {
    public static void main(String args[]) {
        Tv t;                 // Tv인스턴스를 참조하기 위한 변수 t를 선언 //객체 선언
        t = new Tv();         // Tv인스턴스를 생성한다.
        t.channel = 7;        // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown();      // Tv인스턴스의 메서드 channelDown()을 호출한다. //--channel; 이 되었으므로 6
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}

class Tv {
    // Tv의 속성(멤버변수)
    String color;           // 색상
    boolean power;         	// 전원상태(on/off)
    int channel;           	// 채널

    // Tv의 기능(메서드)
    void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드
    void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드
    void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메서드
}




