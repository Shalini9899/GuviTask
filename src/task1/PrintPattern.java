package task1;

public class PrintPattern   {
	
    public static void main(String[] args) {
    	int k=5;
    	for(int i=5;i>=1;i--) {
    		for(int j=5;j>=1;j--) {
    			if(j>k) {
    				System.out.print(j);
    			} else {
    				System.out.print(k);
    			}
    		}
    		System.out.println();
    		k--;
    	}
    	}
    }