package Arrays;

public class FrequencyEach {
    public static void main(String[] args) {
        int [] a = {4, 3, 1 ,2, 4, 2, 5};
        int [] fre = new int[a.length];
        
        int visited = -1;

        for (int i = 0; i < a.length; i++){
            int c = 1;
            for (int j = i + 1; j < a.length; j++){
                if (a[i] == a[j]){
                    c++;
                    fre[j] = visited;
                }
            }
            if (fre[i] != visited)
                fre[i] = c;
        }
        
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fre.length; i++){  
            if(fre[i] != visited)  
                System.out.println("    " + a[i] + "    |    " + fre[i]);  
        }  
        System.out.println("----------------------------------------");  
    }
}
