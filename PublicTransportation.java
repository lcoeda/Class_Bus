package ClassTest.classreport;

public class PublicTransportation {

    public static int MAXNUMBER;
    public static int COUNT;
    int TIME;
    String STATE = "운행";
    public int NUM=0;
    public static int GAS=100;
    public int SPD;

    public void number(){
        System.out.println("이 차량은 "+NUM+"번입니다.");
    }
    public static void board(){
    }

    public static void conversation() {
    }

    public void gas(){
        System.out.println("이 차량에 남은 가스는 "+GAS+"L입니다.");
    }

    public void speed(){
        System.out.println("이 차량의 속력은 "+SPD+"입니다.");
    }
    public void start(){
        if(TIME>=0&&TIME<=6){
            System.out.println("운행시간이 아닙니다.");
        }else{
            System.out.println("운행중입니다.");
        }
    }
}