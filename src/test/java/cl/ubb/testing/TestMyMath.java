package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyMath {
	
	@Test
	public void AddTwoAndTwoIsFour(){
		//Arrange
		MyMath myMath = new MyMath();
		int resultado;
		
		//Act
		resultado = myMath.add(2, 2);
		
		//Assert
		assertEquals(resultado, 4);
	}
}
