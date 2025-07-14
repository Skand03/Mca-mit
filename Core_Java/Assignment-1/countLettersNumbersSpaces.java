import java.util.Scanner;

public class countLettersNumbersSpaces {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Characters");
        String characterName = sc.nextLine();

//        int charcterCount = characterName.length();
//        System.out.println("Count the total numbers of length " + charcterCount);

        System.out.println("Enter the Value");
        char findRepeatCharacter = sc.next().charAt(0);
        int count = 0;
        for(int i = 0;i<characterName.length();i++){
            if(characterName.charAt(i)==findRepeatCharacter){
                count++;
            }
        }
            System.out.println("Number of count " + count + " " + "Character " + findRepeatCharacter);




    }
}
