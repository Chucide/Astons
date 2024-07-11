import Employeers.Worker;
import Entertainment.Park;

public class Main {
    public static void main(String[] args){
    Worker[] workerArray = new Worker[5];
    Worker workerTask = new Worker("Kira", "Junior", "Kira@gmail.com","+375256661111", 1000, 18);
    workerArray[0] = workerTask;
    workerArray[1] = new Worker("Alex", "Junior", "Alex@gmail.com", "+375253231613", 1000, 20);
    workerArray[2] = new Worker("David", "Junior", "David@gmail.com", "+375257771215", 1000, 20);
    workerArray[3] = new Worker("Max", "Beginner", "Max@gmail.com", "+375256123131", 1100, 28);
    workerArray[4] = new Worker("Nikita", "Middle", "Nikita@gmail.com", "+375256091252", 1200, 30);

    Park park = new Park();
    Park.Attraction[] attractionsArray = new Park.Attraction[3];
    attractionsArray[0] = park.new Attraction("Башня Падения", "10:00 - 17:00", 20);
    attractionsArray[1] = park.new Attraction("Седьмое Небо", "10:00 - 19:00", 15);
    attractionsArray[2] = park.new Attraction("Космическое путешествие", "10:00 - 18:00", 25);

    System.out.println("\nПервое задание:\n\n" + workerTask);
    System.out.println("\n Второе задание:\n");
    workerTask.allWorkers(workerArray);
    System.out.println("\n Третье задание:\n");
    park.attractionsInPark(attractionsArray);
    park.attractionsInfo(attractionsArray);

    }
}
