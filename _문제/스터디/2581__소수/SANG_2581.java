import java.util.Scanner;

public class SANG_2581 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int M = scan.nextInt();
      int N = scan.nextInt();
      int sum = 0;
      int min = N+1;
      
      
      
      es:for(int i = M ; i <= N ; i++) {
         if(i == 1) continue;
         
         if(i == 2 || i == 3) {
            sum += i;
            if(min > i) {
               min = i;
            }
            continue;
         }
         else {
        	 
        	 for(int j=2; j <= i/2; j++) {
        		 
        		 int k = i % j; //���������ϱ�
        		 if(k == 0) continue es; //�Ҽ��� �ƴѰ��
        		 
        		 if(j == i/2) {
        			 sum += i;
        		 }
        		 if(min > i) {
        			 min = i;
        		 }
        	 }
        	 
         }
      }

      
      if(sum == 0) {
         System.out.println(-1);
      } else {
         System.out.println(sum);
         System.out.println(min);
      }

      
   }
}