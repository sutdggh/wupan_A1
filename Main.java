import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ========== PART 3: 使用类和对象 ==========
        System.out.println("-------------------------------------------------------");
        System.out.println("PART 3: Using Classes and Objects");

        // 创建三个全科医生 (GeneralPractitioner)
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John", "Family medicine specialist", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Mary", "General health practitioner", "General Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Lisa", "GP for pediatrics", "Pediatrics");

        // 创建两个其他健康专业人员 (比如专科医生)
        OtherHealthProfessional specialist1 = new OtherHealthProfessional(4, "Dr. David", "Orthopedic surgeon", "Orthopedic");
        OtherHealthProfessional specialist2 = new OtherHealthProfessional(5, "Dr. Sophia", "Cardiologist", "Cardiology");

        // 打印所有医生信息
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        specialist1.printDetails();
        specialist2.printDetails();

        System.out.println("-------------------------------------------------------");

        // ========== PART 5: Collection of Appointments ==========
        System.out.println("-------------------------------------------------------");
        System.out.println("PART 5: Managing Appointments");

        // Step 1: 创建一个 ArrayList 来存储预约
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Step 2: 创建 2 个 GP 预约
        Appointment app1 = new Appointment("Alice Chen", "0412345678", "09:00", gp1);
        Appointment app2 = new Appointment("Bob Liu", "0412345679", "10:00", gp2);

        // Step 3: 创建 2 个 其它健康专业人员（专科）预约
        Appointment app3 = new Appointment("Charlie Wang", "0412345680", "11:00", specialist1);
        Appointment app4 = new Appointment("Diana Zhou", "0412345681", "14:00", specialist2);

        // Step 4: 添加预约到集合
        appointments.add(app1);
        appointments.add(app2);
        appointments.add(app3);
        appointments.add(app4);

        // Step 5: 打印所有现有预约
        printExistingAppointments(appointments);

        // Step 6: 取消一个预约（比如 Bob Liu: 0412345679）
        System.out.println("\nAttempting to cancel appointment with phone: 0412345679");
        cancelBooking(appointments, "0412345679");

        // Step 7: 再次打印预约，查看是否已更新
        System.out.println("\nAppointments after cancellation:");
        printExistingAppointments(appointments);

        System.out.println("-------------------------------------------------------");
    }

    // ✅ 方法：打印所有预约（如果无预约则提示）
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment app : appointments) {
                app.printAppointmentDetails();
                System.out.println("----------------------------------------");
            }
        }
    }

    // ✅ 方法：根据手机号取消预约
    public static void cancelBooking(ArrayList<Appointment> appointments, String phone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            Appointment app = appointments.get(i);
            if (app.getPhone().equals(phone)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled successfully for phone: " + phone);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with phone: " + phone);
        }
    }
}