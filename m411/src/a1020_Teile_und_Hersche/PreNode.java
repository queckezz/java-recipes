package a1020_Teile_und_Hersche;

import java.util.ArrayList;

public class PreNode {

  private final int from;
  private final int to;
  private boolean isLeaf = false;
  PreNode[] nodes = new PreNode[2];

  public PreNode(int from, int to) {
    this.from = from;
    this.to = to;
    isLeaf = true;
  }
  
  public PreNode(int from, int to, PreNode[] nodes) {
    this.from = from;
    this.to = to;
    this.nodes = nodes;
  }

  public int getFrom() {
    return from;
  }

  public int getTo() {
    return to;
  }

  public PreNode[] getNodes() {
    return nodes;
  }

  public boolean isLeaf() {
    return isLeaf;
  }

  /**
   * Creates a tree of PreNodes with `from` being the start index and `to` being
   * the end index. Those indexes are later used to get all the nums in an array
   * and diff the values.
   *
   * @param node
   * @return PreNode
   */
  public static PreNode createTree(PreNode node) {
    int from = node.getFrom();
    int to = node.getTo();
    int half = (to - from) / 2 + from;
    int numsCount = to - from + 1;

    //System.out.format("half: %s, numsCount: %s, to: %s, from: %s\n", half, numsCount, to, from);
    PreNode[] nodes = new PreNode[2];

    if (numsCount > 2) {
      nodes[0] = createTree(new PreNode(from, half));
      nodes[1] = createTree(new PreNode(half + 1, to));
      return new PreNode(from, to, nodes);
    }

    return new PreNode(from, to);
  }

  /**
   * Given a node, gets all the leaf nodes.
   *
   * @param node
   * @param leafs
   * @return ArrayList with leaf Nodes
   */
  public static ArrayList<PreNode> collectLeaves(PreNode node, ArrayList<PreNode> leafs) {
    if (node.isLeaf()) {
      leafs.add(node);
    } else {
      PreNode[] children = node.getNodes();
      ArrayList<PreNode> left = collectLeaves(children[0], leafs);
      return collectLeaves(children[1], left);
    }

    return leafs;
  }
  
  public static Node toNode (PreNode node, int[] list) {
    return new Node(list[node.getFrom()], list[node.getTo()]);
  }
}
