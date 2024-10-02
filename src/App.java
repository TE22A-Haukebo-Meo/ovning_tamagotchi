import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hejsan! vad vill du att din kompis ska heta?");
        Scanner tb = new Scanner(System.in);
        tamagotchi friend = new tamagotchi();
        friend.name = tb.nextLine();
        
    }

    public void spelLoop(tamagotchi friend){
        Scanner tb = new Scanner(System.in);
        while (friend.getAlive()) {
            System.out.println("Vad vill du göra med "+friend.name+"?");
        System.out.println("1. Mata");
        System.out.println("2. Prata");
        System.out.println("3. Lär ett ord");
        int val = tb.nextInt();
        }
        
        
    }
}
