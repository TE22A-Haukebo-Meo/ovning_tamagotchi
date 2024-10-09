import java.util.ArrayList;
import java.util.Random;

public class tamagotchi {
    private int hunger = 0;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<>();
    private boolean isAlive = true;
    private Random generator = new Random();
    static ArrayList <tamagotchi> friends = new ArrayList<>(); 
    String name;

    public void addHi(){
        words.add("hi");
    }

    public void tick(){
        hunger += 1;
        boredom += 1;
        if (boredom > 10 || hunger > 10) {
            isAlive = false;
        }
    }
    
    public void feed(){
        hunger -= generator.nextInt(10);
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void teach(String word){
        words.add(word);
        reduceBoredom();
    }

    public void hi(){
        int size = words.size();
        int randInt = generator.nextInt(size);
        System.out.println(words.get(randInt));
        reduceBoredom();
    }

    private void reduceBoredom(){
        boredom -= generator.nextInt(10);
        if (boredom < 0) {
            boredom = 0;
        }
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
