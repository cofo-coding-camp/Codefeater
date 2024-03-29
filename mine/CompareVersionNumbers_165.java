package wechat.mine;

public class CompareVersionNumbers_165 {
    public int compareVersion(String version1, String version2) {

        if (version1.length() == 0 || version2.length() == 0) return 0;

        int i = 0, j = 0;
        int n1, n2;
        while (i < version1.length() || j < version2.length()) {
            n1 = 0;
            n2 = 0;
            while (i < version1.length() && version1.charAt(i) != '.') {
                n1 = n1 * 10 + (version1.charAt(i) - '0');
                i ++;
            }
            while (j < version2.length() && version2.charAt(j) != '.') {
                n2 = n2 * 10 + (version2.charAt(j) - '0');
                j ++;
            }
            if (n1 > n2) return 1; else if (n1 < n2) return -1;
            if (i < version1.length() && version1.charAt(i) == '.') ++ i;
            if (j < version2.length() && version2.charAt(j) == '.') ++ j;
        }
        return 0;
    }

    public static void main(String[] args){
        CompareVersionNumbers_165 cvn = new CompareVersionNumbers_165();
        System.out.println(cvn.compareVersion("1", "1.1"));
    }
}
