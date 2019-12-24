import java.util.Scanner;
​
public class doisothanhchuBT {
    static int number;
    static String solution = "";
​
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number:");
        number = scanner.nextInt();
        run();
        System.out.println(solution);
    }
​
    public static void onedigit(int lessTen) {
        switch (lessTen) {
            case 1:
                solution += " one";
                break;
            case 2:
                solution += " two";
                break;
            case 3:
                solution += " three";
                break;
            case 4:
                solution += " four";
                break;
            case 5:
                solution += " five";
                break;
            case 6:
                solution += " six";
                break;
            case 7:
                solution += " seven";
                break;
            case 8:
                solution += " eight";
                break;
            case 9:
                solution += " nine";
                break;
        }
    }
​
    public static void twodigits(int lessTwenty) {
        switch (lessTwenty) {
            case 0:
                solution += " ten";
                break;
            case 1:
                solution += " eleven";
                break;
            case 2:
                solution += " twelve";
                break;
            case 3:
                solution += " thirteen";
                break;
            case 4:
                solution += " fourteen";
                break;
            case 5:
                solution += " fifteen";
                break;
            case 6:
                solution += " sixteen";
                break;
            case 7:
                solution += " seventeen";
                break;
            case 8:
                solution += " eighteen";
                break;
            case 9:
                solution += " nineteen";
                break;
        }
​
    }
​
    public static void lessonehundred(int firstnumber, int secondnumber) {
        switch (firstnumber) {
            case 2:
                solution += " twenty";
                break;
            case 3:
                solution += " thirty";
                break;
            case 4:
                solution += " fourty";
                break;
            case 5:
                solution += " fifty";
                break;
            case 6:
                solution += " sixty";
                break;
            case 7:
                solution += " seventy";
                break;
            case 8:
                solution += " eighty";
                break;
            case 9:
                solution += " ninety";
                break;
        }
        onedigit(secondnumber);
​
    }
​
    public static void threedigits() {
        int firstnumber = number / 100;
        onedigit(firstnumber);
        solution += " hundred";
        int secondnumber = number % 100;
        if (secondnumber > 9 && secondnumber < 20) {
            twodigits(secondnumber % 10);
        } else {
            lessonehundred(secondnumber / 10, secondnumber % 10);
        }
    }
​
    public static void run() {
        if (number < 10) {
            onedigit(number);
        }
        if (number >= 10 && number < 20) {
            twodigits(number % 10);
        }
        if (number >= 20 && number < 100) {
            lessonehundred(number / 10, number % 10);
        }
        if (number >= 100 && number < 1000) {
            threedigits();
        }
    }
}