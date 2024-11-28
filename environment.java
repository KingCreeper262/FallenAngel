import java.util.Scanner;

public class environment {
    public static void main(String[] args) {
        hero player = new hero("B'alih");
        boolean stay = true;
        @SuppressWarnings("resource")
        Scanner lineReader = new Scanner(System.in);
        while(stay) {
            System.out.println("Would you like to:");
            System.out.println("a) Gather");
            System.out.println("b) Hunt");
            System.out.println("c) Travel");
            System.out.println("d) View Character");
            System.out.print("e) Quit");
            String input = lineReader.nextLine();
            System.out.println();
            switch (input) {
                case "a" -> gatheringNode(player);
                case "b" -> System.out.println("Hunting is coming soon.");
                case "c" -> System.out.println("Traveling is coming soon.");
                case "d" -> player.inventoryView();
                case "e" -> stay = false;
                default -> System.out.println("That isn't an option. Please try again.");
            }
        }
    }
    @SuppressWarnings("resource")
    public static void gatheringNode(Object player) {
        Scanner lineReader = new Scanner(System.in);
        System.out.println("What do you want to gather?");
        System.out.println("a) Log");
        System.out.println("b) Branch");
        System.out.println("c) Ore");
        System.out.println("d) Salt");
        System.out.print("e) Quit");
        String answer = lineReader.nextLine();
        switch (answer) {
            case "a" ->                 {
                    System.out.println("You gather a Log.");
                    var item = new item("Log", 1, "material");
                    ((hero) player).addItem(item);
                }
            case "b" ->                 {
                    System.out.println("You gather a Branch.");
                    var item = new item("Branch", 1, "material");
                    ((hero) player).addItem(item);
                }
            case "c" ->                 {
                    System.out.println("You gather an Ore chunk.");
                    var item = new item("Ore", 1, "material");
                    ((hero) player).addItem(item);
                }
            case "d" ->                 {
                    System.out.println("You gather a pinch of Salt.");
                    var item = new item("Salt", 1, "material");
                    ((hero) player).addItem(item);
                }
            default -> {
            }
        }
    } 
}
