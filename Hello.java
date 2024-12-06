// {
//     public static void main(String a[]) 
//    {
//     System.out.print("Hello World");
//     }

//     public static void main(String args[]){
//         // Interger
//         int a = 123456789; // 4 bytes
//         long b = 123456789 ;// 8 bytes
//         short c = 12345; // 2 bytes
//         byte d = 123; // 1 byte
        
//         // Float
//         // float e = 123.4; // 4 bytes ❌
//         float f = 123.456f; // 4 bytes ✔️
//         double g = 123.456 ;

//         // Character
//         char h = 'a';
        
//         // Boolean
//         boolean i = true;
//         boolean j = false;
//         System.out.println(a);
//     }
// }

// -----------------Loops-----------
//  While
// public static void main (String args[]){

//     int a = 5;
//     System.out.println("Program started");

//     while(a <= 10){
//         System.out.println("Value of a: " + a);
//         a++;
//     }
//     System.out.println("Program ended"+a);
// }
// }

// Creating class 
// class Calcualtor{

//     public int add (){
//         System.out.println("Calculator class invoked");
//     return 0; 
//     }
// }
// // Calling a method on a class
// public class Hello{
// public static void main (String args[]){
//     Calcualtor calc = new Calcualtor();
//     calc.add();
// }
// }
// WAP to create a method and return a sum of two number , the numbers need to be provided by a calling class
public class Hello {
    public static void main(String arg[]){
        int i = 5;
        int j = 70;
Sum sum = new Sum();
int result = sum.add(i,j);
        System.out.println("Output of the sum is :"+result);
    }
}
class Sum{
    public int add(int a, int b){
        return a+b;
    }
}

