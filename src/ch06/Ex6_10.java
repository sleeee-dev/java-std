package ch06;
/*
오버로딩
: 한 클래스 안에 같은 이름의 메서드 여러개 정의 하는 것

오버로딩 성립 조건
1. 메서드 이름이 같아야 한다.
2. 매개변수의 개수 또는 타입이 달라야 한다.
3. 반환 타입은 영향없다.

메서드의 이름이 같다 => 하는 작업이 같다! but 매개변수가 다름!

 */

class Ex6_10 {
    public static void main(String args[]) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과:"    + mm.add(3,3));
        //얘가 mm.add(a,b) 를 뭘 실행시켜야하는지 고민하느라 에러.. (두번째 add에 넣을지 세번째 add에 넣을지) ambiguous(모호하다) 라고 나옴
        //순서 : add 실행 -> println 실행 : println 실행되려면 안에 문자가 완성되어야 하므로! (출력 결과를 보면 알 수 있음)
        System.out.println("mm.add(3L, 3) 결과: "  + mm.add(3L,3));
        System.out.println("mm.add(3, 3L) 결과: "  + mm.add(3,3L));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) { //이거 주석처리 하고 실행시키면 18 line 에러난다
        System.out.print("int add(int a, int b) - ");
        return a+b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a+b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a+b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) {		// 배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int i=0; i < a.length;i++)
            result += a[i];

        return result;
    }
}
