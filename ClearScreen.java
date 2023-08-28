import java.util.Scanner;

public class ClearScreen {
    public static void main(String[]args)
    {
        int array[]=new int[10];
        for(int start=0;start<10;start++)
        {
            Scanner in=new Scanner(System.in);
            array[start]=in.nextInt();
        }
        for(int print=0;print<array.length;print++)
        {
            System.out.println(array[print]);
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
