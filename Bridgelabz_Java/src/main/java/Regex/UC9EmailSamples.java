
package main.java.Regex;

import java.util.regex.Pattern;

public class UC9EmailSamples {
    public static void main(String[] args) {

        String regex =
                "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@"
                + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*\\."
                + "[A-Za-z]{2,}$";

        String[] emails = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com",
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
        };

        for (String email : emails) {
            if (Pattern.matches(regex, email)) {
                System.out.println(email + " -> Valid");
            } else {
                System.out.println(email + " -> Invalid");
            }
        }
    }
}
