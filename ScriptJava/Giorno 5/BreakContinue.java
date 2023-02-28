
public class BreakContinue {
    public static void main(String[] args) {
        for (int i=0; i<15;i++){
            if(i%2==1){
                System.out.println(i);
                continue;
            }else if(i==8){
                break;
            }
        

        }
    }
}
