import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        System.out.println("Enter Value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
            for(int j = 0;j<i;j++){
            System.err.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}