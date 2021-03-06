package part1.ch04.ex4_1;

public class AirConditioner {
    public static void main(String[] args) {
        turnOn(30);
        turnOn(19);
    }

    // 입력된 현재 온도를 기준 삼아, 에어컨 가동 문구를 출력
    public static void turnOn(int temperature) {
        if (temperature > 25) {
            System.out.printf("현재 온도 %d도, 에어컨을 가동합니다.", temperature);
        }
    }
}
