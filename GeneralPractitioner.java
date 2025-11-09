// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String specialty;  // 例如，家庭医学

    // 默认构造函数
    public GeneralPractitioner() {
        super();  // 调用父类构造函数
        this.specialty = "General";
    }

    // 初始化构造函数
    public GeneralPractitioner(int id, String name, String description, String specialty) {
        super(id, name, description);  // 调用父类构造函数
        this.specialty = specialty;
    }

    // 打印健康专业人员的详情
    @Override
    public void printDetails() {
        super.printDetails();  // 调用父类方法
        System.out.println("Specialty: " + specialty);
    }
}

