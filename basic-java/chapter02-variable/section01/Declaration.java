package section01;

public class Declaration {
    public static void main(String[] args) {
        // Java는 하나의 변수에 하나의 타입만 지정할 수 있습니다.

        // 변수는 변수에 어떤 타입을 사용할건지, 그리고 어떤 변수의 이름이 무엇인지를 결정합니다.
        int age; // 좌측의 int는 변수의 타입, age는 변수의 이름입니다.
        double weight; // 좌측의 double은 변수의 타입, weight는 변수의 이름입니다.

        int x, y, z; // 변수는 콤마(,)를 사용해서 한번에 여러개를 선언할 수 있습니다.
        
        // 변수 이름의 규칙

        // 변수명의 시작은 문자로 시작하거나 혹은 '$', '_'로 시작하여야 하고, 숫자로 시작할 수 었습니다.
        int price;
        int _abs;
        int $bb;
        // int 112p; 잘못된 선언
        // int @@a; 잘못된 선언

        // 영어 대소문자를 구별합니다.
        int AA;
        int aa;

        // 관례로 camelCase를 사용합니다.
        // 첫 시작은 소문자로 시작하고 새로운 단어의 시작을 대문자로 합니다.
        int firstName;
        int maxCarSpeed;

    }
}
