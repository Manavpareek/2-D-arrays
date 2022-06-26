import java.util.Scanner;

public class transpose {
    public static void main(String[]args) {
        System.out.println("give the size of matrix");
        Scanner sc =new Scanner (System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int  numbers[][]=new int[row][column];
        System.out.println(" input the values of matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                 numbers[i][j]=sc.nextInt();

            }
        }
        System.out.println(" transpose of matrix is");
    for(int j=0;j<column;j++){
        for(int i=0;i<column;i++){
            System.out.print(numbers[i][j] + " ");

        }
        System.out.println();
    
}
}
}
