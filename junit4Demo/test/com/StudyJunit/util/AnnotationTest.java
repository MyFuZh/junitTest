package com.StudyJunit.util;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

/*
	@Test:讲一个普通的方法修饰成为测试方法
	@Test(expected=XXXX.class)
	@Test(timeout=毫秒 )
	@BeforeClass：在所有的方法运行前被执行
	@AfterClass:在所有的方法运行结束后呗执行
	@Before：会在每一个测试方法被运行前执行一次
	@After：会在每一个测试方法运行后被执行
	@Ignore:所修饰的测试方法会被忽略
	@RunWith：可以更改测试运行器 org.junit.runner.Runner
	
	
*/
	@Test(expected=ArithmeticException.class)
	public void testexcept(){
		assertEquals(3, new Calculate().except(6,0));
	}

	@Test(timeout=1)	
	public void testWhile(){
		while (true){
			System.out.println("run 123123....");
			break;//不添加break为死循环
		}
	}
	
	@Test(timeout=3000)
	public  void testReadFile(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
	}
	
}
