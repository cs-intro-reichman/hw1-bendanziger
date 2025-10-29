// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0];
		String hours = time.substring(0, 2);
        String minutes = time.substring(3, 5);
        int numHours = Integer.parseInt(hours);
		int numMinutes = Integer.parseInt(minutes);
		String ampm = "AM";
		if(numHours >= 12){
		    if(numHours != 12){
			numHours = numHours - 12;
			}
            ampm = "PM";
		}
		else{

			ampm = "AM";
		}
		
        if (numMinutes < 10) {
        minutes = "0" + numMinutes;
} 
         
        hours = "" + numHours;

		System.out.println(hours + ":" + minutes + " " + ampm);
	}
}