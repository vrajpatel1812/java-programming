/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class infinitefound{
    public static void main(String[] args) {
        int[] a = new int[]{3,5,6,7,8,9,10,11,15,16,18,19,23,26,27};
        int target = 23;
        int ans = range(a, target);
        System.out.println(ans);
    }
    public static int range(int[] a,int target){
        int start = 0 ,end = 1;
        while(target>a[end]){
            int newstart = end+1;
            end = end + (end - start + 1)*2;
            start = newstart ;
        }
        return check(a,start,end,target);
      }    
    public static int check(int[] a, int first,int last, int n){
        while(first<last){
            int mid = first + (last - first)/2;
            if(a[mid]>n){
                last = mid - 1;
            }else if(a[mid]<n){
                first = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}