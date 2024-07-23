public abstract class Organization implements Verificationable {
    private String nameCompany;

    public Organization(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void goals() {
        System.out.println("Компания производит пк");
    }

    @Override
    public boolean check(Candidate candidate) {
        return false;
    }
}
