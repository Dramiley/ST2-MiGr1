package com.st2e3;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Linked List Test Suite")
@SelectClasses({SimpleLinkedListTest.class})
public class JUnitTestSuite {
}