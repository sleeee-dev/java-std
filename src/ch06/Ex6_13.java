package ch06;

/*
!주의!
참조변수 this =/= 생성자 this()

참조변수 this
- 인스턴스 자신을 가리키는 참조변수
- 인스턴스 메서드(생성자 포함)에서 사용가능
- 같은 클래스 안에서는 this 생략 가능
- but iv(인스턴스 변수)와 lv(지역변수_의 이름이 같을때는 생략 불가 (iv와 lv 구별하기 위해 사용)
- 즉, this.iv = lv; 이렇게 사용한다.
- static 메소드에서는 this 사용 불가
- 인스턴스가 생성됐는지 구분안되므로... => iv 사용 불가한 이유와 같음

 */

class Car2 {
    String color;        // 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;            // 문의 개수

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) { //Car2(String color, String gearType, int door) {..} 호출
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue"); //Car2() { this("white", "auto", 4);} 호출

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
