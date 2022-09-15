public class Main {

    public static void main(String[] args) {
        BasedLoanManager[] loanManagers = new BasedLoanManager[]{new TeacherLoanManager(), new AgricultureLoanManager(), new StudentsLoanManager()};
        for (BasedLoanManager loanManager : loanManagers) {
            System.out.println(loanManager.calculation(100));
        }
    }
}
