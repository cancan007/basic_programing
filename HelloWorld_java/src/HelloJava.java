// public class name must be same to the file name
public class HelloJava { 
    public static void main(String[] args){
        System.out.println("Hello!, I am studying Java");

        // create an instance of the class
        Repeat re = new Repeat();
        re.output(4 ,"Yey");

        HelloWorld hw = new HelloWorld();
        hw.hello("HelloWorld class");

        Main m = new Main();  // You can use the class without public, if the file is in the same directory
        m.output("Main class");

        For_and_If FI = new For_and_If();
        FI.output();  // You can use the function without public, if it is in the same directory
    
        SwitchEx se = new SwitchEx();
        se.example();
    }
}

class Repeat {
    public void output(int n, String s){
        for(int number=1; number<= n ; number += 1){
            System.out.println(s);
        }
        System.out.println("Congratulatin! You are successful now");
    }
}
