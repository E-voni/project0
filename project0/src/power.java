//Display the square, cube, and fourth power (i, i*i, i*i*i, i*i*i*i) of the numbers from 1 to 11.

public class power {
    public static void main(String arg[]) {
        for(int i=1;i<=11;i++)  //Set up number 1 to 11
        {
            for (int j=1;j<=4;j++) //Set up square, cube, fourth powers
            {
                System.out.printf("%6.0f", Math.pow(i,j)); //power formula
            }
            System.out.println();
        }
    }
}
