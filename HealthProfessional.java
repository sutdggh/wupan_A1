// 文件路径: src/HealthProfessional1.java
public class HealthProfessional {
    // 实例变量
    private int id; // ID，仅数字
    private String name; // 名字
    private String description; // 描述信息（例如：地址、工作地点等）

    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.description = "No description available";
    }

    // 初始化所有实例变量的构造函数
    public HealthProfessional(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // 方法：打印所有实例变量
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }

    // 主方法用于测试
    public static void main(String[] args) {
        // 使用默认构造函数
        HealthProfessional defaultProfessional = new HealthProfessional();
        System.out.println("Default Constructor:");
        defaultProfessional.printDetails();

        // 使用参数化构造函数
        HealthProfessional customProfessional = new HealthProfessional(1, "Dr. John Doe", "Works at City Hospital");
        System.out.println("\nParameterized Constructor:");
        customProfessional.printDetails();
    }
}
