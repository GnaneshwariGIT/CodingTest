package Collections;

public class Enum {

	public enum Months{
		January,February,March,April,May,June,July,August,September,October,November,December
    }
	
	public static void main(String[] args) {		
		for(Months months: Months.values())
		System.out.println(months.name());
		
	}
}
