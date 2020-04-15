class Solution {
    public boolean isHappy(int n) {
     int num = n;  
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = isHappyNumber(result);  
        }
        
         if(result == 1)  
            return true; 
        else   
            return false; 
        
} 
    
   public int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        //Calculates the sum of squares of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    } 
    
}