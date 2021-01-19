package sk.kosickaakademia.regex;

public class NoRegex {
    public boolean isValidSPZ(String spz){

        spz = spz.toUpperCase();
        if(spz.length()!=7){
            return false;
        }
        if(spz.charAt(0) < 65 || spz.charAt(0) > 90){
            return false;
        }
        if(spz.charAt(1) < 65 || spz.charAt(1) > 90){
            return false;
        }
        return true;
    }
}
