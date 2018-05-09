package com.chinasofti.utils;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2009-10-11
 * Time: 8:30:41
 * To change this template use File | Settings | File Templates.
 */
public class DateUtils {

    public static void main(String[] args) {
        System.out.println(DateUtils.getCurrentBankDate());
    }

    /**
     * 字符串转化为日期
     * @param dayStr  yyyy-MM-dd
     * @return Date 日期
     */
    public static Date parseDate(String dayStr) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date cDate = df.parse(dayStr);
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(cDate);
            return cal.getTime();
        } catch (Exception e) {
            return null;
        }
    }

    public static Date addDate(String dayStr, int days) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date cDate = df.parse(dayStr);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(cDate);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    public static String generateDateStr(Date curDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(curDate);
        String s = format.format(cal.getTime());
        return s;
    }
    public static String generateShortDateStr(Date curDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(curDate);
        String s = format.format(cal.getTime());
        return s;
    }

    public static String getYearByDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR) + "";
    }

    public static String generateCurrentDateStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        String s = format.format(cal.getTime());
        return s;
    }


    public static String getLastYear(String dayStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date cDate = df.parse(dayStr);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(cDate);
        cal.add(Calendar.YEAR, -1);
        return df.format(cal.getTime());
    }

    public static String getCurrentShowDate() {
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return format.format(new Date());
    }

    public static String getCurrentBankDate() {
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(new Date());
    }


    public static String getOffsetHoursOfDateTime(int offsetHours) {
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR_OF_DAY, offsetHours);
        return format.format(calendar.getTime());
    }

    public static String getNextDate() {
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 1);
        return format.format(calendar.getTime());
    }

    public static String getYesterdayDate() {
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -1);
        return format.format(calendar.getTime());
    }

    public static String getCurrentDateTime() {
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(new Date());
    }

    public static String getICBCTestBankDate() {
        DateFormat format = new SimpleDateFormat("HHmmss");
        return "20091230" + format.format(new Date());
    }

    public static String getPreDayStartDateTime(String dateStr) {
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(dateStr.substring(0, 4)),
                Integer.parseInt(dateStr.substring(4, 6)) - 1,
                Integer.parseInt(dateStr.substring(6)));
        calendar.add(Calendar.DATE, -1);
        return format.format(calendar.getTime()) + "000000";
    }


    public static String getNextDayStartDateTime(String dateStr) {
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(dateStr.substring(0, 4)),
                Integer.parseInt(dateStr.substring(4, 6)) - 1,
                Integer.parseInt(dateStr.substring(6)));
        calendar.add(Calendar.DATE, 1);
        return format.format(calendar.getTime()) + "000000";
    }

    public static String getChineseDateTime(String dateStr) {
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        if (dateStr.length() < 14) {
            return dateStr;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(dateStr.substring(0, 4)),
                Integer.parseInt(dateStr.substring(4, 6)) - 1,
                Integer.parseInt(dateStr.substring(6, 8)),
                Integer.parseInt(dateStr.substring(8, 10)),
                Integer.parseInt(dateStr.substring(10, 12)),
                Integer.parseInt(dateStr.substring(12)));
        return format.format(calendar.getTime());
    }

    //由出生日期获得年龄
    public static int getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            }else{
                age--;
            }
        }
        return age;
    }

}
