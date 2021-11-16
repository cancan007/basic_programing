public class HelloWorld {
    public void hello(String s){
        System.out.println(s);
    }    
}

class Main {
  
    public static void main(String[] args) {
        HelloWorld he = new HelloWorld();
        he.hello("HelloWorld");
    }

    public void output(String s){
        System.out.println(s);
    }
}
