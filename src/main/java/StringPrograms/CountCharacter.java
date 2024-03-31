package StringPrograms;

public class CountCharacter {
    public static void main(String[] args) {
        var str ="Today is";
        System.out.println(str.length());
        int length=0;
        for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i)!=' '){
                 ++length;
             }
        }
        System.out.println("Length without space "+length);
    }

}
