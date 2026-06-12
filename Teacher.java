class Teacher extends Person{
    private String department;
    private double salary;

    
    // constructpr
    public Teacher(String id, String name, int age, String deparment, double salary) {
        super (id, name, age);
        this.department = deparment;
        this.salary = salary;
    }
    
    // 
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    // salary
    public double getSalary() {
        return salary;
    }

    public  void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } 
        else {
            System.out.println("invalid salary value");
        }
    }



    // for abstract 
    @Override
    public void displayInfo() {
        System.out.println("-------------------------------");
        System.out.println("Teacher ID: " + getId());
        System.out.println("Teacher Name: " + getName());
        System.out.println("Teacher Age: " + getAge());
        System.out.println("Teacher Department: " + department);
        System.out.println("Teacher Salary: %.2f" + salary);
    }
    public String getRole() {
        return "Teacher";
    };
}
