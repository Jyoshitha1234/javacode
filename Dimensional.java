public class Dimensional {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int[][] nums={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int row = 0; row< nums.length; row++) {
            for (int col=0;col<nums[row].length;col++){
                System.out.println("numbers is:"+ nums[row][col]);
            }
            System.out.println();
            
        }

        nums[0][2]=15;
        System.out.println("After changing value:");
        System.out.println("numbers is:"+ nums[0][2]);
    }
    
}
