import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 *
 * 输入: S = "12345"
 * 输出: ["12345"]
 * 注意：
 *
 * S 的长度不超过12。
 * S 仅由数字和字母组成。
 */
public class letterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        //arr记录原始字符数组
        char[] arr = S.toCharArray();
        //cur记录当前的符合题意的空间解
        char[] cur = new char[arr.length];
        //i记录目前遍历到的位置，从0开始
        backtrack(arr,res,cur,0);
        return res;
    }

    private void backtrack(char[] arr, List<String> res, char[] cur, int i) {
        //如果满足约束条件
        if (i==arr.length){
            System.out.println(cur);
            res.add(new String(cur));
            return;
        }
        if (Character.isDigit(arr[i])){
            cur[i]=arr[i];
            backtrack(arr,res,cur,i+1);
        }else {
            //遍历情况1
            cur[i]=Character.toLowerCase(arr[i]);
            backtrack(arr,res,cur,i+1);
            //遍历情况2
            cur[i]=Character.toUpperCase(arr[i]);
            backtrack(arr,res,cur,i+1);
        }

    }


}
