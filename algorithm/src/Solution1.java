import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution1 {
	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        //String dateStr = year+"-"+month+"-"+day;
        
        Calendar calendar  = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        
        Date date = null;
		try {
			date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(month);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        calendar.setTime(date);
        
        int convertedMonth = calendar.get(Calendar.MONTH);
        
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        
        System.out.println(convertedMonth);
        
        //Date date = null;
        
//        try{
//           date = format.parse(dateStr);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        
//        Calendar calendar  = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//        calendar.setTime(date);
        
//        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        
        //System.out.println(dayOfWeek.toUpperCase());
    }
}