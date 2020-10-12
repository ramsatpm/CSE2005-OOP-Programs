// A simple example of inheritance.

// Create a superclass.
class A {
  int i, j;
  // private int l;

  void showij() {
    System.out.println("i and j: " + i + " " + j);
  }
}

// Create a subclass by extending class A.
class B extends A {
  int k;

  // void showl()
  // {
  // 	System.out.println("l: "+l);
  // }

  void showk() {
    System.out.println("k: " + k);
  }
  void sum() {
    System.out.println("i+j+k: " + (i+j+k));
  }
}
  
class SimpleInheritance {
  public static void main(String args[]) {
    A superOb = new A();
    B subOb = new B();
    B subOb2 = new B();

    // The superclass may be used by itself.
    superOb.i = 10;
    superOb.j = 20;
    System.out.println("Contents of superOb: ");
    superOb.showij();
    System.out.println();

    /* The subclass has access to all public members of
       its superclass. */
    subOb.i = 7;
    subOb.j = 8;
    subOb.k = 9; 
    System.out.println("Contents of subOb: ");
    subOb.showij();
    subOb.showk();
    System.out.println();

    System.out.println("Sum of i, j and k in subOb:");
    subOb.sum();

    subOb2.i=20;
    subOb2.j=30;
    subOb2.k=40;
    System.out.println("Contents of subOb2: ");
    subOb2.showij();
    subOb2.showk();
    System.out.println("Sum of i, j and k in subOb2:");
    subOb2.sum();
  }
}
