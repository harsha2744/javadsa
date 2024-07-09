public class Selectionsort {
    public static void main(String[] args) {
        int[] nums={16,7,8,2,4,23};
        int size=nums.length;
        System.out.println("before  sorting");
        for(int num:nums){
            System.out.println(num + " ");
        }
        System.out.println("after sorting");
        for(int i=0;i<size-1;i++){
            int minindex=i;
            for(int j=i+1;j<size;j++){
                if(nums[minindex]>nums[j]){
                    minindex=j;
                }
            }
            int temp=nums[minindex];
            nums[minindex]=nums[i];
            nums[i]=temp;

        }
        for(int num :nums){
            System.out.println(num + " ");
        }
    }
}
