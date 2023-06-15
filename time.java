import java.util.concurrent.TimeUnit;

// Program to measure elapsed time in Java
class time
{
    public static void main(String[] args) throws InterruptedException
    {
        int i =0;
        while(i<5)
        {i++;
            long startTime = System.nanoTime();

            /* … The code being measured starts … */

            // sleep for 5 seconds
            TimeUnit.SECONDS.sleep(5);

            /* … The code being measured ends … */

            long endTime = System.nanoTime();

            // get the difference between the two nano time valuess
            long timeElapsed = endTime - startTime;

            System.out.println("Execution time in nanoseconds: " + timeElapsed);
            System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
        }}
}