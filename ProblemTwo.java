
import java.util.*;

public class ProblemTwo{
    
    
    public static void main(String args[]){
        
        String[] obj = new String[4];
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0 ; i < 4 ; i++ ){
            obj[i] = input.nextLine().toUpperCase();
        }
        
        System.out.println(Arrays.asList(getArrayList(obj)));
    }
    
    public static String[] getArrayList(String[] obj){
        
        ArrayList<String> list = new ArrayList<>(Arrays.asList(obj));
        
        
        Collections.sort(list);
        
        System.out.println(list);
        
        int len = obj.length;
        int mid = 0;
        
        if(len % 2 == 0){
            mid = len / 2;
        }else {
            mid = (len /2 ) + 1;
        }
        
        String[] ans = new String[len];
        
        for(int i = 0 ; i < mid ; i++ ){
            ans[i] = list.get(i).toUpperCase();
        }
        for(int i = mid ; i < len ; i++ ){
            ans[i] = list.get(i).toLowerCase();
        }
        
        
        
        return ans;
    }
}