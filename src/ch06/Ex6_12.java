package ch06;
/*
매개변수가 있는 생성자
- 좀 더 간결하고 직관적인, 객체지향적인 코드를 작성 할 수 있다.
-

 */

class Car {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color    = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4); // new Car: 객체 생성 ("white", "auto", 4); : 객체 초기화 및 생성자 호출

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}
