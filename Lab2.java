import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import java.util.Date;
public class Lab2{
    public static long dateDifferenceInDays(Date date1, Date date2){
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        long diff = date1.getTime() - date2.getTime();
        long result = Math.abs(-(diff / (1000 * 60 * 60 * 24)));
        return result;
    }
    public static void main(String[] args) {
        System.out.println("CHanged");
        System.out.println("CHanged");


        Scanner scDate1 = new Scanner(System.in);
        Scanner scDate2 = new Scanner(System.in);
        Scanner scDatePickerInt = new Scanner(System.in);



        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");


        String lab2Date = "2022-10-26";
        String lab3Date = "2022-11-23";
        String lab4Date = "2022-12-07";
        String finalExamDate = "2022-12-19";
        Date currentDate = new Date();
        String date1Str;
        String date2Str;
        Date date1 = new Date();
        Date date2 = new Date();

        
     
        System.out.println("Enter date 1: ");
        date1Str = scDate1.next();
        try {
            date1 = new SimpleDateFormat("MM/dd/yyyy").parse(date1Str);

        } catch (Exception e) {
           System.out.println(e);
        }        System.out.println("Enter date 2: ");
        System.out.println("Please pick a dates from the saved dates such as " +
            "lab2, lab3, lab4 or final. Enter 1 for lab2, 2 for lab3, 3 for lab4 and 4 for final exam");
        System.out.println("If you want to enter a custom date press 5");
        int datePickerInt = scDatePickerInt.nextInt();

        
        switch(datePickerInt){
            case 1:
                try {   
                    date2 = sdf.parse(lab2Date);

                } catch (Exception e) {
                    System.out.println(e);

                }
                break;
            case 2:
                try {   
                    date2 = sdf.parse(lab3Date);

                } catch (Exception e) {
                    System.out.println(e);

                }
                break;
            case 3:
                try {   
                    date2 = sdf.parse(lab4Date);

                } catch (Exception e) {
                    System.out.println(e);

                }
                break;
            case 4:
                try {   
                    date2 = sdf.parse(finalExamDate);

                } catch (Exception e) {
                    System.out.println(e);

                }
                break;
            case 5:
                System.out.println("Enter a custom date: " );
                date2Str = scDate2.next();
                try {
                    date2 = new SimpleDateFormat("MM/dd/yyyy").parse(date2Str);

                } catch (Exception e) {
                   System.out.println(e);
                }
                break;
            default:
                date2 = new Date();
                break;

        }
        long diff = dateDifferenceInDays(date1, date2);
        System.out.println("The difference: " + diff);
    }      
            
        


           
    }
