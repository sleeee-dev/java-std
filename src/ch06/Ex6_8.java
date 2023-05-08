package ch06;
/*
참조형 반환타입 (어렵다아아악 코드 진행을 그림으로 그려보면서 다시 생각해보기)
 */
class Data3 { int x; }

class Ex6_8 {
    public static void main(String[] args) {
        //같은 클래스 내의 static 메소드들 사이에서는 참조변수를 생략할 수 있다.
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x ="+d.x); //10
        System.out.println("d2.x="+d2.x); //10
    }

    static Data3 copy(Data3 d) {
        //static 메소드는 객체 생성 없이 호출 가능
        //메소드의 반환타입이 참조형 = 객체의 주소를 반환한다 or 객체를 반환한다
        //즉 반환타입과 변수의 타입이 일치해야한다.
        //변수의 타입이 참조형이므로 반환타입도 참조형이 된다.
        Data3 tmp = new Data3();    // 새로운 객체 tmp를 생성한다.

        tmp.x = d.x;  // d.x의 값을 tmp.x에 복사한다.

        return tmp;   // 복사한 객체의 주소를 반환한다.
    }
}