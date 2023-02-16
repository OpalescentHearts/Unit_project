import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int dog = 0;
        System.out.println("" +
                "╱▏┈┈┈┈┈┈▕╲▕╲┈┈┈\n" +
                "▏▏┈┈┈┈┈┈▕▏▔▔╲┈┈\n" +
                "▏╲┈┈┈┈┈┈╱┈▔┈▔╲┈\n" +
                "╲▏▔▔▔▔▔▔╯╯╰┳━━▀\n" +
                "┈▏╯╯╯╯╯╯╯╯╱┃┈┈┈\n" +
                "┈┃┏┳┳━━━┫┣┳┃┈┈┈\n" +
                "┈┃┃┃┃┈┈┈┃┃┃┃┈┈┈\n" +
                "┈┗┛┗┛┈┈┈┗┛┗┛┈┈┈\nWelcome to the Historical Weapons Shop!");
        while (true){
            System.out.println("What are you looking for? ");
            Scanner questionStart = new Scanner(System.in);
            System.out.println("[Melee], [Ranged], [Rob] the dog, [Leave]");
            String answerStart = questionStart.nextLine();
            if (answerStart.equals("Melee") || answerStart.equals("melee")){
                Scanner questionMelee = new Scanner(System.in);
                System.out.println("[Sword], [Dagger], [Misc]");
                String answerMelee = questionMelee.nextLine();
                if (answerMelee.equals("Sword") || answerMelee.equals("sword")) {

                }
                else if (answerMelee.equals("Dagger") || answerMelee.equals("dagger")) {

                }
                if (answerMelee.equals("Misc") || answerMelee.equals("misc")) {

                }

            }
            else if (answerStart.equals("Ranged") || answerStart.equals("ranged")){
                System.out.println("Boop but ranged");
            }
            else if (answerStart.equals("Rob") || answerStart.equals("rob")){
                dog += 1;
                if (dog == 1){
                    System.out.println(
                            "╱▏┈┈┈┈┈┈▕╲▕╲┈┈┈\n" +
                            "▏▏┈┈┈┈┈┈▕▏▔▔╲┈┈\n" +
                            "▏╲┈┈┈┈┈┈╱┈▔┈▔╲┈    ︻╦╤─\n" +
                            "╲▏▔▔▔▔▔▔╯╯╰┳━━▀\n" +
                            "┈▏╯╯╯╯╯╯╯╯╱┃┈┈┈ \n" +
                            "┈┃┏┳┳━━━┫┣┳┃┈┈┈\n" +
                            "┈┃┃┃┃┈┈┈┃┃┃┃┈┈┈\n" +
                            "┈┗┛┗┛┈┈┈┗┛┗┛┈┈┈      \n");
                    System.out.println("The shop owner seems upset");
                    System.out.println("He shoots you");
                }
                if (dog == 2){
                    System.out.println(
                            "╱▏┈┈┈┈┈┈▕╲▕╲┈┈┈\n" +
                                    "▏▏┈┈┈┈┈┈▕▏▔▔╲┈┈\n" +
                                    "▏╲┈┈┈┈┈┈╱┈▔┈▔╲┈    ︻╦╤─\n" +
                                    "╲▏▔▔▔▔▔▔╯╯╰┳━━▀\n" +
                                    "┈▏╯╯╯╯╯╯╯╯╱┃┈┈┈ \n" +
                                    "┈┃┏┳┳━━━┫┣┳┃┈┈┈\n" +
                                    "┈┃┃┃┃┈┈┈┃┃┃┃┈┈┈\n" +
                                    "┈┗┛┗┛┈┈┈┗┛┗┛┈┈┈      \n");
                    System.out.println("The shop owner wonders why you would try again");
                    System.out.println("He shoots you \nGoodbye :)");
                    break;
                }
            } else if (answerStart.equals("Leave") || answerStart.equals("leave")) {
                System.out.println("You left");
                break;
            } else{
                System.out.println("I don't think we have those");
            }
        }
    }
}

// System.out.println("");