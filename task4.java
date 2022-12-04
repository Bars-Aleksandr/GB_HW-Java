
public class task4 {
    public static String inputData() {
        String beginEquation = "?1??38??8?0?7??+?440???0?8101960?560463?85?0?620287?9220?0807?9?9??=6?4?86?03?1?1?60?56046?0854?06??2???????5?01589?8?9";
        return beginEquation;
    }

    public static boolean checkLength(char[] l1, char[] l2, char[] l3) {
        boolean flag;
        if (l3.length < l1.length && l3.length < l2.length) {
            flag = false;
        } else {
            flag = true;
        }
        if (l1.length) {

        } else {

        }
    }

    public static void solution(char[] x1, char[] x2, char[] x3) {
        int[] s1Arr = new int[x1.length];
        int[] s2Arr = new int[x2.length];
        int[] s3Arr = new int[x3.length];
        int s1Int = 0;
        int s2Int = 0;
        int s3Int = 0;
        for (int i = s1Chars.length; i != 0; i--) {
            if (s1Chars[i] == '?')
                s1Arr[i] = 0;
            else
                s1Arr[i] = s1Chars[i] - '0';
            if (s2Chars[i] == '?')
                s2Arr[i] = 0;
            else
                s2Arr[i] = s2Chars[i] - '0';
            if (s3Chars[i] == '?')
                s3Arr[i] = 0;
            else
        s3Arr[i] = s3Chars[i] - '0';        
        
    }

    public static void main(String[] args, Object begin) {
        // Scanner iScanner = new Scanner(System.in);
        // String beginEquation = iScanner.nextLine();
        // iScanner.close();
        
        String beginEquatStr = inputData();
        String[] separEquationPlus = beginEquatStr.split("\\+");
        String[] separEquationEquals = separEquationPlus[1].split("\\=");
        String s1 = separEquationPlus[0];
        String s2 = separEquationEquals[0];
        String s3 = separEquationEquals[1];
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        char[] s3Chars = s3.toCharArray();
        if (checkLength(s1Chars, s2Chars, s3Chars)) {
            solution;            
        } else {
            System.out.println("Решения нет");
        }
        // int[] s1Arr = new int[s1Chars.length];
        // int[] s2Arr = new int[s2Chars.length];
        // int[] s3Arr = new int[s3Chars.length];
        // int s1Int = 0;
        // int s2Int = 0;
        // int s3Int = 0;
        // for (int i = s1Chars.length; i != 0; i--) {
        // if (s1Chars[i] == '?')
        // s1Arr[i] = 0;
        // else
        // s1Arr[i] = s1Chars[i] - '0';
        // if (s2Chars[i] == '?')
        // s2Arr[i] = 0;
        // else
        // s2Arr[i] = s2Chars[i] - '0';
        // if (s3Chars[i] == '?')
        // s3Arr[i] = 0;
        // else
        // s3Arr[i] = s3Chars[i] - '0';

        // }
        // System.out.println("end");

        // for (char c : s1.toCharArray()) {
        // if (Character.isDigit(c))
        // System.out.println("yes");
        // else
        // System.out.println("no");
        // }

        // for (char i : q1Chars) {
        // System.out.println(i);
        // }

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        
    }

}
