package ch07;

class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child(); // 자식 객체 생성
        c.method();
    }
}

class Parent { // 부모 클래스
    int x = 10;
}

class Child extends Parent { // 자식 클래스
    int x = 20;

    void method() {
        System.out.println("x=" + x); // 상속 했을 때, 부모클래스의 변수와 이름이 같은 변수가 자식클래스에 있을때 이를 메소드에서 구분하기위해
        System.out.println("this.x=" + this.x); // 자식 클래스 자기 자신의 변수는 this.x 로 나타내고,
        System.out.println("super.x=" + super.x); // 부모 클래스의 변수는 super.x 로 나타낸다.
    }
}