public class FlipCoinProblem {


    public static void main(String[] args) {
        // flip coin
        double num = Math.floor(Math.random());

        if ( num < 0.5){
            System.out.println("it is tails");
        }else{
            System.out.println("it is heads");
        }


    }
}
