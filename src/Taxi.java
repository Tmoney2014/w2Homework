class Taxi {
    int taxiNum;
    int gas;
    int speed;
    String whereAt;
    int minDis;
    int disAt;
    int minCost;
    int disCost;
    String state;
    int totalCost;


    public Taxi(int taxiNum, int gas, int speed, String whereAt, int disAt) {
        this.taxiNum = taxiNum;
        this.whereAt = whereAt;
        this.minCost = 2000;
        this.gas = gas;
        this.speed = speed;
        this.minDis = 10;
        this.disCost = 500;
        this.disAt = disAt;
        this.totalCost = totalCost;

    }

    public String getState() {
        if (gas > 10) {
            state = "일반";
        } else {
            state = "운행불가";
            System.out.println("기름을 확인해 주세요");
        }
    }

    public int getTaxiNum() {
        return taxiNum;
    }

    public int getGas() {
        return gas;
    }

    public int getSpeed() {
        return speed;
    }

    public String getWhereAt() {
        return whereAt;
    }

    public int getMindis() {
        return minDis;
    }

    public int getDisAt() {
        return disAt;
    }

    public int getNewPassener() {
        if (state == "일반") {
            System.out.println("손님이 탑승하셨습니다");
            state = "운행중";
        } else {
            System.out.println("탑승불가");
        }
    }

    public int getTotalCost() {
        if (disAt >= minDis){
            return totalCost = 2000;

        }else{
            ((disAt - minDis) * 500) + 2000 = totalCost;
            return totalCost;
        }


    }

    public void showInfoTaxi() {
        System.out.println(getTaxiNum() + getState() + getGas() + getSpeed() + getWhereAt() + getDisAt() + getDisAt());
    }
}



public class Main {
    public static void main(String[] args) {

        Taxi taxi12 = new Taxi(12, 15, 50, "대구", 20);
        taxi12.showInfoTaxi();
    }
}

