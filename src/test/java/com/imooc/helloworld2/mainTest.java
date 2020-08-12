package com.imooc.helloworld2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class mainTest {
	
	@Test
	public void testMain() {
		assertEquals("Hello World",new main().sayHelloWorld());
	}
	
}
