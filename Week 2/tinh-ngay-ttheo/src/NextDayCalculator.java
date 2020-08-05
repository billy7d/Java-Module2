import java.util.Scanner;

public class NextDayCalculator {
    public static int getDaysOfMonth(int month) {
        switch (month){
            case 1,3,5,7,8,10,12:
                    return  31;

            case 4,6,9,11:
                 return 30;

            case 2:
                //bo sung leapyear
                break;
            default:
                System.out.println("Nhap sai");
                break;

        } return getDaysOfMonth(month);

    }

    public static int getNextDay(int day,int month){
        if (day == getDaysOfMonth(month)){
            day = 1;
        } else if (day<getDaysOfMonth(month)){
            day +=1;
        }
        return day;
    }

    public static int getMonth(int day, int month) {
            if (day == getDaysOfMonth(month) && month < 12) {
            month += 1;
            } else if (day == getDaysOfMonth(month) && month ==12){
            month =1;
        }
            return month;
    }

    public static int getYear(int day,int month,int year) {
        if(getDaysOfMonth(month) ==31 && month ==12){
            year+=1;
        } return year;
    }

    public static String getDayMonthYear(int day,int month, int year){
        return ""+getNextDay(day,month) +"/" + getMonth(day, month)+"/"+ getYear(day, month, year);
    }
}

