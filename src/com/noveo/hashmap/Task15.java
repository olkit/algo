package com.noveo.hashmap;

import com.noveo.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/group-anagrams/">Problem page</a>
 */
public class Task15 implements Task {
    @Override
    public void run() {
        String[] params = new String[]{"ddddddddddg","dgggggggggg"};
        groupAnagrams(params);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();


        for(int i = 0 ; i < strs.length; i++) {
            String key = calculateHash(strs[i]);
            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(strs[i]);
            System.out.println(key);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public String calculateHash(String s) {
        String result = "00000000000000000000000000";
        StringBuilder resultBuilder = new StringBuilder(result);
        for(int i = 0 ; i < s.length(); i++) {
            int index = s.charAt(i) - 97;

            resultBuilder.setCharAt(index, (char)(resultBuilder.charAt(index) + 1));

        }
        return resultBuilder.toString();
    }
}
