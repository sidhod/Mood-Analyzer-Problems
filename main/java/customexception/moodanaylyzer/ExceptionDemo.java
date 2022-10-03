package customexception.moodanaylyzer;

public class ExceptionDemo {
	String message;
	public ExceptionDemo(String message) {
		this.message=message;
	}
    //create method here
	public String analyserMood(){
		try {
			if(message.contains("I am in Sad Mood"))
				return "SAD";
			if(message.contains("I am in Any Mood"))
				return "HAPPY";
		}catch(Exception e ) {
			return "HAPPY" ;
		}
		return "Not Valid Message" ;
		
	}
	
}