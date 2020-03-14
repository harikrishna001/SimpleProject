package com.sathya.test;

import org.junit.Assert;
import org.junit.Test;

import com.sathya.service.DemoService;

public class TestDemoService {

	
	@Test
	
	public void  testGetService()
	{
		DemoService  a=new DemoService();
		
		Assert.assertEquals("ji", a.getService());
	}
}
