/*Write a Java program that implements a multi-threaded application that has three threads. 
First thread generates a random integer every 1 second and if the value is even, second thread computes the square of the number and prints. 
If the value is odd, the third thread will print the value of cube of the number. */
import java.util.Random;
class Square extends Thread
    {
        int x;
        Square(int n)
            {
                x = n;
            }
        public void run()
            {
                int sqr = x * x;
                System.out.println("Square of " + x + " = " + sqr );
            }
    }
class Cube extends Thread
    {
        int x;
        Cube(int n)
                {
                    x = n;
                }
                    public void run()
                        {
                            int cub = x * x * x;
                            System.out.println("Cube of " + x + " = " + cub );
                        }
    }
class Number extends Thread
    {
        public void run()
            {
                Random random = new Random(); 
                for(int i =0; i<10; i++)
                    {
                        int randomInteger = random.nextInt(100);
                        System.out.println("Random Integer generated : " + randomInteger);
                        if (randomInteger%2==0) {
                            Square s = new Square(randomInteger);
                            s.start();
                        }
                        else {
                        Cube c = new Cube(randomInteger);
                        c.start();
                        }
                    try {
                        Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                    System.out.println(ex); 
                }
            }
        }
    }
public class MultiThreading {
    public static void main(String args[])
    {
        Number n = new Number();
        n.start();
    }
}
