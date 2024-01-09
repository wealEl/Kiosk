public class Main {

    //콘솔 텍스트 색상을 변경하는 변수
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m";
    public static final String yellow   = "\u001B[33m" ;
    public static final String exit     = "\u001B[0m" ;
    private static void displayMainMenu() {
        System.out.println(green + "SHAKESHACK BURGER 에 오신걸 환영합니다." + exit +"\n아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");
        Kiosk kiosk = new Kiosk();
        kiosk.run();
    }
    public static void main(String[] args){
    }
}
