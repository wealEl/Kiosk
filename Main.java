import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int main;
    static int burger_n;
    static int check_n;

    static List<String> orders_price = new ArrayList<>();
    //콘솔 텍스트 색상을 변경하는 변수
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m";
    public static final String yellow   = "\u001B[33m" ;
    public static final String exit     = "\u001B[0m" ;

    public static void main_println(){
        System.out.println(green + "SHAKESHACK BURGER 에 오신걸 환영합니다." + exit +"\n아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. Burgers         " + yellow + "|" + exit + " 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Forzen Custard  " + yellow + "|" + exit + " 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          " + yellow + "|" + exit + " 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            " + yellow + "|" + exit + " 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       " + yellow + "|" + exit + "장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      " + yellow + "|" + exit + "진행중인 주문을 취소합니다.");
    }

    public static void printBurgerMenu() {
        System.out.println("[ Burgers MENU ]");
        System.out.println("1. ShackBurger    " + yellow + "| " + exit + "W " + red + "6.9" + exit + yellow + " |" + exit + " 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack     " + yellow + "| " + exit + "W " + red + "8.9" + exit + yellow + " |" + exit + " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Shroom Burgger " + yellow + "| " + exit + "W " + red + "9.4" + exit + yellow + " |" + exit + " 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        System.out.println("4. Cheeseburger   " + yellow + "| " + exit + "W " + red + "6.9" + exit + yellow + " |" + exit + " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("5. Hamburger      " + yellow + "| " + exit + "W " + red + "5.4" + exit + yellow + " |" + exit + " 비프패티를 기반으로 야채가 들어간 기본버거");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ordering = true;

        while (ordering) {
            // 기본 메인 메뉴판 화면
            main_println();
            main = sc.nextInt();
            if(main == 1) {
                System.out.println(green + "SHAKESHACK BURGER 에 오신걸 환영합니다." + exit +"\n아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
                System.out.println("[ Burgers MENU ]");
                System.out.println("1. ShackBurger    "+ yellow + "| " + exit+ "W " +red + "6.9" + exit + yellow + " |" + exit+" 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("2. SmokeShack     "+ yellow + "| " + exit+ "W "+red +"8.9"+ exit + yellow + " |" + exit + " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("3. Shroom Burgger "+ yellow + "| " + exit+ "W "+red +"9.4"+ exit + yellow + " |" + exit + " 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
                System.out.println("4. Cheeseburger   "+ yellow + "| " + exit+ "W "+red +"6.9"+ exit + yellow + " |" + exit + " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("5. Hamburger      "+ yellow + "| " + exit+ "W "+red +"5.4"+ exit + yellow + " |" + exit + " 비프패티를 기반으로 야채가 들어간 기본버거");
                burger_n = sc.nextInt();
                if(burger_n == 1){
                    System.out.println(green +"\"ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\"" +exit);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println(red + "1." +exit + " 확인        " + red + "2." + exit + " 취소");
                    check_n = sc.nextInt();
                    if(check_n == 1) {
                        System.out.println("Hamburger 가 장바구니에 추가되었습니다.\n");
                        orders_price.add("W6.9");
                    }
                }else if(burger_n == 2){
                    System.out.println(green + "\"SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\"" +exit);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println(red + "1." +exit + " 확인        " + red + "2." + exit + " 취소");
                }else if(burger_n == 3){
                    System.out.println(green + "\"Shroom Burgger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\"" + exit);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println(red + "1." +exit + " 확인        " + red + "2." + exit + " 취소");
                }else if(burger_n == 4){
                    System.out.println(green + "\"Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\"" + exit);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println(red + "1." +exit + " 확인        " + red + "2." + exit + " 취소");
                }else if(burger_n == 5){
                    System.out.println(green + "\"Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\"" + exit);
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println(red + "1." +exit + " 확인        " + red + "2." + exit + " 취소");
                }
            } else if (main == 2) {
                System.out.println("[ Forzen Custard MENU ]");
                System.out.println(green + "SHAKESHACK BURGER 에 오신걸 환영합니다." + exit +"\n아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
            }else if(main == 3){
                System.out.println("[ Drinks  MENU ]");
                System.out.println(green + "SHAKESHACK BURGER 에 오신걸 환영합니다." + exit +"\n아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
            }else if(main == 4){
                System.out.println("[ Beer MENU ]");
                System.out.println(green + "SHAKESHACK BURGER 에 오신걸 환영합니다." + exit +"\n아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
            }else if(main == 5){
                System.out.println("아래와 같이 주문 하시겠습니까?");
                System.out.println("[ Orders ]");
                System.out.println("[ Total ]");
            }else if(main == 6) {
                System.out.println("[ Beer MENU ]");
                System.out.println(green + "SHAKESHACK BURGER 에 오신걸 환영합니다." + exit +"\n아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
            }
            else{
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요");
            }
        }
    }
}
