import java.util.HashMap;import java.util.Scanner;public class FindDuplicate {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int[] arr = new int[n];        for(int i = 0; i < n; i++)            arr[i] = sc.nextInt();        printDuplicate(arr, n);        printDuplicateUsingSum(arr, n);    }//    Using HashMap TC - O(N) & SC - O(N);    public static void printDuplicate(int[] arr, int n){        HashMap<Integer, Integer> hm = new HashMap<>();        int num = -1;        for(int i : arr) {            hm.put(i, hm.getOrDefault(i, 0) + 1);            if(hm.get(i) == 2){                num = i;                break;            }        }        System.out.println("Duplicate number is :- "+num);    }//    Using Sum of N natural numbers N*(N+1)/2    public static void printDuplicateUsingSum(int[] arr, int n){        int expectedSum = (n - 1)*(n)/2 ;  // according to questions there is n and arr have n - 1 element        int actualSum = 0;        for(int num : arr)            actualSum += num;        System.out.println(actualSum - expectedSum);    }}