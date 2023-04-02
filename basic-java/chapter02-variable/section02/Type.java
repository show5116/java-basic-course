package section02;

public class Type {
    public static void main(StringType[] args) {
        // 자바는 총 8가지의 기본 타입을 제공합니다.
        
        // 정수형 타입
        // byte, char, short, int, long이 있습니다.
        // 컴퓨터에서 1byte는 8bit만큼의 크기를 의미합니다.
        // bit란? 컴퓨터에서 정보를 표현해주는 최소한의 단위로, 하나의 2진법 데이터 입니다.
        // 즉 1byte는 2진수 8개로 총 2^8 = 256, 256종류의 정보를 나타낼 수 있습니다.
        // byte는 -2^7 ~ (2^7 - 1) 즉 -128 ~ 127 사이의 값을 가질 수 있습니다.
        byte byte1 = 1;
        byte byte2 = -1;
        byte byte3 = 127;
        // byte byte4 = 128; 에러
        byte byte5 = -128;
        // byte byte6 = -129; 에러

        // char형은 하나의 문자데이터를 가지는 문자 리터럴 이라고 합니다.
        // 문자 리터럴은 유니코드(Unicode)로 변환되어 저장됩니다.
        // 값을 출력할 때 다른 정수형 타입과 다르게 유니코드의 결과 문자를 출력합니다.
        // char형은 2byte의 크기로 오직 양수의 데이터만 가져서, 0 ~ 65535 사이의 값을 가집니다.
        char char1 = 'A'; // 대문자 A는 유니코드 65번으로 65의 값을 가진것과 같습니다.
        char char2 = 65;
        byte byte7 = 'A';
        byte byte8 = 65;
        System.out.println(char1); // A
        System.out.println(char2); // A
        System.out.println(byte7); // 65
        System.out.println(byte8); // 65

        // short형은 2byte의 크기로 -2^15 ~ (2^15 - 1) 즉 -32,768 ~ 32,767 사이의 값을 가집니다.
        short short1 = 30000;

        // int형은 4byte의 크기로 -2^31 ~ (2^31 - 1) 즉 -2,147,483,648 ~ 2,147,483,647 사이의 값을 가집니다.
        int int1 = 2000000000;

        // long형은 8byte의 크기로 -2^63 ~ (2^63 - 1) 즉 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 사이의 값을 가집니다.
        // long형은 반드시 값 뒤에 소문자 l이나 대문자 L을 붙여야만 합니다.
        // 관례로 소문자 l은 숫자1과 헷갈리기 때문에 대문자를 사용합니다.
        long long1 = 9000000000000000L;

        // 실수형 타입
        // 실수란? 정수를 포함하는 소숫점을 가질 수 있는 데이터 타입입니다.
        // float, double이 있습니다.

        // float형은 총 4byte의 크기로 (1.4 * 10^-45) ~ (3.4 * 10^38) 사이의 값을 가질 수 있고,
        // 소수점 7이하 자리의 정밀도를 가집니다.
        // 자바는 소수 값을 입력하면 기본적으로 double형으로 인식합니다.
        // 따라서 float형임을 소문자f나 대문자F로 알려야 합니다.
        float float1 = 1.1f;
        //float float2 = 1.2; 에러
        float float3 = 10.99F;

        // double형은 총 8byte의 크기로 (4.9 * 10^-324) ~ (1.8 * 10^308) 사이의 값을 가질 수 있고,
        // 소숫점 15이하 자리의 정밀도를 가집니다.
        double double1 = -105.449;

        // 논리 타입
        // boolean이 있습니다.
        // boolean은 참을 의미하는 true와 거짓을 의미하는 false 둘중 하나의 값만 사용합니다.
        // 논리 리터럴은 1byte 크기를 차지합니다.
        boolean isMan = true;
        boolean isWoman = false;
    }
}
