import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int p=0, q=0;
        int target = sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++)
                if(a[i] + a[j] == target){
                    p = i;
                    q = j;
            }
        }
        System.out.print(p);
        System.out.println(q);
 
    }
}
