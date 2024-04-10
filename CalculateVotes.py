import time

class Candidates:
    def __init__(self, name, image, info):
        self.name = name
        self.image = image
        self.info = info

class Voters:
    def __init__(self, ID):
        self.ID = ID
        self.bio_verified = False

class Result:
    def __init__(self, winner, info):
        self.winner = winner
        self.info = info

class Check:
    def __init__(self):
        self.selected_candidate = None

    def verify_bio(self):
        print("Bio verification successful.")
        return True

    def scan_fingerprint(self):
        print("Fingerprint scanned successfully.")
        return True

    def select_candidate(self, candidate):
        self.selected_candidate = candidate

    def start_voting(self):
        print("Voting has started!")
        time.sleep(10)  # Simulating the voting process
        print("Voting has ended!")

    def show_results(self):
        print("Election Results:")
        print("Winner: ", self.selected_candidate.name)
        print("Info: ", self.selected_candidate.info)

def main():
    print("Welcome to the Election System!")
    print("Please enter your Passport number:")
    id_number = input()
    print("Please verify your bio:")
    bio = input()
    print("Bio verification successful. Opening voting booth...")
    print("Please select a candidate:")
    print("1. Candidate Abdushukur Hamzayev: 1973 y. Ekologik partiya")
    print("2. Candidate Muhammad Norov dgdfgetdgsrg")
    print("3. Candidate Ismoil Qodiriy ergergsrgrg")
    candidate_choice = input()
    if candidate_choice not in ("1", "2", "3"):
        print("Invalid choice. Exiting...")
        return
    candidate = Candidates("Candidate " + candidate_choice, "image" + candidate_choice + ".png", "Info about Candidate " + candidate_choice)
    check = Check()
    check.select_candidate(candidate)
    print("Voting will start in 10 seconds.")
    time.sleep(10)
    print("Voting has ended!")
    check.show_results()
    print("Please enter your passport information to check your vote:")
    passport_info = input()
    print("You voted for: ", check.selected_candidate.name)
    print("Passport: ", passport_info)

if __name__ == "__main__":
    main()