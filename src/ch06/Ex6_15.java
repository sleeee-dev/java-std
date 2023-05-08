package ch06;

class Ex6_15 {
    static int[] arr = new int[10]; // 명시적 초기화 = 간단초기화

    static { //cv 복잡초기화 => 뭔말이여
        for(int i=0;i<arr.length;i++) {
            // 1과 10사이의 임의의 값을 배열 arr에 저장한다.
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    public static void main(String[] args) {
        for(int i=0; i<arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]);
    }
}
