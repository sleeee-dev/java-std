package ch06;

class Data2 { int x; }

class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x); //10

        change(d); //1000
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x); //1000
    }

    static void change(Data2 d) { // 참조형 매개변수 : 읽기, 쓰기 둘 다 된다!!!!
        // Data d 를 넣은것 = 객체의 리모콘을 준 셈. 메소드가 객체를 사용할 수 있게 됨.
        // 메소드가 종료되어도 이 메소드에서 설정한 값이 유지된다.
        d.x = 1000; //d.x에 저장했으므로 메소드 끝나고 나서도 유지
        System.out.println("change() : x = " + d.x); // 1000
    }
}