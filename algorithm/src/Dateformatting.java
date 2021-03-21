import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Dateformatting {

 public void date(String dateString) throws ParseException {
  // 날짜 뒤의 st || rd 등을 공백문자열로 변경해주기 위해 정규표현식을 사용함.
  String inputDatedateString = dateString.replaceFirst("[a-zA-Z]{2}", "");

  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
  Date parsedDate = simpleDateFormat.parse(inputDatedateString);

  // parsing 된 날짜 데이터를 출력하고자 하는 포맷 (yyyy-MM-dd) 형으로 변경.
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  String formattedDate = dateFormat.format(parsedDate);
  System.out.println(formattedDate);
 }

 public static void main(String[] args) throws ParseException {
	 
	 Scanner in = new Scanner(System.in);
	 
	 String count = in.next();
	 
	 int cnt = Integer.parseInt(count);
	
     
     String dateString = null;
     ArrayList<String> dateLists = new ArrayList<String>();
     
     for (int i=0; i < cnt; i++) {
    	 
    	 String day = in.next();
    	 String month = in.next();
         String year = in.next();
         
    	 dateString = day+" "+month+" "+ year;
    	 
    	 dateLists.add(dateString);
    	 
     }
	 
     //String dateString = "24st Dec 2024";
     Dateformatting t = new Dateformatting();
     
     for (int i=0; i < dateLists.size(); i++ ) {
    	 
    	 //dateString = dateLists.get(i);
    	 //t.date(dateString);
    	 t.date(dateLists.get(i));
     }
     
 }
}
