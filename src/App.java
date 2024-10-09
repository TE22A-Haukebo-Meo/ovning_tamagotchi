import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hejsan! vad vill du att din kompis ska heta?");
        Scanner tb = new Scanner(System.in);
        tamagotchi friend = new tamagotchi();
        friend.name = tb.nextLine();       
        tamagotchi.friends.add(friend);
        spelLoop(friend);
    }

    public static void spelLoop(tamagotchi friend){
        Scanner tb = new Scanner(System.in);
        System.out.println("Vilken kompis vill du leka med?");
        for (int i = 0; i < tamagotchi.friends.size(); i++) {
            System.out.println(tamagotchi.friends);
        }
        String choice = tb.nextLine();
        for (int i = 0; i < tamagotchi.friends.size(); i++) {
            if (tamagotchi.friends.contains(choice)) {
                
            }
        }
        friend.addHi();
        while (friend.getAlive()) {
            System.out.println("Vad vill du göra med "+friend.name+"?");
        System.out.println("1. Mata");
        System.out.println("2. Prata");
        System.out.println("3. Lär ett ord");
        System.out.println("4. Pass");
        System.out.println("5. Skapa ny kompis!");
        int val = tb.nextInt();
        if (val == 1) {
            friend.feed();
        }
        else if (val == 2) {
            friend.hi();
        }
        else if (val == 3) {
            System.out.println("Välj ett ord att lära din kompis:");
            tb.nextLine();
            String word = tb.nextLine();
            friend.teach(word);
        }
        else if (val == 5) {
            createFriend();
        }
        else{

        }
        friend.tick();
        friend.printStats();
        }
        
        
    }
    public static void createFriend(){
        Scanner tb = new Scanner(System.in);
        System.out.println("Vad vill du döpa din nya kompis?");
        tamagotchi friend = new tamagotchi();
        friend.name = tb.nextLine();
        tamagotchi.friends.add(friend);
    }
}
