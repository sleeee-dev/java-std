package ch06;

/*
메소드 == 함수
1. 작업단위로 문장들을 묶은 것
2. 값(입력)을 받아서 처리하고, 결과를 반환(출력)

장점 : 코드 중복을 줄임, 코드 관리가 쉽다, 코드 재사용가능,

메소드 = 선언부 + 구현부

반환타입 메소드이름 (타입 변수명, 타입 변수명, ...){
//메소드 호출시 소행될 코드
}

int add(int a, int b){
int result = x+y;
return result;
}
int result = add(3,5); //

메소드이름(값1, 값2,...); //  메소드 호출하기
void => 반환타입이 없음

 */

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath(); // 클래스 객체 선언
        long result = mm.max(5L, 3L); // 메소드를 호출하고 반환값을 저장하기!!
        long result1 = mm.add(5L, 3L);
        // mm이라는 MyMath타입 객체의 add메소드 사용(호출) : long 타입이라 뒤에 L붙였으나 L안붙여도 무방함. 메소드 연산 결과: 5+3 = 8
        long result2 = mm.subtract(5L, 3L); // 2
        long result3 = mm.multiply(5L, 3L); // 15
        double result4 = mm.divide(5L, 3L); // 1.666666666...
        mm.printGugudan(3); // 2~9단 사이라서 메소드 연산 실행되어 출력
        mm.printGugudan(12); // 2~9단 사이가 아니라서 메소드 종료
        System.out.println("max(5L, 3L) = "      + result);
        System.out.println("add(5L, 3L) = "      + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = "   + result4);
    }
}

class MyMath { //MyMath 클래스 안에 사칙연산 메소드 저장
    void printGugudan(int dan){
        if(!(2<=dan && dan <=9))
            return; // 입력받은 단(dan)이 2~9가 아니면 메소드 종료하고 빠져나오기
        for(int i=1; i<=9;i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
    }

    long add(long a, long b) {
        long result = a+b;
        return result;
        //	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
    }
    //a,b 중 큰 값 출력하기
    long max(long a, long b){
        return (a > b) ? a : b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
