import java.util.Calendar;
import java.util.Calendar;
import java.util.Date;

public class Birthday {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH, 9);
        c2.set(Calendar.YEAR, 1997);
        c2.set(Calendar.MONTH, 0);
        Long milliseconds = calendar.getTimeInMillis() - c2.getTimeInMillis();
        System.out.println(c2.compareTo(calendar));
        System.out.println(milliseconds);
    }

}