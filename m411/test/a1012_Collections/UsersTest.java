
package a1012_Collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class UsersTest {
  private List<User> users = new ArrayList<>();
  
  @Test
  public void testSort() {
    List<User> users = Arrays.asList(
      new User("Röthlin", "Viktor", 74, "Magglingen", LocalDateTime.now()),
      new User("Testfaye", "Eticha", 74, "ETH", LocalDateTime.now())
    );
    
    Comparator<User> sortByName = (User u1, User u2) -> u1.name.compareTo(u2.name);
    
    Collections.sort(users, sortByName);
    
    users.forEach(u -> System.out.println("\t" + u));
  }
}