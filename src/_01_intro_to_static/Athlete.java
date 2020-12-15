package _01_intro_to_static;

public class Athlete {
	
	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";
	
    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
    	Athlete a = new Athlete("James", 10);
    	a.bibNumber = 100;
    	a.nextBibNumber = a.bibNumber + 1;
    	
    	
    	Athlete b = new Athlete("Jack", 5);
    	b.bibNumber = 200;
    	b.nextBibNumber = b.bibNumber + 1;
    	
    	
    	System.out.println("A: " + a.bibNumber);
    	System.out.println("B: " + b.bibNumber);
    	
    	
    	System.out.println(" A next: "+ a.nextBibNumber);
    	System.out.println(" B next: " + b.nextBibNumber);
    	
    	
    	
    }

}
