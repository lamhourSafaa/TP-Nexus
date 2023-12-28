package com.ncrm.formation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	 Calculator math;
	    
	 @Before
	 public void setUp() throws Exception {
	        math = new Calculator(7, 10);	        
	    }
	    
	    @Test
	    public void testAdd() {
	       Assert.assertEquals(17, math.add());
	    }
}
