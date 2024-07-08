public class Binarysearch {
    public static void main(String[] args) {
        int[] a={4,5,7,8,12,34};
        int target=5;
        int result=binary(a,target);
        if(result!=-1){
            System.out.println("element found at index"+result);
        }
        else{
            System.out.println("element not found");
        }
    }
    public static int binary(int[] a,int target){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
        
    
    
    }
}
