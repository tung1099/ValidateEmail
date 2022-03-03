package com.company;

public class EmailExampleTest {

    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "111abc@gmail.com", "dt@codegym.com", "a@gmail.",
           "dt@yahoo.com" ,"#@gmail.com" };

    public static void main(String args[]) {
        emailExample = new EmailExample();
        for (String email: validEmail
             ) {
            boolean isValid = emailExample.validate(email);
            if (isValid == true){
                System.out.println("Email: '" + email + '\'' + " hợp lệ!");
            } else {
                System.out.println("Email: '" + email + '\'' + " không hợp lệ");
            }


        }
    }
}
