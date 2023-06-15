package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tetst3 {
	
	SoftAssert sf=new SoftAssert();
	
  @Test
  public void Tetst5() {
	  System.out.println("Tetst5");
	  String Exp="Ripal";
	  String actual="Ripal";
	  Assert.assertEquals(Exp, actual);
	  System.out.println("Befroe Assertion");
	  sf.assertEquals("Ripal","Ripal1");
	  System.out.println("After Assertion");
	  sf.assertAll();
	  
  }
}
