package com.ncrm.formation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {

	static StringUtils stringUtils;
	
	@Before
	public void setUp() throws Exception {
		 stringUtils=new StringUtils();
	}

    @Test
	public void givenStringAndLength_whenUsingSubstringMethod_thenTrim() {
        assertEquals(stringUtils.usingSubstringMethod("Welcometo ", 9), "Welcometo");
    }
}


