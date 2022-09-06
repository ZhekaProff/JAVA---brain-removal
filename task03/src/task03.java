public class task03 {
    static int triangularNumber(int a){
        int sum = 0;
        for(int i =0; i <= a; i ++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.printf("\nTреугольное число от %d", triangularNumber(5));
    }
}

