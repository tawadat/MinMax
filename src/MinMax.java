public class MinMax {
    public static void main(String[] args) {
        int a = 10;
        double array[] = new double[a];
        for(int i =0; i<array.length; i++){
            array[i] =  Math.random()*10;
        }
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
        double max = array[0];
        for (int i = 0; i< array.length; i++) {
              if(max < array[i])  max = array[i];
        }
        System.out.println( );
        System.out.println(max);

        double min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) min = array[i];
        }

        System.out.println( );
        System.out.println(min);
    }
}
