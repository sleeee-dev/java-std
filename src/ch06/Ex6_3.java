package ch06;


public class Ex6_3{
    public static void main(String[] args) {
        System.out.println("Card.width = "  + Card.width); //100
        System.out.println("Card.height = " + Card.height); //250

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        //Herat, 7, 100, 250
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
        //Spade, 4, 100, 250

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
//        c1.width = 50;
//        c1.height = 80;
        //c1의 w,h만 변경될까? -> X cv라서 공통변수니까 c2의 w,h도 같이 바뀌게 된다
        //그리고 이렇게 사용할수는 있지만 iv로 혼동할 수 있으므로 가급적이면 클래스 이름으로
        Card.width = 50;
        Card.height = 80;
        //cv는 이렇게 쓰기 권장

        //if c1의 k,n 바꿔보면???
        System.out.println("c1의 kind와 number를 각각 Diamond, 5로 변경합니다.");
        c1.kind = "Diamond";
        c1.number = 5;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        //Herat, 7, 50, 80 -> Diamond, 5, 50, 80
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
        //Spade, 4, 50, 80
    }
}

// 카드 무늬, 숫자 : 개별 iv
// 카드 폭, 높이 : 공통 cv -> cv = static iv
//왜 cv 사용? 같은 값을 중복으로 저장하면 메모리 낭비이므로 ~
class Card {
    String kind ;				// 카드의 무늬 - 인스턴스 변수
    int number;				    // 카드의 숫자 - 인스턴스 변수
    static int width = 100;		// 카드의 폭  - 클래스 변수
    static int height = 250;	// 카드의 높이 - 클래스 변수
}
