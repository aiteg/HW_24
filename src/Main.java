class Main {
    public static void main(String[] args) {
        System.out.println("Данная программа выводит true если кандидат подходит под требования " +
                "компании и false если хотя бы одно из требования не подходит");
        Candidate candidate = new Candidate("Aiteg",9, 67, 90000);
        Company company = new Company("MetaLabs", 1, 19, 60000);
        company.goals();

        System.out.println(company.check(candidate));
    }
}