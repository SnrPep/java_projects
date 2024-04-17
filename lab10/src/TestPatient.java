import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestPatient {
    public static void main(String[] args) {
        BlockingQueue<Patient> patientQueue = new LinkedBlockingQueue<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int treatmentTime = random.nextInt(3) + 1;
            Patient patient = new Patient("Пациент " + i, treatmentTime);
            patientQueue.add(patient);
        }

        int numDoctors = 3;
        for (int i = 1; i <= numDoctors; i++) {
            new Thread(new Doctor(patientQueue, "Медсестры " + i)).start();
        }
    }
}