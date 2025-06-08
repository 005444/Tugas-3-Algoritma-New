public class DataCsv {
    private String loanId;
    private String gender;
    private String married;
    private String dependents;
    private String education;
    private String selfEmployed;
    private double applicantIncome;
    private double coapplicantIncome;
    private double loanAmount;
    private double loanAmountTerm;
    private String creditHistory;
    private String propertyArea;
    private String loanStatus;

    public DataCsv() {

    }

    public DataCsv(String loanId, String gender, String meried, String dependents, String education,
                   String selfEmployed, double applicantIncome, double coapplicantIncome, double loanAmount,
                   double loanAmountTerm, String creditHistory, String propertyArea, String loanStatus) {

        this.loanId = loanId;
        this.gender = gender;
        this.married = meried;
        this.dependents = dependents;
        this.education = education;
        this.selfEmployed = selfEmployed;
        this.applicantIncome = applicantIncome;
        this.coapplicantIncome = coapplicantIncome;
        this.loanAmount = loanAmount;
        this.loanAmountTerm = loanAmountTerm;
        this.creditHistory = creditHistory;
        this.propertyArea = propertyArea;
        this.loanStatus = loanStatus;

    }

    //Getter dan Setter
    public String getLoanId() {
        return this.loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMeried() {
        return this.married;
    }

    public void setMeried(String meried) {
        this.married = meried;
    }

    public String getDependents() {
        return this.dependents;
    }

    public void setDependents(String dependents) {
        this.dependents = dependents;
    }

    public String getEducation() {
        return this.education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSelfEmployed() {
        return this.selfEmployed;
    }

    public void setSelfEmployed(String selfEmployed) {
        this.selfEmployed = selfEmployed;
    }

    public double getApplicantIncome() {
        return this.applicantIncome;
    }

    public void setApplicantIncome(double applicantIncome) {
        this.applicantIncome = applicantIncome;
    }

    public double getCoapplicantIncome() {
        return this.coapplicantIncome;
    }

    public void setCoapplicantIncome(double coapplicantIncome) {
        this.coapplicantIncome = coapplicantIncome;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanAmountTerm() {
        return this.loanAmountTerm;
    }

    public void setLoanAmountTerm(double loanAmountTerm) {
        this.loanAmountTerm = loanAmountTerm;
    }

    public String getCreditHistory() {
        return this.creditHistory;
    }

    public void setCreditHistory(String creditHistory) {
        this.creditHistory = creditHistory;
    }

    public String getPropertyArea() {
        return this.propertyArea;
    }

    public void setPropertyArea(String propertyArea) {
        this.propertyArea = propertyArea;
    }

    public String getLoanStatus() {
        return this.loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public void print() {
        System.out.println("ID peminjam :" + loanId);
        System.out.println("Gender :" + gender);
        System.out.println("Status Pernikahan :" + married);
    }


    public void print(boolean fullData) {
        if (fullData) {
            System.out.println("===DATA PEMINJAM===");
            System.out.println("ID Peminjam :" + loanId);
            System.out.println("Gender :" + gender);
            System.out.println("Status Pernikahan :" + married);
            System.out.println("Jumlah Tanggungan :" + dependents);
            System.out.println("Pendidikan :" + education);
            System.out.println("Pengusaha :" + selfEmployed);
            System.out.println("Pendapatan Peminjam Utama :" + applicantIncome);
            System.out.println("Pendapatan Peminjam Pendukung :" + coapplicantIncome);
            System.out.println("Jumlah Pinjaman :" + loanAmount);
            System.out.println("Jangka Waktu Bayar Pinjaman :" + loanAmountTerm);
            System.out.println("Riwayat Kredit :" + creditHistory);
            System.out.println("Status PInjaman :" + loanStatus);
        }else {
            print();
        }

    }

}