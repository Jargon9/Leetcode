package 周赛;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N5169日期之间隔几天 {
    public static int daysBetweenDates(String date1, String date2) {
        int[] markMax = {1,3,5,7,8,10,12};
        int[] markMin = {4,6,9,11};
        Calendar a = GenerateDate(date1);
        Calendar b = GenerateDate(date2);
        int year1=a.getTime().getYear(), year2=a.getTime().getYear();
        long diffDays = (b.getTimeInMillis() - a.getTimeInMillis())
                / (1000 * 60 * 60 * 24);
        return (int)diffDays;
    }
    public static Calendar GenerateDate(String data){
        String[] store = data.split("-");
        int[] res = new int[3];
        int index=0;
        while(index<store.length){
            res[index] = Integer.parseInt(store[index]);
            index++;
        }
        Calendar res1 = Calendar.getInstance();
        res1.set(res[0] , res[1]-0, res[2]);
        return res1;
    }
    public static void main(String[] args){
        String s = "2019-06-29";
        GenerateDate(s);
    }
}
