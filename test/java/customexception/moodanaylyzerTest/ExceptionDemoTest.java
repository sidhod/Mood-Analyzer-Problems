package customexception.moodanaylyzerTest;

import org.junit.Test;

import customexception.moodanaylyzer.CustomException;
import customexception.moodanaylyzer.ExceptionDemo;

import org.junit.Assert;

public class ExceptionDemoTest {
	// Return SAD
	@Test
	public void givenMessageIsProperShouldReturnSad() throws CustomException {
		// Create object MoodAnalyser
		ExceptionDemo moodAnalyser = new ExceptionDemo("I am in Sad Mood");
		String actualResult = moodAnalyser.analyserMood();
		Assert.assertEquals("SAD", actualResult);

	}

	// Return HAPPY
	@Test
	public void givenMessageIsPrperShouldReturnHappy() throws CustomException {
		// Create object MoodAnalyser
		ExceptionDemo moodAnalyser = new ExceptionDemo("I am in Any Mood");
		String actualResult = moodAnalyser.analyserMood();
		Assert.assertEquals("HAPPY", actualResult);

	}

	// Return Custom Exception
	@Test
	public void givenNullIsPrperShouldReturnCustomException() throws CustomException {
		// Create object MoodAnalyser
		ExceptionDemo moodAnalyser = new ExceptionDemo(null);
		try {
			String actualResult = moodAnalyser.analyserMood();
		} catch (Exception e) {
			Assert.assertEquals("Null or Empty", e.getMessage());
		}

	}

}