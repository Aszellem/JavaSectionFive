public class BreakAndContinue {
    public static void main(String[] args) {
        for (int index = 0; index <= 10; index++) {
            if(index % 2 != 0){
                // continue;
                break;
            }
            System.out.println(index);
        }
    }
}
