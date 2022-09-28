import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lab #: ");
        int labNum = sc.nextInt();

        String lab2 = "2022-10-28";
        String lab3 = "2022-11-23";
        String lab4 = "2022-12-07";

        Date date1 = new Date();
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");

        if(labNum == 2) {
            try {
                date1 = sdf.parse(lab2);

            } catch (Exception e) {
                System.out.println(e);

            }
            long diff = date1.getTime() - date.getTime();

            System.out.println((diff / (1000 * 60 * 60 * 24)) + " days left until lab " + labNum);
        }
        else if(labNum == 3) {
            try {
                date1 = sdf.parse(lab3);

            } catch (Exception e) {
                System.out.println(e);

            }
            long diff = date1.getTime() - date.getTime();

            System.out.println((diff / (1000 * 60 * 60 * 24)) + " days left until lab " + labNum);

        }else if(labNum == 4){
                try {
                    date1 = sdf.parse(lab4);

                }catch (Exception e) {
                    System.out.println(e);

                }
                long diff = date1.getTime() - date.getTime();

                System.out.println((diff / (1000 * 60 * 60 * 24)) + " days left until lab " + labNum);
        }
    }
}


