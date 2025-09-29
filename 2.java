import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        for (String s : strs) {
            // 将字符串转换为字符数组并排序
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // 如果哈希表中不存在该键，则创建一个新的列表
            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
            
            // 将当前字符串添加到对应的列表中
            anagramGroups.get(sortedStr).add(s);
        }
        
        // 返回哈希表中的所有值（即分组后的列表）
        return new ArrayList<>(anagramGroups.values());
    }
}
