import java.util.Scanner;
public class Kiosk {

    public Kiosk(){
    }

    public void run(){

        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Burger\n2. Drink\n3. 주문하기\n4. 종료");
            int i = sc.nextInt();

            if(i == 1) {
                System.out.println("1. ShackBurger / 2. BeefBurger / 3. Shroom Burger / 4. CheeseBurger / 5. Hamburger");
                int select = sc.nextInt();

                if (select == 1) {
                    Burgers ShackBurger = new Burgers("ShackBurger", 6.9);
                    cart.addMenu(ShackBurger);

                } else if (select == 2) {
                    Burgers BeefBurger = new Burgers("BeefBurger", 8.9);
                    cart.addMenu(BeefBurger);
                } else if (select == 3) {
                    Burgers Shroom_Burger = new Burgers("Shroom Burger", 9.4);
                    cart.addMenu(Shroom_Burger);
                } else if (select == 3) {
                    Burgers Cheeseburger = new Burgers("Shroom Burger", 6.9);
                    cart.addMenu(Cheeseburger);
                } else if (select == 3) {
                    Burgers Hamburger = new Burgers("Shroom Burger", 5.4);
                    cart.addMenu(Hamburger);
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }else if (i == 2) { // Drink 선택
                    System.out.println("1. Water / 2. Coke");

                    int select = sc.nextInt();

                    if (select == 1) {
                        Drinks water = new Drinks("Water", 1000);
                        cart.addMenu(water);
                    } else if (select == 2) {
                        Drinks coke = new Drinks("Coke", 2000);
                        cart.addMenu(coke);
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (i == 3) { // 주문하기 선택
                    if (cart.isEmpty()) {
                        System.out.println("주문을 먼저 해주세요.");
                    } else {
                        cart.pay();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }



