class Club {
    static String clubName = "Science Club";
    String memberName;

    Club(String name) {
        this.memberName = name;
    }

    static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    void displayMemberInfo() {
        System.out.println("Member Name: " + memberName + ", Club Name: " + clubName);
    }

    public static void main(String[] args) {
        
        Club member1 = new Club("Ananya");
        Club member2 = new Club("Shreya");
        Club member3 = new Club("Khushi");

        Club.displayClubName();

        member1.displayMemberInfo();
        member2.displayMemberInfo();
        member3.displayMemberInfo();
    }
}
