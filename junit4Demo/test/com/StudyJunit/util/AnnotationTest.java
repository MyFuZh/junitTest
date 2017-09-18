package com.StudyJunit.util;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

/*
	@Test:��һ����ͨ�ķ������γ�Ϊ���Է���
	@Test(expected=XXXX.class)
	@Test(timeout=���� )
	@BeforeClass�������еķ�������ǰ��ִ��
	@AfterClass:�����еķ������н�������ִ��
	@Before������ÿһ�����Է���������ǰִ��һ��
	@After������ÿһ�����Է������к�ִ��
	@Ignore:�����εĲ��Է����ᱻ����
	@RunWith�����Ը��Ĳ��������� org.junit.runner.Runner
	
	
*/
	@Test(expected=ArithmeticException.class)
	public void testexcept(){
		assertEquals(3, new Calculate().except(6,0));
	}

	@Test(timeout=1)	
	public void testWhile(){
		while (true){
			System.out.println("run 123123....");
			break;//�����breakΪ��ѭ��
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
