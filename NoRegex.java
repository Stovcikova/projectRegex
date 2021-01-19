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
    public boolean isValidOP(String text){
        if(text==null)
            return false;

        text = text.toUpperCase().trim();	//trim odstani medheru pred aj za textom

        if(text.length()!=8){
            return false;
        }
        for(int i=0;i<=1;i++)//kontrola na prve 2 znaky ci su pismena bud takto alebo cez ascii co mam nizsie
            if(!Character.isLetter(text.charAt(i)))
                return false;

        for(int i=2;i<=7;i++)//kontrola dalsích znakov ci to su cisla
            if(!Character.isDigit(text.charAt(i)))
                return false;

        return true;
    }
}
