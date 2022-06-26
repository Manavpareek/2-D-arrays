import java.util.Scanner;

public class leaniersearch {
    public static void main(String[] args) {
        System.out.println(" enter the size of array");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int numbers[][] = new int[row][column];
        System.out.println("input the values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }
        System.out.println(" what value you want to search");
        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(numbers[i][j]==x){
                    System.out.print("number found at location ("+ i +"  , " +j+" )"  );
                }
            }
        }

    }
}
