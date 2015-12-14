
package a1020_Teile_und_Hersche;

import java.util.ArrayList;
import java.util.Iterator;

public class Root {
  
  PreNode root;
  int[] nums;
  
  public Root(int[] nums) {
    root = PreNode.createTree(new PreNode(0, nums.length - 1));
  }

  public PreNode getRoot() {
    return root;
  }

  public int[] getNums() {
    return nums;
  }
  
  public static Node traverse(Root root) {
    PreNode node = root.getRoot();
    int[] nums = root.getNums();
    ArrayList<PreNode> leafs = PreNode.collectLeaves(node, new ArrayList<PreNode>());
    Iterator i = leafs.iterator();
    
    /*while(i.hasNext()) {
      PreNode firstPreNode = (PreNode) i.next();
      PreNode secondPreNode = (PreNode) i.next();
      Node firstNode = new Node(nums[firstPreNode.getFrom()], nums[firstPreNode.getTo()]);
      Node secondNode = new Node(nums[secondPreNode.getFrom()], nums[secondPreNode.getTo()]);
      leafs.add(Node.compare(firstNode, secondNode));
    }*/
    
    return new Node(1, 1);
  }
}
