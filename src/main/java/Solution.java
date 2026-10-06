public class Solution {

    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */
    
    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double average = (t1 + t2 + t3 + t4)/4;
        return average;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average+0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        double totalStock = shares * price;
        return totalStock;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock >= 0) {
            return (int)(totalStock + 0.5);
        }else{
            return (int)(totalStock - 0.5);  
    }
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int ones = (int)userDouble % 10;
        int tens = (int)(userDouble / 10);
        double hundredths = userDouble * 100 % 10;
        double tenths = (double)((int)(userDouble % 1 * 10));
        tens = (tens+1)%10;
        ones = (ones+1)%10;
        tenths = (tenths+1)%10;
        hundredths = (hundredths+1)%10;
        return ones + (tens * 10) + (tenths / 10) + (hundredths / 100);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }
    
    }
