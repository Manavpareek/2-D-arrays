import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        
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
        System.out.println(" spiral order mztrix is");
        int rowstart=0;
        int rowend=row-1;
        int columnstart=0;
        int columnend=column-1;
        //to print the spiral order
        while(rowstart<rowend && columnstart<columnend ){
            //1
            for(int i=columnstart;i<=columnend;i++){
                System.out.print(numbers[rowstart][i] + " ");
            }
            rowstart++;
            //2
            for(int j=rowstart;j<=rowend;j++){
                System.out.print(numbers[j][columnend] +" ");
            }
            columnend--;
            //3
            for(int i=columnend;i>=columnstart;i--){
                System.out.print(numbers[rowend][i] + " ");
            }
            rowend--;
            //4
            for(int j=rowend;j>=rowstart;j--){
                System.out.print(numbers[j][columnstart]+ " ");
        
            }
            columnstart++;
            System.out.println();


        }
    }
}
