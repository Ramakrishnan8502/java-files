import java.util.Arrays;
import java.util.HashSet;

class Permutation {
    public static void main(String[] args) {
         String str = "abc";
         //permutate(str, 0, "");
         int in = 1;
        int n = (int) Math.pow(str.length(), str.length());
        for (int i = 0; i < n; i++) {
            String res = "";
            HashSet<Character> set = new HashSet<>();
             String base = String.format("%" + str.length() + "s", Integer.toString(i, str.length())).replaceAll(" ",
                     "0");
            System.out.println(base);
           for (char s : base.toCharArray()) {
            
               set.add(s);
           }
           if (base.length() == set.size())
            for (char s : base.toCharArray()) {
                   int inx = Integer.parseInt(s + "");
                    res += str.charAt(inx);
               }
            if (!res.equals(""))
                System.out.println(in++ + "   " + res);
         }

        //Object[] arr = new Object[3];
       // arr[0] = "String";
       // arr[1] = 1;
       // arr[2] = true;
        //System.out.println(Arrays.toString(arr));

    }

    // private static void permutate(String str, int i, String tp) {
    // if(!tp.equals("")) {
    // System.out.println(tp);
    // }

    // swap(str, i);
    // permutate(str, i+1, tp);
    // swap(str, i);
    // }

    // private static void swap(String str, int i) {
    // char temp;
    // char[] arr = str.toCharArray();
    // temp = arr[i];

    // }
}