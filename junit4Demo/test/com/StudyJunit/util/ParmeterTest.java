package com.StudyJunit.util;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/*
 * 测试一个方法 使用多组数据  

    1:更改默认的测试运行器为 Parameterized.class

    2：声明变量来存放预期值

    3:声明一个返回值为Collection的公共静态方法 并用@Parameterized 进行修饰 

    4：为测试类声明一个带有参数的公共构造器，并在其中为之声明变量赋值*/

//@RunWith(ParmeterTest.class)
//public class ParmeterTest{
//	int expected = 0;
//	int input1 = 0;
//	int input2 = 0;
//	
//	@Parameters
//	public static Collection<Object[]>t(){
//	 
//		return Arrays.asList(new Object[][]{
//			{3,1,2}
//			{4,2,2}
//		}) ;
//				
//	}	
//}
