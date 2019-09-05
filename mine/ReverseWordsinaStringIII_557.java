package wechat.mine;

public class ReverseWordsinaStringIII_557 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (String str : strs){
            StringBuilder tmp = new StringBuilder(str);
            res.append(" ");
            res.append(tmp.reverse());
        }
        return res.toString().trim();
    }
}
