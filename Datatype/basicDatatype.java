public class basicDatatype{
    public static void main(String[] args){

        /*
        * There are two type of data types in java programming language
        * 1. Primitive Datatype
        * 2. Non-Primitive Datatype
        * 
        * 1. Primitive Datatype:-
        *          a. Boolean : Stores true or false values (8 bits)
        *          b. Char : Stores characters  (16 bits)
        *          c. Byte : stores numbers -128 to 127 (8 bits)
        *          d. Short : Stores numbers -32768 to 32767 (16 bits)
        *          e. Int  : Stores numbers (32 bits)
        *          f. long : Stores numbers (64 bits)
        *          g. Float : Stores decimal numbers upto 7 decimal digits(32 bits)
        *          h. Double : Stores decimal numbers upto 16 decimal digits (64 bits)
        */

        // Syntax of boolean 
            boolean flag = true;
        
        // Syntax of char
            char input = 'a';

        // Syntax of byte
            byte numByte = 1;

        // Syntax of short
            short numShort = 2;

        // Syntax of int 
            int numInt = 3;

        // Syntax of long
            long numLong = 4;

        // Syntax of float
            float numFloat = 5.6f;

        //Syntax of double 
            double numDouble = 7.8;


        System.out.println(flag);
        System.out.println(input);
        System.out.println(numByte);
        System.out.println(numShort);
        System.out.println(numInt);
        System.out.println(numLong);
        System.out.println(numFloat);
        System.out.println(numDouble);


        /*
         * 2. Non-Primitive Datatype
         *          a. Class :A class in Java is a user defined data type i.e. it is created by the user. 
         *                    It acts a template to the data which consists of member variables and methods.    
         *          b. Object : An object is the variable of the class, which can access the elements of class i.e. methods and variables.
         *          c. String : It is the group of characters
         *          d. Array : It is a user defined data type which can store multiply homogenous variables    
         */
                    
         /*
                    // Syntax of class and object 
                       public class ClassExample {  
                                 // defining the variables of class  
                                    int a = 20;  
                                    int b = 10;  
                                    int c;  
  
                                // defining the methods of class  
                                public void add () {  
                                    int c = a + b;  
                                    System.out.println("Addition of numbers is: " + c);  
                                }  
  
                                public void sub () {  
                                int c = a - b;  
                                System.out.println("Subtraction of numbers is: " + c);  
                                }  
      
                                // main method  
                                public static void main (String[] args) {  
                                    // creating the object of class  
                                        ClassExample obj = new ClassExample();  
  
                                    // calling the methods  
                                        obj.add();  
                                        obj.sub();  
                                     }  
                                }  
         */


                    // Syntax of Stirng
                        String str = "Example of String data type";
                        System.out.println(str);

                    // Syntax of Array
                        int arrInt[] = {1,2,3,4,5};
                        char arrChar[] = {'a','b','c'};
                    
                        System.out.println(arrInt[0] +" "+ arrInt[1]);
                        System.out.println(arrChar);
            

    }
}