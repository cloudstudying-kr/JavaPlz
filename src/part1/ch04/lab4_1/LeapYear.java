package part1.ch04.lab4_1;

public class LeapYear {
    public static void main(String[] args) {
        System.out.printf("2020년은 윤년입니까? %b\n", isLeapYear(2020));
        System.out.printf("1900년은 윤년입니까? %b\n", isLeapYear(1900));
        System.out.printf("2000년은 윤년입니까? %b\n", isLeapYear(2000));
    }
    // 연도를 입력받아, 윤년 여부를 반환하는 메소드
    public static boolean isLeapYear(int year) {
        boolean result = false;

        if (year % 4 == 0) {
            result = true;
            if (year % 100 == 0) {
                result = false;
                if (year % 1000 == 0) {
                    result = true;
                }
            }
        }
        return result;
    }
}
