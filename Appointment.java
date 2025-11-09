// Appointment.java
public class Appointment {
    private String patientName;
    private String phone;
    private String preferredTime;
    private HealthProfessional doctor;  // 所选医生对象

    // 默认构造函数
    public Appointment() {
        this.patientName = "";
        this.phone = "";
        this.preferredTime = "";
        this.doctor = null;
    }

    // 带参数的构造函数
    public Appointment(String patientName, String phone, String preferredTime, HealthProfessional doctor) {
        this.patientName = patientName;
        this.phone = phone;
        this.preferredTime = preferredTime;
        this.doctor = doctor;
    }

    // 打印预约详情，包括医生信息
    public void printAppointmentDetails() {
        System.out.println("Appointment Details: ");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone: " + phone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("Doctor: " + doctor.getClass().getSimpleName());
        doctor.printDetails();  // 调用医生对象的打印方法
    }

    // ✅ 新增：提供 phone 的 getter，用于取消预约时查找
    public String getPhone() {
        return phone;
    }
}