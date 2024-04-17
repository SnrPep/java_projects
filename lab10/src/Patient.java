import java.util.Random;
import java.util.concurrent.*;

class Patient {
    private final String name;
    private final int treatmentTime;

    public Patient(String name, int treatmentTime) {
        this.name = name;
        this.treatmentTime = treatmentTime;
    }

    public String getName() {
        return name;
    }

    public int getTreatmentTime() {
        return treatmentTime;
    }
}

class Doctor implements Runnable {
    private final BlockingQueue<Patient> patientQueue;
    private final String name;

    public Doctor(BlockingQueue<Patient> patientQueue, String name) {
        this.patientQueue = patientQueue;
        this.name = name;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Patient patient = patientQueue.take();
                System.out.println(patient.getName() + " обслуживается у " + name);
                Thread.sleep(patient.getTreatmentTime() * 1000L);
                System.out.println(patient.getName() + " обслужен у " + name);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}