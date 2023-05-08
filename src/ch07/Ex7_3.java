package ch07;

class Ex7_3 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 { int x=10; }

class Child2 extends Parent2 { // 자식 클래스에서 x를 따로 초기화 시키지 않았으므로~ 부모 클래스에서 상속받아서
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x="+ super.x); // this.x와 super.x 가 같다.
    }
}