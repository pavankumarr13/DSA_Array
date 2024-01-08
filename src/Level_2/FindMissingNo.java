package Level_2;

public class FindMissingNo {
    static int missingNo(int[]a){
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        n=n+1;
        
        return (n*(n+1))/2-sum;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,5,6,7};

        System.out.println(missingNo(a));
    }
}
