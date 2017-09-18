package com.StudyJunit.util;

import static org.junit.Assert.*;

import org.junit.Test;


/*

 * 1、Failure一般由单元测试使用的断言方法判断失败所引起的，这经表示测试点发现了问题，

 * 就是说程序输出的结果和我们预期的不一样

 * 2、error是由代码议程引起的，它可以产生于测试代码本身的错误，也可以是被测试代码中的一个

 * 隐藏的BUG

 * 3、测试用例不是用来证明你是对的，而是用来证明你没有错

 */

public class ErrorsAndFailiresTest {

	@Test
	public void testadd(){
		assertEquals(5, new Calculate().and(3,3));//断言
	}
	
	@Test
	public void testexcept(){
		assertEquals(3, new Calculate().except(6,0));
	}
}

