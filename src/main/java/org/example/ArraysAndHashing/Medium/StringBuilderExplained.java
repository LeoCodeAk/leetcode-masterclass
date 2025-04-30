package org.example.ArraysAndHashing.Medium;

public class StringBuilderExplained {
    public static void main(String[] args) {
        //StringBuilder is a MUTABLE sequences of characters. Unlike String, StringBuilder allows you to modify without creating new objects.
        //StringBuilder can change a StringBuilder object without creating a new object

        StringBuilder sb = new StringBuilder("Hello");
        //.apend() method appends the specified string to end of a string Builder
        sb.append(" World");
        System.out.println(sb);

        //.insert(int offset, String s) method inserts a string at the specified position
        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6, "Beautiful ");
        System.out.println(sb2);

        //.replace(int start, int end, String s) replaces substring from start to end
        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.replace(6, 10, "Java");
        System.out.println(sb3);

        //.reverse() reverses the characters in the String BUilder
        StringBuilder sbReverse = new StringBuilder("Akash");
        System.out.println(sbReverse.reverse());

        //.subString(int start, int end)
        StringBuilder sbSubString = new StringBuilder("Akash");
        String sub = sbSubString.substring(1,5);
        System.out.println(sub);

        //.toString() converst StringBuilder to regular STring
        StringBuilder sbRegular = new StringBuilder("Hello Akash");
        String sto = sbRegular.toString();
        System.out.println(sto);

        //When should we use StringBuilder?
        // - Use StringBuilder when you need to frequently modify strings (insert, delete, replace)
        // - Use reverse() method for quick and efficient reversal

        StringBuilder sbComma = new StringBuilder();
        for(int i = 1; i<= 100; i++) {
            sbComma.append(i);
            if( i < 100) {
                sbComma.append(", ");
            }
        }
        System.out.println(sbComma);

        StringBuilder sbEven = new StringBuilder();
        for(int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                sbEven.append(i);
                if(i < 100) {
                    sbEven.append(", ");
                }
            }
        }
        System.out.println(sbEven);

    }
}
