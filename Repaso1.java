import java.util.Arrays;

public class Repaso1 {
    public static void main(String[] args) {
        int a[] = {5,3,2,7,10,1};
        for (int x = 0; x < a.length; x++) {
            for (int i = 0; i < a.length-x-1; i++) {
                if(a[i] < a[i+1]){
                    int tmp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
/*int a[] = {5,3,2,7,10,1};
    for (int x = 0; x < a.length; x++) {
        for (int i = 0; i < a.length-x-1; i++) {
            if(a[i] < a[i+1]){
                int tmp = a[i+1];
                a[i+1] = a[i];
                a[i] = tmp;
            }
        }
    }*/