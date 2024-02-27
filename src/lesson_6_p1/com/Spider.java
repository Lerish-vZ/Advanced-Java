package lesson_6_p1.com;

public class Spider extends Animal {
    
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }
    
}