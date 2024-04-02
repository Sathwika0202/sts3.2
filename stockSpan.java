//stockSpan
import java.util.*;
public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int price[] = new int[n];
           
            for(int i=0; i<n; i++){
                price[i] = sc.nextInt();
            }
            
            int span[] = new int[n];
            Stack <Integer> s = new Stack<>();
            span[0] = 1;
            s.push(0);
            
            for (int i=1; i<n; i++){
                while(!s.isEmpty() && price[i] > price[s.peek()]){
                    s.pop();
                }
                span[i] = s.isEmpty()? i + 1 : i - s.peek();
                s.push(i);
            }
            
            for (int i=0; i<n; i++){
                System.out.print(span[i] + " ");
                
            }
            sc.close();
        
    }
}
