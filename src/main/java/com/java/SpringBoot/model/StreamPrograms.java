package com.java.SpringBoot.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPrograms {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8,1,3,6};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        //Arrays.stream(arr).forEach(e->System.out.println(e));
        List<Integer> collect = Arrays.stream(arr).filter(e -> e % 2 != 0).sorted().boxed().collect(Collectors.toList());
        System.out.println("Filtered and sorted Array: "+collect);

        IntStream.range(0, arr.length).forEach(i->{
            if(arr[i]%2!=0){
                arr[i]=collect.remove(0);
            }
        });
        System.out.println("sorted Array: "+ Arrays.toString(arr));
    }
}
