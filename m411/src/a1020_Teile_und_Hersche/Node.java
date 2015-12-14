
package a1020_Teile_und_Hersche;

public class Node {
  private final int min;
  private final int max;
  
  public Node(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public int getMin() { return min; }
  public int getMax() { return max; }
  
  /**
   * Since there is nothing to compare with one element,
   * set `min` and `max` both to `first`.
   * 
   * @param first
   * @return Node
   */
  public static Node compare(int first) {
    return new Node(first, first);
  }
  
  /**
   * Compare two values and set min, max.
   * 
   * @param first first value to compare
   * @param second second value to compare
   * @return Node
   */
  public static Node compare(int first, int second) {
    if (first < second) {
      return new Node(first, second);
    } else if (first > second) {
      return new Node(second, first);
    }
    
    // both the same
    return compare(first);
  }
  /**
   * Compare two nodes.
   * 
   * @param first
   * @param second
   * @return Node
   */
  
  public static Node compare(Node first, Node second) {
    return new Node(
      compare(first.getMin(), second.getMin()).getMin(),
      compare(first.getMax(), second.getMax()).getMax()
    );
  }
}
