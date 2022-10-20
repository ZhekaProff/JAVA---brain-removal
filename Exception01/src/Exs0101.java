// Реализуйте 3 метода, что бы в каждом получить разные исключения


public class Exs0101 {

    public static int qwerty(int a, int b){
        return a/b;
    }

    public static int converter( String string){
        return Integer.parseInt(string);
    }

    public static int [] fillArray(int [] array){
        for (int i = 0; i < 10 ; i++) {
            array[i] = i;
        }
        return array;
    }



    public static void main(String[] args) {
        //qwerty(1,0);
        //converter("a");
        int [] array = new int[10];
        fillArray(array);
    }
}
