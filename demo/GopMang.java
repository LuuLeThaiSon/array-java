package demo;

import java.util.Arrays;

public class GopMang {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {9,8,7,6,5,4,3,2,1};

        gopMang(arr1,arr2);
    }

    public static void gopMang(int[] arr1, int[] arr2) {

        int[] newArr = new int[arr1.length + arr2.length];
        int index = 0;

        for (int j : arr1) {
            newArr[index++] = j;
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[index++] = arr2[i];
        }

        System.out.println(Arrays.toString(newArr));

    }

}
