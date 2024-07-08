public class Linearsearch{
    public static void main(String[] args) {
        int a[]={7,9,13,15,17,20};
        int target=13;
        int result=linear(a,target);
        if(result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("element found at index"+result);
        }
        System.out.println("result is"+result);

    }
    public static int linear(int[] a,int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target)
                return i;
        }
        return -1;
    }
}