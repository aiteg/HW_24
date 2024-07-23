public class Candidate {
    private String name;
    private int seniority;
    private int age;
    private int expectedSalary;

    public Candidate(String name, int seniority, int age, int expectedSalary) {
        this.name = name;
        this.seniority = seniority;
        this.age = age;
        this.expectedSalary = expectedSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(int expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
}
