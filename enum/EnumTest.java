enum Currency { 
PENNY(1), NICKLE(5), DIME(10), QUARTER(25); 
private int value; 
private Currency(int value) 
{ 
    this.value = value; 
} 

// public String toString() 
// { 
//     switch (this) 
//     { 
//         case PENNY: System.out.print("Penny: " + value); break; 
//         case NICKLE: System.out.print("Nickle: " + value); break; 
//         case DIME: System.out.print("Dime: " + value); break; 
//         case QUARTER: System.out.print("Quarter: " + value); } 
//         // return super.toString();
//         return "";
//     }
};
class EnumTest
{
public static void main(String args[])
{
        Integer obj1 = 1; 
        Integer obj2 = 1; 
        System.out.print((obj1 == obj2)+" ");
        Integer one = new Integer(1); 
        Integer anotherOne = new Integer(1);
        System.out.print((one == anotherOne));
}
}
