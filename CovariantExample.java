
class First{

    First A(){
        return this;
    }
    void output(){
        System.out.println("Inside the class first");
    }
}

class Second extends First 
{  
    Second foo()  
    {  
        return this;  
    }  
      
    void output()  
    {  
        System.out.println("Inside the class Second");  
    }  
}
class Third extends Second 
{  
    Third foo()  
    {  
        return this;  
    }  
      
    void output()  
    {  
        System.out.println("Inside the class Third");  
    }  
}

public class CovariantExample {
    public static void main(String[] args) {
        
        First f = new First();
        f.A().output();

        Second s = new Second();
        s.A().output();
        Third t = new Third();
        t.A().output();

    }
}
