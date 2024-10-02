import java.util.ArrayList;
import java.util.Random;

public class tamagotchi {
    private int hunger = 0;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<>();
    private boolean isAlive = true;
    private Random generator = new Random();
    String name;

    public void tick(){
        hunger += 1;
        boredom += 1;
        if (boredom > 10 || hunger > 10) {
            isAlive = false;
        }
    }
    
    public void feed(){
        hunger = 0;
    }

    public void teach(String word){
        words.add(word);
        reduceBoredom();
    }

    public void hi(){
        System.out.println(words(generator.nextInt(words.length)));
        reduceBoredom();
    }

    private void reduceBoredom(){
        boredom = 0;
    }

    public boolean getAlive(){
        return isAlive;
    }

    public void printStats(){
        System.out.println("Hunger: "+hunger);
        System.out.println("Boredom: "+boredom);
        System.out.println("Alive? "+isAlive);
    }
    
}
