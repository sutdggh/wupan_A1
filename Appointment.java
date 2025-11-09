// Appointment.java
public class Appointment {
    private String patientName;
    private String phone;
    private String preferredTime;
    private HealthProfessional doctor;  // 所选医生

    // 默认构造函数
    public Appointment() {
        this.patientName = "";
        this.phone = "";
        this.preferredTime = "";
        this.doctor = null;
    }

    // 初始化构造函数
    public Appointment(String patientName, String phone, String preferredTime, HealthProfessional doctor) {
        this.patientName = patientName;
        this.phone = phone;
        this.preferredTime = preferredTime;
        this.doctor = doctor;
    }

    // 打印预约详情
    public void printAppointmentDetails() {
        System.out.println("Appointment Details: ");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone: " + phone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("Doctor: " + doctor.getClass().getSimpleName());
        doctor.printDetails();
    }
}
