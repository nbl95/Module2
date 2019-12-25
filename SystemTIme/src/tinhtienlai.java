import java.util.Scanner;

public class tinhtienlai {

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter invest mount");
        money = input.nextDouble();

        System.out.println("Enter number of the months");
        month = input.nextInt();

        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset = money*(interset_rate/100)/12*3;
        }
        System.out.println("total of interset" + total_interset);
    }


}
