package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.TranslationEmployee;

public class TranslationTestEmployee {
	
	List<String> languages = Arrays.asList("English", "German", "Greek");
	
	@Test
	public void	testprintIncome() {
		TranslationEmployee tre = new TranslationEmployee ("Iason", 800, 7, languages);
		assertEquals(3000,tre.printIncome(),3100);
		  }
}