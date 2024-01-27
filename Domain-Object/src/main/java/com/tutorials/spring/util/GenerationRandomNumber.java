/**
 * 
 */
package com.tutorials.spring.util;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 *
 */
@Component
public class GenerationRandomNumber {

	public int randomProperty = 10;

	public static int genratingRandomNumberByRandomClass(int outbound) {
		Random random = new Random();
		return random.nextInt(outbound);
	}
}
