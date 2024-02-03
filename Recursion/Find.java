package Recursion;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3 , 5 };
        System.out.println(find(arr, 5, 0));
        System.out.println(findAllIndex(arr, 5, 0, new ArrayList<>()));
    }

    static boolean find(int[]arr,int target, int i){
        if (i == arr.length){
            return false;
        }

        return arr[i] == target || find(arr, target, i+1);
    }

    static int findIndex(int[]arr,int target, int i){
        if (i == arr.length){
            return -1;
        }

        if (arr[i] == target){
            return i;
        }
        else {
            return findIndex(arr, target, i + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }

        if (arr[index] == target){
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[]arr,int target, int i){
        if (i == arr.length){
            return;
        }

        if (arr[i] == target){
            list.add(i);
        }
         
        findAllIndex(arr, target, i + 1);
    }

    // OR

    static ArrayList<Integer> findAllIndex(int[]arr,int target, int i, ArrayList<Integer> list){
        if (i == arr.length){
            return list;
        }

        if (arr[i] == target){
            list.add(i);
        }
         
        return findAllIndex(arr, target, i + 1, list);
    }

    static ArrayList<Integer> findAllIndexList(int[]arr,int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length){
            return list;
        }

        if (arr[i] == target){
            list.add(i);
        }
        
        ArrayList<Integer> ansFromBelowCalls = findAllIndexList(arr, target, i+1);
        
        list.addAll(ansFromBelowCalls);

        return list;
    }
    
}
