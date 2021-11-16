
interface Calc{
    int num1 = 1;
    
    int num2 = 4;

    int calc();
}

public class Pra_interface{
    public static void main(String[] args){
        Add add = new Add();
        int sum = add.calc();
        System.out.println(sum);

        Sub sub = new Sub();
        int sum2 = sub.calc();
        System.out.println(sum2);
    }
}

class Add implements Calc{
    public int calc(){
        int num_sum = num2 + num1;
        return num_sum;
    }
}

class Sub implements Calc{
    public int calc(){
        int num_sum = num2 - num1;
        return num_sum;
    }
}
