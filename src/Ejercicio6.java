import java.util.Scanner;
public class Ejercicio6 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array;
    array= new int[10];

    System.out.println("Introduce ten numbers : ");
    for (int i=0; i < array.length; i++){
        array[i] = input.nextInt();
    }
}
}
