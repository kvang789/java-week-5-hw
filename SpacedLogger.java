package assignments;

import java.util.ArrayList;
import java.util.List;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) { 
		int y = log.length();		
		for (int i = 0; i < y; i++) {
			System.out.print(log.charAt(i) + " ");
		}

		System.out.println("");

	}

	@Override
	public void error(String error) { 
		//ERROR: H e l l o
		System.out.print("ERROR: ");
		int lengthOfErrorWord = error.length();		
		for (int i = 0; i < lengthOfErrorWord; i++) {

			char theSpecificCharacter = error.charAt(i);
			System.out.print(theSpecificCharacter + " ");
		}

	}

}
