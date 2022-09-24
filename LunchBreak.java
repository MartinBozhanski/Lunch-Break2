import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = lunchBreak / 8.0;
        double freeTime = lunchBreak / 4.0;
        double timeLast = lunchBreak * 1.0 - lunchTime - freeTime;

        if (timeLast >= episode) {
             double time = Math.ceil(timeLast - episode);
            System.out.printf("You have enough time to watch %s " + "and left with %.0f minutes free time. " , name, Math.ceil(timeLast - episode));
        }
        else {
            double time2 = Math.ceil(episode - timeLast);
            System.out.printf("You don't have enough time to watch %s" + ", you need %.0f more minutes." , name, Math.ceil(episode - timeLast));
        }
    }
}
