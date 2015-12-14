
package a1016_Graphen;

public class Landscape {
  Tower[] towers;
  boolean[][] matrix;
  
  public Landscape() {
    towers[0] = new Tower();
    towers[1] = new Tower();
    towers[2] = new Tower();
    towers[3] = new Tower();
    
    matrix[0][0] = false;
    matrix[0][1] = true;
    matrix[0][2] = false;
    matrix[0][3] = false;
  }
  
  public boolean isInArea(int tower1, int tower2) {
    return matrix[tower1][tower2];
  }
}