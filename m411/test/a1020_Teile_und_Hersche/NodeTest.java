
package a1020_Teile_und_Hersche;

import static org.junit.Assert.*;
import org.junit.Test;

public class NodeTest {
  
  public NodeTest() {
  }

  @Test
  public void test() {
    Node c = Node.compare(5, 12);
    assertTrue(c.getMin() == 5);
    assertTrue(c.getMax() == 12);
    
    Node c2 = Node.compare(9, 2);
    assertTrue(c2.getMin()== 2);
    assertTrue(c2.getMax() == 9);
  }
  
  @Test
  public void testBothTheSame() {
    Node c = Node.compare(3, 3);
    
    assertTrue(c.getMin() == 3);
    assertTrue(c.getMax() == 3);
  }
  
  @Test
  public void testOneNumber() {
    Node c = Node.compare(5);
    
    assertTrue(c.getMin() == 5);
    assertTrue(c.getMax() == 5);
  }
  
  @Test
  public void testNodes() {
    Node c = Node.compare(new Node(3, 5), new Node(2, 8));
    
    assertTrue(c.getMin() == 2);
    assertTrue(c.getMax() == 8);
  }
}
