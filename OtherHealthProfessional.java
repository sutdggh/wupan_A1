// OtherHealthProfessional.java
public class OtherHealthProfessional extends HealthProfessional {
    private String professionType;  // 其他健康专业人员的类型

    // 默认构造函数
    public OtherHealthProfessional() {
        super();  // 调用父类构造函数
        this.professionType = "Specialist";
    }

    // 初始化构造函数
    public OtherHealthProfessional(int id, String name, String description, String professionType) {
        super(id, name, description);  // 调用父类构造函数
        this.professionType = professionType;
    }

    // 打印健康专业人员的详情
    @Override
    public void printDetails() {
        super.printDetails();  // 调用父类方法
        System.out.println("Profession Type: " + professionType);
    }
}
