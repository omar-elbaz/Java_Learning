import java.util.Random;

public class RandomSeed {
    public static void main(String[] args)
    {
        Random generator =  new Random();
        int num1;
        // float num2;
        // create random object
        num1  = generator.nextInt(10);
        System.out.println("Random Integer without setting seed : " + num1);
  
        num1 += 1;
        // return the next pseudorandom integer value
        System.out.println("Random Integer without setting seed and using offset: " + num1);
  
        // setting seed
        long seed = 24;
  
        generator.setSeed(seed);
        num1 = generator.nextInt(10);
  
        // value after setting seed
        System.out.println("Random Integer with setting seed : " + num1);
    }
}
    

