// In this version of Stats, the type argument for 
// T must be either Number, or a class derived 
// from Number. 
class Stats<X extends Number> {  
  X[] nums; // array of Number or subclass 
    
  // Pass the constructor a reference to   
  // an array of type Number or subclass. 
  Stats(X[] o) {  
    nums = o;  
  }  
  
  // Return type double in all cases. 
  double average() {  
    double sum = 0.0; 
 
    for(int i=0; i < nums.length; i++)  
      sum += nums[i].doubleValue(); 
 
    return sum / nums.length; 
  }
  boolean isSameAvg(Stats<?> ob)
  {
    if(this.average()== ob.average())
      return true;
    else
      return false;
  }
}  
  
// Demonstrate Stats.  
class BoundsDemo {  
  public static void main(String args[]) {  
 
    Integer inums[] = { 1, 2, 3, 4, 5 }; 
    Stats<Integer> iob = new Stats<Integer>(inums);   
    double v = iob.average(); 
    System.out.println("iob average is " + v); 
 
    Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 }; 
    Stats<Double> dob = new Stats<Double>(dnums);   
    double w = dob.average(); 
    System.out.println("dob average is " + w); 

    Double dnums1[]= {1.1,2.2, 3.3, 4.4, 5.5};
    Stats<Double> dob1 = new Stats<Double>(dnums1);
    System.out.println(dob1.isSameAvg(dob));

    Float fnums[] = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
    Stats<Float> fob = new Stats<Float>(fnums);
    System.out.println(dob1.isSameAvg(fob));
 
    // This won't compile because String is not a 
    // subclass of Number. 
   // String strs[] = { "1", "2", "3", "4", "5" }; 
   // Stats<String> strob = new Stats<String>(strs);   
  
   // double x = strob.average(); 
   // System.out.println("strob average is " + v); 
 
  }  
}
