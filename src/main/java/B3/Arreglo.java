package B3;

import java.util.Arrays;

// 1)	organizar un algoritmo que me orden un arreglo a la inversa con los siguentes datos
//
//ejemplo si el arreglo es 3 0 -1 2 4
//el resultado es un arreglo 4 2 -1 0 3
public class Arreglo {
    public static void main(String[] args) {
        int nums[]=new int[5];
        int nums2[]=new int[5];

        nums[0]=3;
        nums[1]=0;
        nums[2]=-1;
        nums[3]=2;
        nums[4]=4;

        for (int i = 4; i >= 0 ; i--) {
            nums2[4-i]=nums[i];
        } System.out.println(Arrays.toString(nums2));
    }
}
