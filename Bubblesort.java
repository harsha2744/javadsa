public class Bubblesort {
    public static void main(String[] args) {
        int[] nums={4,6,2,9,19,20,3};
        int size=nums.length;
        System.out.println("before sorting");
        for(int nums1:nums){
            System.out.println(nums1 +" ");
        }
        System.out.println("After Sorting:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int nums1 : nums){
            System.out.println(nums1 +" ");
        }
    }
    
}
