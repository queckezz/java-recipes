package a1015_Baeume;

/**
 *
 * @author fabian
 */

public class Child {
    private final String character;
    private Child leftNode;
    private Child rightNode;
    
    public Child(String character) {
        this.character = character;
    }
    
    public Child() {
        this.character = "Root";
    }

    public String getCharacter() {
        return character;
    }

    public Child getLeftNode() {
        return leftNode;
    }

    public Child getRightNode() {
        return rightNode;
    }
    
    public void addNodes(Child left, Child right) {
        this.leftNode = left;
        this.rightNode = right;
    }

    boolean isLeaf() {
        return rightNode == null && leftNode == null;
    }
}
