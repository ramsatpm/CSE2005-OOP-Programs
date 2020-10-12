// // Method overriding.
// class A {
//   int i, j;

//   A(int a, int b) {
//     i = a;
//     j = b;
//   }

//   // display i and j
//   void show() {
//     System.out.println("i and j: " + i + " " + j);
//   }
// }

// class B extends A {
//   int k;

//   B(int a, int b, int c) {
//     super(a, b);
//     k = c;
//   }

//   // display k -- this overrides show() in A
//   void show() {
//     super.show();
//     System.out.println("k: " + k);
//   }
// }


// // class B extends A {
// //   int k;

// //   B(int a, int b, int c) {
// //     super(a, b);
// //     k = c;
// //   }

// //   void show() {
// //     super.show(); // this calls A's show()
// //     System.out.println("k: " + k);
// //   }
// // }



// class Override {
//   public static void main(String args[]) {
//     B subOb = new B(1, 2, 3);

//     subOb.show(); // this calls show() in B
//   }
// }


//Methods with differing type signatures are overloaded -- not overridden.
class A {
  int i, j;

  A(int a, int b) {
    i = a;
    j = b;
  }

  // display i and j
  void show() {
    System.out.println("i and j: " + i + " " + j);
  }
}

// Create a subclass by extending class A.
class B extends A {
  int k;

  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  // overload show()
  void show(String msg) {
    System.out.println(msg + k);
  }
}
  
class Override {
  public static void main(String args[]) {
    B subOb = new B(1, 2, 3);

    subOb.show("This is k: "); // this calls show() in B
    subOb.show(); // this calls show() in A
  }
}
