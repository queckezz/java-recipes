
package a1015_Baeume;

/**
 *
 * @author fabian
 */

public class Root {
    private Child rootNode = new Child();
    
    public Root () {
        Child e = new Child("E");
        Child t = new Child("T");
        Child i = new Child("I");
        Child a = new Child("A");
        Child n = new Child("N");
        Child m = new Child("M");
        Child s = new Child("S");
        Child u = new Child("U");
        Child r = new Child("R");
        Child w = new Child("W");
        Child d = new Child("D");
        Child k = new Child("K");
        Child g = new Child("G");
        Child o = new Child("O");
        
        rootNode.addNodes(e, t);
        
        e.addNodes(i, a);
        t.addNodes(n, m);
        i.addNodes(s, u);
        a.addNodes(r, w);
        n.addNodes(d, k);
        m.addNodes(g, o);
    }
    
    public String traverse (String str) {
        String[] morseCode = str.split("");
        
        Child node = rootNode;
        
        for(String character : morseCode) {
            if (".".equals(character)) {
                node = node.getLeftNode();
            } else if ("-".equals(character)) {
                node = node.getRightNode();
            }
        }
        
        return node.getCharacter();
    }
}
