import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        System.out.println("Enter Value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            System.err.println("*\t");
        }
        sc.close();
    }
}