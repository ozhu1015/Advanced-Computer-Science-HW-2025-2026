public class Bank {
    int numberOfLoanOfficers;
    int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }
    
    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }
    
    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers + " loan officers and " 
                + numberOfTellers + " tellers.";
    }

    public boolean equals(Bank otherBank) {
        if (otherBank.numberOfLoanOfficers == this.numberOfLoanOfficers 
            && otherBank.numberOfTellers == this.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    public double getEmployeeRatio() {
        return (double) numberOfLoanOfficers / numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers -= numberToFire;
            if (numberOfLoanOfficers < 0) {
                numberOfLoanOfficers = 0;
            }
        } else {
            numberOfTellers -= numberToFire;
            if (numberOfTellers < 0) {
                numberOfLoanOfficers = 0;
            }
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer && numberOfLoanOfficers > 0) {
            numberOfLoanOfficers -= 1;
            numberOfTellers += 1;
        } else {
            if (numberOfTellers > 0) {
                numberOfLoanOfficers += 1;
                numberOfTellers -=1;
            }
        }
    }

    public int calculateSalary() {
        return 75000*numberOfLoanOfficers + 45000*numberOfTellers;
    }
        
}
