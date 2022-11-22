import java.io.*;
public class A1Q5B {
    public static void main(String[] args) throws IOException {

       
		int min=59;
		int sec=59;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter hours");
        int h=Integer.parseInt(br.readLine());
        System.out.println("enter Minutes");
        int m=Integer.parseInt(br.readLine());
        System.out.println("enter Seconds");
        int s=Integer.parseInt(br.readLine());
        

        for (int i = h-1; i <= h+1; i++) {
            for (int j = m; j <= min; j++) {
                for (int k = 0; k <= sec; k++) {
                    if (i %2==0 && j%2==0 && k%2==0) {
                        System.out.println(i + " : " + j + " : " + k);
                    }
                }
            }
        }

    }
}
