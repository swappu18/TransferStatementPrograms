package transferStatements;

public class breakDemo {
    public static void main(String[] args) {
        // break must be used either in switch and loops
//        break;//cte

        for (int i = 1; i <=10 ; i++) {
            if(i==7){
                break;//control is transferred outside the for loop and loops ends
            }
            System.out.println(i);
        }
        System.out.println("outside of loop and rest of main");
    }
}

