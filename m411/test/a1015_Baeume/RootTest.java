/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1015_Baeume;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RootTest {
    @Test
    public void testTraverse() {
        Root root = new Root();
        assertTrue("W".equals(root.traverse(".--")));
        assertTrue("E".equals(root.traverse(".")));
        assertTrue("K".equals(root.traverse("-.-")));
    }
}
