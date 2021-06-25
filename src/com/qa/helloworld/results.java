package com.qa.helloworld;

public class results {
	// methods
	public static String displayResults(int bio, int chem, int phys) {
		String results = "SCORES\r\n";
		results += "Biology: " + bio + "/150\r\n";
		results += "Chemistry: " + chem + "/150\r\n";
		results += "Physics: " + phys + "/150\r\n";
		results += "Total: " + (bio + chem + phys) + "/450\r\n";
		return results;
	}

	public static String checkPassSubject(int subject) {
		String passed;
		if (subject > 60) {
			passed = "you have passed";
		} else {
			passed = "you have failed";
		}
		return passed;
	}

public static String subjectPercentage(int percentage) {
	String subject;
	if (percentage > 60
	else if (chemistry * 100) / 150 > 60)
     else if ( (biology * 100) / 150 > 60 {
		System.out.println("Your percentage is: " + percentage + "% Good job!");
	} else
		if ((((physics * 100) / 150) > 60 && ((chemistry * 100) / 150) > 60) && biology != 1) {
            System.out.println("you failed bio:(.");
}  else if ((((physics * 100) / 150) > 60 && ((biology * 100) / 150) > 60) && chemistry != 1) {
    System.out.println("You have failed Chem:(."); 
}  else if ((((chemistry * 100) / 150) > 60 && ((biology * 100) / 150) > 60) && physics != 1) {
    System.out.println("You have failed Physics:(.");
} else {
	System.out.println( "You have failed more than one exam. " + "You're overall percentage is: " + percentage + "%");
}
}

	public static void main(String[] args) {
		int biologyScore = 20;
		int chemistryScore = 142;
		int physicsScore = 102;
		System.out.println(displayResults(biologyScore, chemistryScore, physicsScore));
	    System.out.println(checkPassSubject(50));
		System.out.println(subjectPercentage(60));
	}
}