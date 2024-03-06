import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateStr
{
    public void IntDupRemOrder()
    {
        int[] array = {1, 2, 10, 5, 7, 9, 2, 6, 5, 1, 3};
        System.out.print("Original Integers:[");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + ", ");
        }

        Set<Integer> dupRemove = new HashSet<>();
        for (int x: array)
        {
            dupRemove.add(x);
        }
        System.out.println("\nIntDupRemOrder:   "+dupRemove+"\n");
    }

    public void charRemDep()
    {
        System.out.print("Original Characters: [");
        char[] chars = {'a','b','a','t','e'};
        System.out.print(chars);
        System.out.print("]\n-------------------->");

        Set<Character> setChar = new HashSet<>();
        for (int i=0;i<chars.length;i++)
        {
            setChar.add(chars[i]);
        }
        System.out.println(setChar+"\n");
    }
    public void strRemDep()
    {
        String str1 = "my name is gaurav telang and my name was telang";
        System.out.print("Original Strings: "+str1);
        Set<String> RemDupStr = new HashSet<>();
        String[] strsize = str1.split(" ");
        for (String x:strsize)
        {
            RemDupStr.add(x);
        }
        System.out.println("\n---------------->"+RemDupStr);
    }
    public static void main(String[] args)
    {
        RemoveDuplicateStr obj = new RemoveDuplicateStr();
        obj.IntDupRemOrder();
        obj.charRemDep();
        obj.strRemDep();
    }
}
