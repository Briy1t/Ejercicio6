import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        int[] array;
        array= new int[10];

        System.out.println("Introduce "+array.length+" numbers : ");
        for (int i= 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        for(int i =0; i<= array.length / 2; i++){
            temp = array[i];
            array[0] = array [array.length -1 -i];
            array[array.length -1-i]= temp;
        }
        for (int i=0; i < array.length; i++){
            System.out.println("Element at index" +i+ "=" + array[i]);
        }

    }
}