package com.don;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Don {

	@Before
	public void Scriptstarts() {
		System.out.println("starts");

	}
	@After
	public void Scriptend() {
		System.out.println("ends");
		
	}
	
	@Test
	public void scenethree() {
		System.out.println("one");
	}
	
}