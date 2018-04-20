package gengerate;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils {


    /**
     * 星期六
     */
    private static final int SATURDAY = 6;

    /**
     * 星期天
     */
    private static final int SUNDAY = 0;

    /**
     * 月份总数
     */
    private static final int MONTH_COUNT = 12;

    /**
     * 日期格式（年月日）
     */
    private static final String YEAR_MONTH_DAY = "yyyy-MM-dd";

	/**
	 * 获取2个时间字符串的日期差
	 *
	 * @param beginDateStr
	 * @param endDateStr
	 * @return
	 */
	public static long getDaySub(String beginDateStr, String endDateStr) {
		long day = 0;
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd");
		Date beginDate = null;
		Date endDate = null;

		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
			day = (endDate.getTime() - beginDate.getTime())
					/ (24 * 60 * 60 * 1000);
		} catch (ParseException e) {
			e.printStackTrace();
			return day;
		}
		return day;
	}


	/**
	 * 判断两个时间相差的天数的绝对值
	 * @param fDate
	 * @param sDate
	 * @return
	 */
	public static int daysOfTwo(Date fDate,Date sDate){
		  if (null == fDate || null == sDate) {
	           return -1;
	        }
	       long intervalMilli = Math.abs(sDate.getTime() - fDate.getTime());
	       return (int) (intervalMilli / (24 * 60 * 60 * 1000));
	}

    private static String randString = "";

    /**
     * 保证一次产生10000个随机数内无重复 平均一秒钟能产生250个随机数
     */
    public synchronized static String getNo(int k) {
        if (randString.length() > 20000) {
            randString = "";
        }
        String rno = getNoNo(k);
        while (randString.indexOf(rno + ",") >= 0) {
            rno = getNoNo(k);
        }
        randString += rno + ",";
        return rno;
    }



    private static String getNoNo(int k) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getUserDate("yyyyMMddHHmmss") + RandomStringUtils.randomNumeric(k);
    }


    private static String getNoNo1(int k){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return RandomStringUtils.randomNumeric(k);
    }

    private static String randomString = "";

    public synchronized static String getNo1(int k){
        if (randomString.length() > 20000) {
            randomString = "";
        }
        String rno = getNoNo1(k);
        while (randomString.indexOf(rno + ",") >= 0) {
            rno = getNoNo1(k);
        }
        randomString += rno + ",";
        return rno;
    }

    /**
     * 根据用户传入的时间表示格式，返回当前时间的格式 如果是yyyyMMdd，注意字母y不能大写。
     *
     * @param sformat
     *            yyyyMMddHHmmss
     * @return
     */
    public static String getUserDate(String sformat) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(sformat);
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 获取现在时间
     * @method  getNow
     * @param
     * @return java.util.Date
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static Date getNow() {
        return new Date();
    }

    /**
     * 获取现在时间 格式为yyyy-MM-dd HH:mm:ss
     * @method  getStringDate
     * @param
     * @return java.lang.String
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static String getStringDate() {
        return getUserDate("yyyy-MM-dd HH:mm:ss");
    }

    /**
     *获取现在时间 格式为yyyy-MM-dd HHmm
     * @method  getStringDateShortmm
     * @param
     * @return java.lang.String
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static String getStringDateShortmm() {
        return getUserDate("yyyy-MM-dd HHmm");
    }

    /**
     * 获取现在时间 格式为yyyy-MM-dd
     * @method  getStringDateShort
     * @param
     * @return java.lang.String
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static String getStringDateShort(){
        return getUserDate("yyyy-MM-dd");
    }
    /**
     * 获取现在时间 格式为HH:mm:ss
     * @method  getStringTime
     * @param
     * @return java.lang.String
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static String getStringTime(){
        return getUserDate("HH:mm:ss");
    }
    /**
     * 获取现在时间  HH:mm
     * @method  getTimeShort
     * @param
     * @return java.lang.String
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static String getTimeShort(){
        return getUserDate("HH:mm");
    }
    /**
     *获取现在时间的小时值
     * @method  getHour
     * @param
     * @return java.lang.String
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static String getHour(){
        String dateString = getStringDate();
        return dateString.substring(11, 13);
    }
    /**
     *  获取现在时间的分钟值
     * @method  getTime
     * @param
     * @return java.lang.String
     * @date: 2017-12-15
     * @author:qiumeng
     */
    public static String getTime(){
        String dateString = getStringDate();
        return dateString.substring(14, 16);
    }
    /**
     * 获取现在时间的毫秒值
     * @method  getSecond
     * @param
     * @return java.lang.String
     * @date: 2017-12-15 16:31
     * @author:qiumeng
     */
    public static String getSecond(){
        String dateString = getStringDate();
        return dateString.substring(17, 19);
    }

    /**
     *  传入字符串格式的时间，按照传入的格式转化为date时间
     * @method  formatToDate
     * @param strDate
     * @param format
     * @return java.util.Date
     * @date: 2017-12-15 16:29
     * @author:qiumeng
     */
    public static Date formatToDate(String strDate, String format) {
        if (strDate == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     *  传入date的时间，按照传入的格式转化为字符串格式时间
     * @method  formatToStr
     * @param dateDate
     * @param format
     * @return java.lang.String
     * @date: 2017-12-15 16:30
     * @author:qiumeng
     */
    public static String formatToStr(Date dateDate, String format) {

        if (dateDate == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String dateString = formatter.format(dateDate);
        return dateString;
    }

    /**
     * 判断是否是闰年
     * @param year
     * @return
     */
    public static Boolean isLeapYear(int year){

        //能被4整除但不能被100整除，或者能被400整除
        return (year%4 == 0 && year%100 != 0) || year%400 == 0;
    }

    /**
     * 获取当前日期是星期几
     * @param date
     * @return
     */
    public static int getWeekOfDate(Date date){

        //顺序：星期天 -> 星期六
        int[] weekDays = {0, 1, 2, 3, 4, 5, 6};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0){
            w = 0;
        }
        return weekDays[w];
    }

    /**
     * 获取当前日期是星期几
     * @param sdate
     * @return
     */
    public static int getWeekOfDateS(String sdate){
        Date date = formatToDate(sdate,"yyyy-MM-dd");
        //顺序：星期天 -> 星期六
        int[] weekDays = {0, 1, 2, 3, 4, 5, 6};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0){
            w = 0;
        }
        return weekDays[w];
    }

    /**
     * 根据某年来获取该年所有周末列表
     * @param year
     * @return
     */
    public static List<Date> getDate(int year){

        Calendar calendar = Calendar.getInstance();
        List<Date> calendarList = new ArrayList<>();
        for(int month=0;month < MONTH_COUNT;month++){

            int date = 1;
            calendar.set(year, month, date);

            int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            int minDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);

            for (int i = minDay; i <= maxDay; i++) {
                calendar.set(year, month, i);
                //判断是星期几
                int weekOfDate = DateUtils.getWeekOfDate(calendar.getTime());
                //星期六或者星期天
                if(weekOfDate == SUNDAY || weekOfDate == SATURDAY){
                    calendarList.add(calendar.getTime());
                }
            }
        }

        return calendarList;
    }

    /**
     * 根据年 月 获取对应的月份 天数
     */
    public static int getDaysByYearMonth(int year, int month) {

        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 根据date(String)获取其年份
      * @param date
     * @return
     */
    public static String getYearByStringDate(String date){
        return date.substring(0,date.indexOf("-"));
    }

    /**
     * 根据date(String)获取其月份
     * @param date
     */
    public static String getMonthByStringDate(String date){
        return date.substring(date.indexOf("-")+1,date.lastIndexOf("-"));
    }

    /**
     * 根据date(String)获取天数（今天是几号）
     * @param date
     */
    public static String getDayByStringDate(String date){
        return date.substring(date.lastIndexOf("-")+1);
    }

    /**
     * 根据date(Date)获取其年份
     * @param date
     * @return
     */
    public static String getYearByDate(Date date){
        return getYearByStringDate(formatToStr(date,YEAR_MONTH_DAY));
    }

    /**
     * 根据date(Date)获取其月份
     * @param date
     */
    public static String getMonthByDate(Date date){
        return getMonthByStringDate(formatToStr(date,YEAR_MONTH_DAY));
    }

    /**
     * 根据date(Date)获取天数（今天是几号）
     * @param date
     */
    public static String getDayByDate(Date date){
        return getDayByStringDate(formatToStr(date,YEAR_MONTH_DAY));
    }

    /**
     * 根据date（String）获取对应的年月日（year-month-day）
     * @param date
     * @return
     */
    public static Map<String,Integer> getYMDByStringDate(String date){
        Map<String,Integer> p = new HashMap<>();
        p.put("year",Integer.parseInt(getYearByStringDate(date)));
        p.put("month",Integer.parseInt(getMonthByStringDate(date)));
        p.put("day",Integer.parseInt(getDayByStringDate(date)));
        return p;
    }

    /**
     * 根据date（date）获取对应的年月日（year-month-day）
     * @param date
     * @return
     */
    public static Map<String,Integer> getYMDByDate(Date date){
        return getYMDByStringDate(formatToStr(date,YEAR_MONTH_DAY));
    }


    public static void main(String[] args){
        // System.out.println(DateUtils.getTime());
        // DateUtils.getDate(2017);
        // String startDate = "2018-08-28";
        // String endDate = "2018-08-28";
        // long daySub = DateUtils.getDaySub(startDate,endDate);
        // System.out.println(daySub);
        // String noNo = getNoNo(4);
        // String no = getNo(4);
        // System.out.println(noNo);
        // System.out.println(no);
        // String s = RandomStringUtils.randomNumeric(3);
        // System.out.println(s);
    }
}
