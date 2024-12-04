class A{ // class is a set of objects 

    A(){// this is the constructor of class A
        System.out.println("This is the constructor of class A");
    }

    void show(){
        System.out.println("This is A class's method show ");        
    }
}

public class Basic1 {
    public static void main(String[] args) {

        new A(); // this is will call the constructor of class A constructor are used to provide memory
        
        A p = new A(); // This is the object of class objects are like real world entities having defined properties 
        
        p.show();//calling the show method in the class A
    }    
}
