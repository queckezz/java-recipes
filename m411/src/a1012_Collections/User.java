
package a1012_Collections;

import java.time.LocalDateTime;

public class User {
  String name;
  String vorname;
  int JG;
  String country;
  LocalDateTime time;
  
  public User (String name, String vorname, int JG, String land, LocalDateTime time) {
    this.name = name;
    this.vorname = vorname;
    this.JG = JG;
    this.country = country;
    this.time = time;
  }
  
  public String toString() {
    return vorname + " " + name;
  }
}
