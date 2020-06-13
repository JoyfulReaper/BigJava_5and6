import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarThing {
    public static void main(String[] args)
    {
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, 100);

        System.out.println("100 Days in the future: " + getDateString(cal));

        cal = new GregorianCalendar(1988, 5, 21);
        System.out.println("Somone's Birthday: " + getDateString(cal));
        cal.add(Calendar.DAY_OF_MONTH, 10000);
        System.out.println("10,000 days after that: " + getDateString(cal));
    }

    public static String getDateString(GregorianCalendar cal)
    {
        StringBuilder sb = new StringBuilder();
        switch(cal.get(Calendar.DAY_OF_WEEK))
        {
            case 1:
                sb.append("Sunday ");
                break;
            case 2:
                sb.append("Monday ");
                break;
            case 3:
                sb.append("Tuesday ");
                break;
            case 4:
                sb.append("Wednesday ");
                break;
            case 5:
                sb.append("Thursday ");
                break;
            case 6:
                sb.append("Friday ");
                break;
            case 7:
                sb.append("Saturday ");
                break;
        }
        sb.append(cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.YEAR));
        return sb.toString();
    }
}