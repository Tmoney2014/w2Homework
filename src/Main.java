//package springHomework;

class Bus {
    int maxPassenger = 30;
    int totalPassenger =0;
    int intake = 0;
    int busNum;
    int gas =0;
    int speed =0;
    String working;
    String notWorking;

    public Bus(int num) {
        this.busNum = num;
    }

    public void Gas(int gas){
        this.gas = gas;

    }

    public void Speed(int speed){
        this.speed = speed;

    }

    public void passenger(int totalPassenger) {
        this.totalPassenger++;
        this.intake+= 1500;
    }

    public void state(String working){
        this.working = working;
    }

    public int getBusNum(){
        return busNum;
    }
    public int getTotalPassenger(){
        return totalPassenger;
    }
    public int getMaxPassenger(){
        return maxPassenger;
    }

    public int getGas(){
        return gas;
    }

    public int getIntake(){
        return intake;
    }

//    public int getMaxPassenger(){
//        return maxPassenger;
//    }

    public int getSpeed(){
        return speed;
    }

    public void showInfo(){
        System.out.println("Bus"+this.getBusNum()+"got"+this.getTotalPassenger()+"passengers"+"of"+this.getMaxPassenger()+"speed"+this.getSpeed()+"gas"+this.getGas()+"total income"+this.getIntake());
    }
}

class passinger {



}

//package springHomework;
public class Main {
    public static void main(String[] args) {

        Bus bus115=new Bus(115);
        bus115.showInfo();


    }
}

//1. **아래의 정보를 가지는 ‘Bus’ 클래스 모델링**
//        - 포함해야 할 정보
//        1. 최대 승객수
//        2. 현재 승객수
//        3. 요금
//        4. 버스 번호
//        5. 주유량
//        6. 현재 속도
//        7. 상태
//          * 운행, 차고지 행
//        - 기능
//        1. 운행
//        2. 버스 상태 변경
//        3. 승객 탑승
//        4. 속도 변경
//
//        **요구사항**
//
//        - 버스 번호
//        - 버스 객체 생성시 번호는 고유값으로 생성되어야 합니다.
//        - 버스 상태 변경
//        - 버스 객체 생성시 최초 상태는 **‘운행’** 상태가 되며
//        - 주유량이 떨어지거나, 운행을 종료할 때 **‘차고지행’** 상태로 변경 합니다.
//        - 10미만일 경우 ‘주유가 필요하다’는 메시지를 출력해 주세요
//        - 승객 탑승
//        - 승객 탑승은 **‘최대 승객수’** 이하까지 가능하며 **‘운행 중’**인 상태의 버스만 가능합니다.
//        - 탑승시 현재 승객수가 증가되어야 합니다.
//        - 속도 변경
//        - 주유 상태를 체크하고 주유량이 10 이상이어야 운행할 수 있습니다.
//        - 경고메시지
//        - 주유량을 확인해 주세요.
//        - print문으로 출력
//        - 변경할 속도를 입력 받아 현재 속도에 추가 하거나 뺄 수 있어야 합니다.