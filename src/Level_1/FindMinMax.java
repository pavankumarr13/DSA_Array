package Level_1;
public class FindMinMax {
    public static int min(int[]a){
        int n = a.length;
        int min=a[0];
        for(int i = 0; i < n; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static int max(int[]a){
        int n = a.length;
        int max=a[0];
        for(int i = 0; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr ={2,3,14,15,5,18,16,35,86,1,25,9};

        System.out.println("minimum\t"+min(arr));
        System.out.println("maximum\t"+max(arr));
    }
}
