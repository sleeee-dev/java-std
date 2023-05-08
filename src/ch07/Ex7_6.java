package ch07;

/*
패키지
- 서로 관련된 클래스의 묶음
- 클래스는 클래스 파일, 패키지는 폴더, 하위 패키지는 하위 폴더

import
- 패키지문과 클래스문 사이에 쓴다.
- 같은 패키지의 여러 클래스를 사용할때는 패키지명.* 으로 표시해도 됨 : 컴파일시 처리되므로 프로그램의 성능에 영향없음!

static import
- static 멤버를 사용할때, 클래스 이름을 생략할 수 있다
- ex) random(); (아래 예제들)

제어자 - 접근제어자 / 그외

접근 제어자
public
protected
default
private
- 접근제어자는 하나만
- 접근제어자를 맨 왼쪽
public static final int x = 10;

static + 멤버변수(iv) : cv : 객체 생성 없이 사용 가능
static {} : 클래스 초기화 : 복잡한 초기화 수행
static + 메서드 : static 메서드 : iv 사용 불가, instance 메서드 사용 불가
final + 클래스 : 확장불가능 즉, 상속 계층도의 가장 마지막 자손. 부모가 될 수 X ex)String, Math
final + 메서드 : 변경불가능 즉, 오버라이딩 불가능. (오버라이딩 = 조상 메서드를 덮어쓰는 것)
final + 멤버변수/지역변수 : 변경할 수 없는 상수
abstract + 클래스 = 추상클래스 : 추상메서드를 포함한 클래스
즉, 미완성 클래스 (추상 메서드를 포함하면 무조건 추상클래스)
=> 미완성 설계도. 즉 제품 생성 불가 그러므로 추상클래스의 인스턴스(객체) 생성불가
=> 추상클래스를 상속받아서 완전한 클래스(완성된 설계도, 구상 클래스)를 만든 후에 객체 생성가능
abstract + 메서드 = 추상메서드 : 몸통이 없는 메서드 즉, 미완성 메서드. 선언부 O 구현부 X

 */

import static java.lang.System.out;
import static java.lang.Math.*;

class Ex7_6 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println("Math.PI :"+Math.PI);
        out.println("Math.PI :" + PI);
    }
}