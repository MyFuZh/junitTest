package com.StudyJunit.util;

import static org.junit.Assert.*;

import org.junit.Test;


/*

 * 1��Failureһ���ɵ�Ԫ����ʹ�õĶ��Է����ж�ʧ��������ģ��⾭��ʾ���Ե㷢�������⣬

 * ����˵��������Ľ��������Ԥ�ڵĲ�һ��

 * 2��error���ɴ����������ģ������Բ����ڲ��Դ��뱾��Ĵ���Ҳ�����Ǳ����Դ����е�һ��

 * ���ص�BUG

 * 3������������������֤�����ǶԵģ���������֤����û�д�

 */

public class ErrorsAndFailiresTest {

	@Test
	public void testadd(){
		assertEquals(5, new Calculate().and(3,3));//����
	}
	
	@Test
	public void testexcept(){
		assertEquals(3, new Calculate().except(6,0));
	}
}

