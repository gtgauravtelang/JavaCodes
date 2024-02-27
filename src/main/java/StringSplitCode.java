/*
<Question> What this code do?
<Answer> This splits str1 based on "<space>" separator & save each splitted word in a Strings array: arraystring
Output:
1. This 2. is 3. Gaurav 4. Telang's 5. Code 6. File 7. & 8. this 9. is 10. going 11. to 12. be 13. success
 */

public class StringSplitCode {
    public static void main(String[] args)
    {
        int counter = 1;
        String str1 = "This is Gaurav Telang's Code File & this is going to be success";
        String[] arraystring;

        arraystring = str1.split(" ");
        for (String s : arraystring) {
            System.out.print(counter+". "+s+ " ");
            counter++;
        }
    }
}
