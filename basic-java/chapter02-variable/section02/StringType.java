package section02;

public class StringType {
    public static void main(String[] args) {
        // 자바는 작은 따옴표 ''와 큰따옴표 ""에는 차이가 있습니다.
        // 작은 따옴표는 char타입에 변수에 저장되며 오직 하나의 유니코드 문자를 가지게 됩니다.
        // 큰 따옴표는 String 타입 변수에 저장되며 여러 문자들이 합쳐진 문자열을 가지게 됩니다.

        char char1 = 'a';
        char char2 = '가';
        // char char3 = 'aa'; 2개의 문자가 들어가서 에러
        // char char4 = "a"; 큰따옴표를 사용해서 에러

        String string1 = "가나다";
        String string2 = "가";
        // String string3 = '가'; 작은따옴표를 사용해서 에러
        String string4 = "유영진";
        System.out.println("나는 " + string4 + "입니다.");
        // 자바에서는 String 타입이 기본 타입이 아닙니다.
        // 따라서 기본 타입과는 약간 동작 방식이 다른데, 이는 추후 챕터에서 깊게 설명드리겠습니다.
        
        // 이스케이프 문자(\)
        // 이스케이프 문자는 문자열 내에서 특별한 출력을 할 수 있게 도와줍니다.
        System.out.println("문자열 내에서도 \"큰따옴표\"를 쓸 수 있습니다.");
        System.out.println("이건 \t 탭만큼 띄어줍니다.");
        System.out.println("이건 \n 줄바꿈을 해줍니다.");
        System.out.println("이건 \\ 문자열 내에서도 이스케이프 문자가 써집니다.");
    }
}
