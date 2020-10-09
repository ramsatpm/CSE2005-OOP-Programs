// Demonstrate an inner class.
// class Outer {
//   int outer_x = 100;

//   void test() {
//     Inner inner = new Inner();
//     System.out.println(inner.y);
//     inner.display();
//   }

//   // this is an innner class
//   class Inner {
//     int y=20;
//     void display() {
//       System.out.println("display: outer_x = " + outer_x);
//     }
//   }
// }

// class InnerClassDemo {
//   public static void main(String args[]) {
//     Outer outer = new Outer();
//     outer.test();
//   }
// }

class Outer {
  int outer_x = 100;

  void test() {
    for(int i=0; i<10; i++) {
      class Inner {
        void display() {
          System.out.println("display: outer_x = " + outer_x);
        }
      }
      Inner inner = new Inner();
      inner.display();
    }
    //Inner in = new Inner();
  }
}

class InnerClassDemo {
  public static void main(String args[]) {
    Outer outer = new Outer();
    outer.test();
  }
}
