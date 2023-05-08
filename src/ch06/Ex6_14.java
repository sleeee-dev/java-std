package ch06;
/*
멤버변수의 초기화

초기화 순서
1. cv -> iv
2. 자동(0으로) -> 간단(명시적: = 대입연산자 이용) -> 복잡(static{}, 생성자 이용)
 */

class Ex6_14 {
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public Ex6_14() {
        System.out.println("생성자");
    }

    public static void main(String args[]) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
}