public class For_and_If {
    void output(){
        for(int number=1; ;number+=1){
            if(number==9){
                System.out.println("I am done now");
                break;
            }
            else if(number == 4){
                System.out.println("Else if "+number);
            }
            else{
                System.out.println("Else"+" "+number);
            }
        }
    }
}
