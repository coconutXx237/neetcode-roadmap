package arraysAndHashing;

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter_map = new HashMap<>();
        for (int num : nums) {
            counter_map.put(num, counter_map.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> bucket_sort_map = new LinkedHashMap<>();
        for (int i = nums.length; i >= 1; i--) {
            bucket_sort_map.put(i, new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry: counter_map.entrySet()) {
            int entry_val = entry.getValue();
            int entry_key = entry.getKey();
            bucket_sort_map.get(entry_val).add(entry_key);
        }

        int[] res = new int[k];
        int counter = k;
        for (Map.Entry<Integer, List<Integer>> entry: bucket_sort_map.entrySet()) {
            List<Integer> entry_vals_list = entry.getValue();
            int entry_key = entry.getKey();
            if (!entry_vals_list.isEmpty() && counter != 0){
                for (int num : entry_vals_list) {
                    res[counter - 1] = num;
                    counter--;
                }
            } else if (counter == 0) break;
        }
        return res;
    }

    public static void main(String[] args) {
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {1,2};
        int k = 2;
        //int[] nums = {1};
        //int k = 1;

        System.out.println(new TopKFrequentElements().topKFrequent(nums, k));

        for (int i:new TopKFrequentElements().topKFrequent(nums, k)
             ) {
            System.out.println(i);
        }
    }
}
