// Demonstrate a type wrapper. 
class Wrap { 
  public static void main(String args[]) { 
     
    Integer iOb = Integer.valueOf(1000);  
 
    int i = iOb.intValue();

    int b = iOb;

    System.out.println(b);
 
    System.out.println(i + " " + iOb); // displays 100 100 

    char c = 'x';

    Character charObj = Character.valueOf(c);

    char c1 = charObj.charValue();

    System.out.println(c1 + " " + c);

    boolean ok = true;

    Boolean boolObj = Boolean.valueOf(ok);

    boolean ok1 = boolObj.booleanValue();

    System.out.println(ok1 + " " + ok);

  } 
}
