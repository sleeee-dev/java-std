package ch06;

/*
객체 배열 == 참조변수 배열

Tv tv1, tv2, tv3;
다음과 같은 Tv타입 참조변수 3개를 배열로 나타내기
배열 선언 : 타입[] 변수이름 = new 타입[길이]
-> Tv[] tvArr = new Tv[3];

 */

public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
        Tv t2 = new Tv(); // t1, t2 다른 주소에 각각의 인스턴스(객체) 저장
        System.out.println("t1의 channel값은 " + t1.channel + "입니다."); //0
        System.out.println("t2의 channel값은 " + t2.channel + "입니다."); //0

        t1.channel = 7;	// channel 값을 7으로 한다.
        t2 = t1; // -> t2 객체에 t1 객체 정보가 들어감 -> 즉 같은 주소를 가짐
        System.out.println("t1의 channel값을 7로 변경하였습니다."); //7

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");//7
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");//0 였는데 t2 = t1; 선언 이후로는 7이 된다.
    }
}