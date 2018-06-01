import java.util.Random;
public class RandomnessChangeActivity {
    public static void main(String[] args) {
        output("Generate 10 random integers between 0 and 6");
        Random rnd = new Random();

        for (int i = 1; i <= 10; ++i) {
            int randomInt = 5 + rnd.nextInt(96);
            System.out.println("Generated number: " + randomInt);

        }

        output("done");
    }
        private static void output(String aMessage)
        {
        System.out.println("Done.");
    }
}
