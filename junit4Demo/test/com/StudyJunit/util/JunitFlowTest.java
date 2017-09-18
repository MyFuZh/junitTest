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
@BeforeClass ���η����������еķ���������ǰִ��
���Ҹ÷����Ǿ�̬�ģ����Ե��������¼��غ���žͻ���������
�������ڴ�����ֻ�����һ��ʵ�������Ƚ��ʺϼ��������ļ�
*/

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is BeforeClass");
	}
/*
@AfterClass �����εķ���ͨ����������Դ��������ر����ݿ������
*/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is AfterClass");
	}
	
	

/*
 @Before��@After����ÿ�����Է�����ǰ���ִ��һ�Σ�
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
