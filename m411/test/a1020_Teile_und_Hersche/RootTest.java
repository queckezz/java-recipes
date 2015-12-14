
package a1020_Teile_und_Hersche;

import org.junit.Test;

public class RootTest {
  public RootTest() {
  }

  @Test
  public void test() {
    int[] nums = {
      8,
      9,
      3,
      6,
      4,
      9,
      1,
      2,
      6
    };
    
    Root root = new Root(nums);
    Root.traverse(root);
  }
}
