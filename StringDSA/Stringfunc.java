package StringDSA;
public class Stringfunc {
   public static void main(String[] args) {
    String str = "   The Journey Based DSA    ";
    System.out.println(str.length());
    System.out.println(str.charAt(0));
    System.out.println(str.substring(1,5));
    System.out.println(str.indexOf('e'));
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.trim());
    System.out.println(str.replace('e','m'));

    for (char st : str.toCharArray()) {
        System.out.println(st);
    }
   } 
}
