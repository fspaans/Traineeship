package nl.fs.winkelservlet.Webwinkel.btw.test;

import org.junit.Test;

import nl.rjekker.opdracht.btw.BTWCalculator;

public class BTWTest {

	@Test
	public void testBerekenPrijs() {
		assert BTWCalculator.berekenPrijs(100, 21, true) == 121;
		assert BTWCalculator.berekenPrijs(100, 21, false) == 100;
		assert BTWCalculator.berekenPrijs(1, 21, false) == 1;
		assert BTWCalculator.berekenPrijs(1, 21, true) == 1;
	}
	
	@Test
	public void testBerekenBTW(){
		assert BTWCalculator.berekenBTW(100, 21) == 21;
		assert BTWCalculator.berekenBTW(1, 21) == 1;
	}

}
