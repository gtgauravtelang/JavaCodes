public class StringSplitCode {
    public static void main(String[] args)
    {
        String str1 = "This is my world";
        String[] arraystring;

        arraystring = str1.split(" ");
        for (String s : arraystring) {
            System.out.println(s);
        }
    }
}