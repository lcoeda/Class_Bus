package ClassTest.classreport;

public class Bus extends PublicTransportation {
    public Bus(int num) {
        this.MAXNUMBER = 30;
        this.COUNT = 0;
        this.STATE = "운행중";
        this.NUM = 3382;
        this.GAS = 100;
        System.out.println("버스가 " + num + "대 생성");
    }

    static int payment = 1000;


    public void number() {
        System.out.println("이 차량은 " + NUM + "번입니다.");
    }

    public static void board(int n) {
        if (COUNT + n >= MAXNUMBER) {
            System.out.println("잔여 좌석을 초과해서는 탑승 불가능합니다.");
        } else {
            COUNT += n;
            System.out.println(n + "명 탑승 \n버스에 계신 승객님은 " + COUNT + "명이고."
                    + (n * payment) + "원 받았습니다");

        }
        System.out.println("잔여좌석은 " + (MAXNUMBER - COUNT) + "석입니다.");
    }


    public static void state(Boolean tf) {
        if (tf) {
            System.out.println("운행중");
        } else {
            System.out.println("차고지로 갑니다.");
        }
    }

    public void run(int t) {
        if (GAS - t <= 3) {
            System.out.println("운행이 불가능합니다. ");
        } else if (GAS - t <= 10) {
            GAS -= t; STATE = "차고지로 갑니다.";
            System.out.println("주유량이 " + GAS + "L만큼 남았습니다.\n주유가 필요합니다.");
            System.out.println(STATE);
        } else {
            GAS -= t;
            System.out.println("주유량이 " + GAS + "L만큼 남았습니다.");
        }
    }

    public static void put(int n) {
        GAS += n;
        System.out.println("남은 주유량은 " + GAS + "L입니다");
    }

    public static void conversation() {
        if (COUNT <= 0) {
        } else {
            COUNT -= 1;
            System.out.println("버스에 계신 승객님은 " + COUNT + "명입니다.");
        }

    }

    public static void main(String[] args) {
        Bus bus1 = new Bus(1);
        Bus Bus2 = new Bus(2);
        System.out.println();
        bus1.board(2);
        System.out.println();
        bus1.run(50);
        bus1.state(false);
        bus1.put(10);

        System.out.println();

        bus1.state(true);
        bus1.board(45);
        bus1.board(5);
        bus1.run(55);

        System.out.println();
    }
}