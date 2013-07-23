package com.acm.seleniumjunittest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JUnitTest1.class, JUnitTest2.class, JUnitTest3.class})
public class JUnitTestSuite {
	static {
		System.out.println("test");
		System.exit(0);
	} //this doesn't seem to be executed, unlike if placed in another class.
}

//this comment should be merged into the class
