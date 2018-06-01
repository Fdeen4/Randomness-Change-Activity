# Randomness-Change-Activity
Randomness Change Activity
Due No Due Date  Points 1  Submitting a website url
The following code, our program from last time, generates a random number between 1 and 6, inclusive. Change the code to generate a random integer between 5 and 95.

import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 1 and 6");

        Random rnd = new Random();
        
        for (int i = 1; i <= 10; ++i)
        {
          int randomInt = 1 + rnd.nextInt(6);
          System.out.println("Generated number: " + randomInt);
        }
    
        System.out.println("Done.");
    }
}
