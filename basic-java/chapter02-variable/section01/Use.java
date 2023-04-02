package section01;

public class Use {
    public static void main(String[] args) {
        int hour = 10;
        int minute = 35;
        int second = 50;

        // 값이 선언되어 있는 변수는 다른 실행문에서 사용할 수 있습니다.
        System.out.println("현재 시간은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");

        // 값이 선언되어 있지 않는 변수는 다른 실행문에서 사용하면 컴파일 에러가 발생합니다.
        int x;
        // System.out.println(x); 에러 발생

        int apple = 5;
        int banana = 3;
        // 변수에 값을 저장할 때는 이미 값이 저장된 변수들을 이용할 수 있습니다.
        int fruits = apple + banana;
        System.out.println("과일 갯수는 " + fruits + "개 입니다.");
    }
}
