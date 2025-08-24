import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==2) {
                list.add(arr[i]);
                
                ArrayList<Integer> subList = new ArrayList<>();
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[j]==2) {
                        list.addAll(subList);
                        break;
                    } else {
                        subList.add(arr[j]);
                    }
                }
            }
        }
        
        if(list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}