package JavaLoopAnEnum; // project created in eclipse

enum Levels { // enum class made named 'Levels'
	HIGH, // use comma to separate
	LOW,
	MEDUIM
}

public class LoopAnEnum { //public class 'LoopAnEnum' made

	public static void main(String[] args) {// reads, runs & executes code
		for(Levels myModes : Levels.values()) {// for each loop made passing information, Levels.values()
			//which contains the data in enum class Levels to variable myModes
			System.out.println(myModes); // display the loop
		}

	}

}

// result:
//HIGH
//LOW
//MEDUIM