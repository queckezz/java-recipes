
package a1020_Teile_und_Hersche;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class PreNodeTest {
  
  public PreNodeTest() {
  }
  
  @Test
  public void testRange() {
    PreNode node = PreNode.createTree(new PreNode(0, 9));
    
    PreNode firstNode = node.getNodes()[0];
    PreNode secondNode = node.getNodes()[1];
   
    assertTrue(firstNode.getFrom() == 0);
    assertTrue(firstNode.getTo() == 4);
    assertTrue(firstNode.isLeaf() == false);
    
    assertTrue(secondNode.getFrom() == 5);
    assertTrue(secondNode.getTo() == 9);
    assertTrue(secondNode.isLeaf() == false);
  }
  
  @Test
  public void testSmall() {
    PreNode node = PreNode.createTree(new PreNode(0, 3));
    
    PreNode firstNode = node.getNodes()[0];
    PreNode secondNode = node.getNodes()[1];
   
    assertTrue(firstNode.getFrom() == 0);
    assertTrue(firstNode.getTo() == 1);
    assertTrue(firstNode.isLeaf() == true);
   
    System.out.println(secondNode.getFrom());
    
    assertTrue(secondNode.getFrom() == 2);
    assertTrue(secondNode.getTo() == 3);
    assertTrue(secondNode.isLeaf() == true);
    
  }
  
  @Test
  public void checkLeaf() {
    PreNode node = PreNode.createTree(new PreNode(0, 1));
    assertTrue(node.isLeaf() == true);
    
    PreNode node2 = PreNode.createTree(new PreNode(0, 2));
    assertTrue(node2.isLeaf() == false);
    
    PreNode node3 = PreNode.createTree(new PreNode(0, 3));
    assertTrue(node3.isLeaf() == false);
  }
  
  @Test
  public void collectLeaves() {
    PreNode node = PreNode.createTree(new PreNode(0, 4));
    int cnt = 0;
    ArrayList<PreNode> leafs = PreNode.collectLeaves(node, new ArrayList<PreNode>());
    
    for (PreNode leaf : leafs) {
      assertTrue(leaf.isLeaf());
      cnt++;
    }
    
    assertTrue(cnt == 3);
  }
}
