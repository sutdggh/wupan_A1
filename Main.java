// Main.java
public class Main {
    public static void main(String[] args) {
        // 第3部分：使用类和对象
        System.out.println("-------------------------------------------------------");

        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John", "Family medicine specialist", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Mary", "General health practitioner", "General Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Lisa", "GP for pediatrics", "Pediatrics");

        // 创建两个其他健康专业人员对象
        OtherHealthProfessional specialist1 = new OtherHealthProfessional(4, "Dr. David", "Orthopedic surgeon", "Orthopedic");
        OtherHealthProfessional specialist2 = new OtherHealthProfessional(5, "Dr. Sophia", "Cardiologist", "Cardiology");

        // 打印健康专业人员的详情
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        specialist1.printDetails();
        specialist2.printDetails();

        System.out.println("-------------------------------------------------------");
    }
}
