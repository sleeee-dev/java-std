package ch06;

/*
1. 인스턴스(객체) 메서드
- 객체 생성 O
- 인스턴스 변수,멤버 (iv, im) 사용함

iv : 인스턴스 변수 - 사용가능
cv : 클래스 변수 - 언제나 사용 가능

인스턴스 메서드 - 호출 가능
static 메서드 - 호출 가능



* 객체 = iv(변수) 묶음


2. static 메서드 = 클래스 메서드
= static + 인스턴스 메서드
- 객체 생성 X => 객체 생성 없이 호출 가능한 메서드!
- lv 사용함 iv 사용 불가 => 즉 iv 사용하지 않을 때 메서드 앞에 static 붙이면 된다

iv : 인스턴스 변수 - 사용불가 why? 객체 생성 후에 호출이 가능하므로! static 메서드에 객체 생성 유무를 알 수 없으므로 사용 불가
cv : 클래스 변수 - 언제나 사용 가능

인스턴스 메서드 : 호출 불가 why? 인스턴스 메서드는 객체 생성이 필요하기 때문에.. static 메서드에서 객체 생성 유무를 알 수 없으므로 호출 불가
즉, iv 사용과 인스턴스 메서드 사용에 대한 기준?은 같다! 객체 생성의 유무!!
static 메서드 : 호출 가능

 */

class MyMath2 {
    long a, b;

    // 인스턴스 변수 a, b만을 잉요해서 작업하므로 매개변수가 필요없다.
    long add()		{ return a + b; }  // a, b는 인스턴스 변수 (iv)
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long   add(long a, long b)		 { return a + b; }  // a, b는 지역변수(lv)
    static long   subtract(long a, long b)   { return a - b; }
    static long   multiply(long a, long b)   { return a * b; }
    static double divide(long a, long b) { return a / (double)b; }

}


class Ex6_9 {
    public static void main(String args[]) {
        // 클래스 메서드 호출. 인스턴스 생성없이 호출가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2(); // 인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
