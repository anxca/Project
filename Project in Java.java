import java.util.Scanner;

class Candidates {
    public String name;
    public String image;
    public String info;

    public Candidates(String name, String image, String info) {
        this.name = name;
        this.image = image;
        this.info = info;
    }
}

class Voters {
    public String ID;
    public boolean bioVerified;

    public Voters(String ID) {
        this.ID = ID;
        this.bioVerified = false;
    }
}

class Result {
    public Candidates winner;
    public String info;

    public Result(Candidates winner, String info) {
        this.winner = winner;
        this.info = info;
    }
}

class Check {
    public Candidates selectedCandidate;

    public boolean verifyBio() {
        System.out.println("Bio verification successful.");
        return true;
    }

    public boolean scanFingerprint() {
        System.out.println("Fingerprint scanned successfully.");
        return true;
    }

    public void selectCandidate(Candidates candidate) {
        this.selectedCandidate = candidate;
    }

    public void startVoting() {
        System.out.println("Voting has started!");
        try {
            Thread.sleep(10000); // Simulating the voting process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Voting has ended!");
    }

    public void showResults() {
        System.out.println("Election Results:");
        System.out.println("Winner: " + selectedCandidate.name);
        System.out.println("Info: " + selectedCandidate.info);
    }
}

public class CalculateVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Election System!");
        System.out.println("Please enter your Passport number:");
        String idNumber = scanner.nextLine();

        System.out.println("Please verify your bio:");
        String bio = scanner.nextLine();

        Check check = new Check();
        if (check.verifyBio()) {
            System.out.println("Bio verification successful. Opening voting booth...");
            System.out.println("Please select a candidate:");
            System.out.println("1. Candidate Abdushukur Hamzayev: 1973 y. Ekologik partiya");
            System.out.println("2. Candidate Muhammad Norov dgdfgetdgsrg");
            System.out.println("3. Candidate Ismoil Qodiriy ergergsrgrg");

            int candidateChoice = scanner.nextInt();
            Candidates selectedCandidate = null;

            switch (candidateChoice) {
                case 1:
                    selectedCandidate = new Candidates("Abdushukur Hamzayev", "image1.jpg", "1973 y. Ekologik partiya");
                    break;
                case 2:
                    selectedCandidate = new Candidates("Muhammad Norov", "image2.jpg", "dgdfgetdgsrg");
                    break;
                case 3:
                    selectedCandidate = new Candidates("Ismoil Qodiriy", "image3.jpg", "ergergsrgrg");
                    break;
                default:
                    System.out.println("Invalid candidate choice.");
                    break;
            }

            if (selectedCandidate != null) {
                check.selectCandidate(selectedCandidate);
                check.startVoting();
                check.showResults();
            }
        }

        scanner.close();
    }
}