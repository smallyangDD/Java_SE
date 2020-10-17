package com.wsdaoy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期处理
 *
 * @author dullwolf
 */
public class DateUtils {
    public static final String HOUR_24 = "yyyy-MM-dd HH:mm:ss";//24小时制，精确到秒
    public static final String HOUR_12 = "yyyy-MM-dd hh:mm:ss";//12小时制，精确到秒
    public static final String DAY = "yyyy-MM-dd";//精确到日

    public static String format(Date date) {
        return format(date, HOUR_24);
    }

    public static String format(Date date, String pattern) {
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    /**
     * 返回给定日期的年-月-日（字符串）
     *
     * @return 年份
     */
    public static String formatYMD(Date date) {
        return formatYear(date)+"-"+formatMonth(date)+"-"+formatDay(date);
    }

    /**
     * 返回给定日期的年份
     *
     * @return 年份
     */
    public static int formatYear(Date date) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        int year = cl.get(Calendar.YEAR);
        return year;
    }

    /**
     * 返回给定日期的月份
     *
     * @return 月份
     */
    public static int formatMonth(Date date) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        int now_month = cl.get(Calendar.MONTH) + 1;
        return now_month;
    }

    /**
     * 返回给定日期的日
     *
     * @return 某日
     */
    public static int formatDay(Date date) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        int day = cl.get(Calendar.DATE);
        return day;
    }

    /**
     * 返回给定时间所在月的“月初”与“月末”所对应的日期
     *
     * @param date
     * @return
     */
    public static Map<String, Date> getMonthBeginAndEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 2;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        Date startDate = null;
        Date endDate = null;
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        startDate = DateUtils.getDate(date,year, month - 1, 1, 0, 0, 0);
        endDate = DateUtils.getDate(date,year, month - 1, maxDayOfMonth, 23, 59, 59);
        HashMap<String, Date> dateMap = new HashMap<String, Date>();
        dateMap.put("startDate", startDate);
        dateMap.put("endDate", endDate);
        return dateMap;
    }

    /**
     * 将String类型转换为Date
     *
     * @param ref
     *            如:格式yyyy-MM-dd hh:mm:ss
     * @param dateStr
     *            如:2011-05-31 02:40:50
     * @return :返回Tue May 31 14:40:50 CST 2011
     */
    public static Date formatToDate(String ref, String dateStr) {
        SimpleDateFormat sdf =  new SimpleDateFormat(ref);
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将Date类型转换为String
     *
     * @param ref
     *            :格式yyyy-MM-dd hh:mm:ss
     * @param date
     *            :格式Tue May 31 14:40:50 CST 2011
     * @return :返回2011-05-31 02:40:50
     */
    public static String formatToString(String ref, Date date) {
        if(null == date){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(ref);
        return sdf.format(date);
    }

    /**
     * 将String类型日期转化为目标格式的String日期
     *
     * @param ref
     *            :格式yyyy-MM-dd HH:mm:ss
     * @param dateStr
     *            :2011-05-31 02:40:50.0
     * @return :返回2011-05-31 02:40:50
     * @throws ParseException
     */
    public static String formatDateString(String ref, String dateStr)
            throws ParseException {
        SimpleDateFormat sft = new SimpleDateFormat(ref);
        Date date = sft.parse(dateStr);
        String strDate = sft.format(date);
        return strDate;
    }

    /**
     * 为给定的日期增加相应的月数
     * @param date 日期
     * @param num 月数
     * @return
     */
    public static Date addMonth(Date date, int num) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, num);
        return c.getTime();
    }

    /**
     * 为给定的日期增加相应的天数
     * @param date 日期
     * @param num 天数
     * @return
     */
    public static Date addDay(Date date, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, num);
        date = calendar.getTime();
        return date;
    }

    /**
     * 为给定的日期增加相应的天数
     * @param date 日期
     * @param num 天数
     * @return
     */
    public static Date addHour(Date date, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, num);
        date = calendar.getTime();
        return date;
    }

    /**
     * 修改给定时间的数值：时，分，秒
     * @param hour
     * @param minute
     * @param second
     * @return
     */
    public static Date getDate(Date date, int hour, int minute, int second) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        cl.set(Calendar.HOUR_OF_DAY, hour);
        cl.set(Calendar.MINUTE, minute);
        cl.set(Calendar.SECOND, second);
        cl.set(Calendar.MILLISECOND, 0);
        return cl.getTime();

    }

    /**
     * 修改给定时间的数值：年，月，日，时，分，秒
     * @param year
     * @param month
     * @param day
     * @param hour
     * @param minute
     * @param second
     * @return
     */
    public static Date getDate(Date date, int year, int month, int day, int hour,
                               int minute, int second) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        month = month - 1;
        cl.set(Calendar.YEAR, year);
        cl.set(Calendar.MONTH, month);
        cl.set(Calendar.DAY_OF_MONTH, day);
        cl.set(Calendar.HOUR_OF_DAY, hour);
        cl.set(Calendar.MINUTE, minute);
        cl.set(Calendar.SECOND, second);
        cl.set(Calendar.MILLISECOND, 0);
        return cl.getTime();

    }

    /**
     * 计算两时间差(精确到分钟)
     *
     * @param beginDate
     *            开始时间
     * @param endDate
     *            结束时间
     * @return 两时间差(精确到分钟)
     * @throws ParseException
     */
    public static long timeDifferenceofMinute(Date beginDate, Date endDate)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date beginTime = sdf.parse(sdf.format(beginDate));
        Date endTime = sdf.parse(sdf.format(endDate));
        return (endTime.getTime() - beginTime.getTime()) / 1000 / 60;
    }

    /**
     * 获取本周的星期一
     *
     * @return
     */
    public static String getFirstWeekByNowTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); // 获取本周一的
        String strTime = DateUtils.formatToString("yyyy-MM-dd", cal.getTime());
        return strTime+" 00:00:00";
    }

    /**
     * 获取本月的第一天
     *
     * @return
     */
    public static String getFirstMonthByNowTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, cal.getMinimum(Calendar.DATE));
        String strTime = DateUtils.formatToString("yyyy-MM-dd", cal.getTime());
        return strTime+" 00:00:00";
    }

    /**
     * 获取本季节的第一天
     *
     * @return
     */
    public static String getFirstSeasonByNowTime() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        if (month >= 1 && month < 4)
            return  year+ "-01-01 00:00:00";
        else if (month >= 4 && month < 7)
            return  year+ "-04-01 00:00:00";
        else if (month >= 7 && month < 10)
            return  year+ "-07-01 00:00:00";
        else if (month >= 10 && month < 1)
            return  year+ "-10-01 00:00:00";
        else
            return  year+ "-10-01 00:00:00";
    }

    /**
     * 获取给定时间的年月日，时分秒
     * @return
     */
    public static Map<String, Integer> getAllTime(Date date){
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        Map<String, Integer> mapTime = new HashMap<String, Integer>();
        mapTime.put("year", cl.get(Calendar.YEAR));
        mapTime.put("month", cl.get(Calendar.MONTH)+1);
        mapTime.put("day", cl.get(Calendar.DATE));
        mapTime.put("hour", cl.get(Calendar.HOUR_OF_DAY));
        mapTime.put("minute", cl.get(Calendar.MINUTE));
        mapTime.put("second",  cl.get(Calendar.SECOND));
        return mapTime;
    }

    /**
     * 获取多少天之前的时间
     * @param day 天数
     * @return
     *     day天之前的时间
     */
    public static Date dayAgoTime(int day){
        Date nowDate = new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(nowDate);
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)-day);//让日期减day
        Date lastDate = calendar.getTime();
        return lastDate;
    }

    /**
     * 获取指定日期的开始时间和结束时间
     *
     * @param nowDate
     * @return
     */
    public static Map<String, Date> getStartAndEndDate(Date nowDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        Date createDate = DateUtils.getDate(nowDate,year, month, day, 0, 0, 0);
        Date endDate = DateUtils.getDate(nowDate,year, month, day+1, 0, 0, 0);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("startDate", createDate);
        map.put("endDate", endDate);
        return map;
    }
}