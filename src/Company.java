public class Company extends Organization{
    private int seniority;
    private int age;
    private int expectedSalary;

    public Company(String nameCompany, int seniority, int age, int expectedSalary) {
        super(nameCompany);
        this.seniority = seniority;
        this.age = age;
        this.expectedSalary = expectedSalary;
    }

    @Override
    public void goals() {
        System.out.println("Компания создает IT продукт");
    }

    @Override
    public boolean check(Candidate candidate) {
        return (this.seniority <= candidate.getSeniority() && this.age <= candidate.getAge() && this.expectedSalary >= candidate.getExpectedSalary());
    }
}
