import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int array[] = {11, 9, 5, 78, 97, 45, 77, 99, 71, 98, 47};
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length -1; j++){
        for(int i = 0; i < array.length -1; i++ ) {
            if(array[i+1] < array[i]){
                int b = array[i];
                array[i] = array[i+1];
                array[i+1] = b;
            }
        }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

}
