package com.StudyJunit.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;
public class JunitFlowTest {
	
	
	
/*
@BeforeClass 修饰方法会在所有的方法被调用前执行
而且该方法是静态的，所以当测试类呗加载后接着就会运行它，
而且在内存中它只会存在一份实例，它比较适合加载配置文件
*/

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is BeforeClass");
	}
/*
@AfterClass 所修饰的方法通常用来对资源的清理，如关闭数据库的链接
*/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is AfterClass");
	}
	
	

/*
 @Before和@After会在每个测试方法的前后各执行一次，
 */
	@Before
	public void setUp() throws Exception {
		System.out.println("this is Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is After");
	}
	
	@Test
	public void test1(){
		System.out.println("this is  Test1 ");
	}
	
	@Test
	public void test2(){
		System.out.println("this is  Test2 ");
	}


}
