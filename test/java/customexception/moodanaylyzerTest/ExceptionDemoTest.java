package customexception.moodanaylyzerTest;

import org.junit.Test;

import customException.ExceptionDemo;

import org.junit.Assert;

public class ExceptionDemoTest {
	@Test
	public void givenMessageIsProperShouldReturnSad() {
		//Create object MoodAnalyser
		ExceptionDemo moodAnalyser = new ExceptionDemo("I am in Sad Mood");
		String actualResult = moodAnalyser.analyserMood();
		Assert.assertEquals("SAD",actualResult);
	}
	@Test
	public void givenMessageIsPrperShouldReturnHappy() {
		//Create object MoodAnalyser
		ExceptionDemo moodAnalyser = new ExceptionDemo("I am in Any Mood");
		String actualResult = moodAnalyser.analyserMood();
		Assert.assertEquals("HAPPY",actualResult);
		
	}

}