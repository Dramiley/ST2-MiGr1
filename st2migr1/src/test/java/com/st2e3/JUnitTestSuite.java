package test.java.com.st2e3;
import org.junit.platform.suite.api.Suite;

@Suite
@SuiteDisplayName("Linked List Test Suite")
@SelectClasses({SimpleLinkedList.class, SimpleLinkedList$Elem.class, SimpleLinkedList$Iter.class})
public class JUnitTestSuite {
}