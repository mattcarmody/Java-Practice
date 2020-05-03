class Prime {
    
    public static boolean isPrime(int val) {
        if (val == 0) {
            return false;
        } else if (val == 1) {
            return true;
        } else if (val == 2) {
            return true;
        } else if (val < 0) {
            System.out.println("For this exercise, negatives are not considered prime.");
            return false;
        }
        
        
        for (int jj = 2; jj < val; jj++) {
            if (val % jj == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] nums = {24, 5, 12, -101, 1, 0, 2, 32};
        
        for (int num : nums) {
            if (Prime.isPrime(num)) {
                System.out.println(num + " is prime!");
            } else {
                System.out.println(num + " is not prime...");
            }
        }
    }
}
