package com.companyname.bank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
	//message = "New Word"; //uncomment this to see the update
      assertEquals(message,messageUtil.printMessage());
   }
}