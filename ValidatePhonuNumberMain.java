package sk.kosickaakademia.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumberMain {
    public static boolean isValidE123(String s){
        Pattern p=Pattern.compile("^ \\ + (?: [0-9]?) {6,14} [0-9] $");
//^+421 ?[0-9]{3} ?[0-9]{3} ?[0-9]{3}$
        Matcher m= p.matcher(s);
        return (m.find()&& m.group().equals(s));
    }


    public static void main(String[] args) {
        String phone1= "+421 903 233 156";
        String phone2= "0903 233 156";
        String phone3="00421 903233156";
        String phone4="+248 25500000000000232222";
        String[] phoneNumbers={phone1,phone2,phone3, phone4};
        for (int i=0;i< phoneNumbers.length;i++){
            String phoneNumber=phoneNumbers[i];
            if (isValidE123(phoneNumber))
                System.out.println(phoneNumber+"is valid phone number");
            else
                System.out.println(phoneNumber+"is valid Phone number");
            System.out.println();


    }

    }
}