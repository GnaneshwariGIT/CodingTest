package samplecodes;

public class DiffBtwTwoDates {

	public static void main(String args[]){

public String getTimeDiff(Date dateOne, Date dateTwo) {
        String diff = "";        
       long timeDiff = Math.abs(dateOne.getTime() - dateTwo.getTime()); 
       diff = String.format("%d hour(s) %d min(s)", TimeUnit.MILLISECONDS.toHours(timeDiff),                TimeUnit.MILLISECONDS.toMinutes(timeDiff) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(timeDiff)));      
         return diff;}

	}
}
