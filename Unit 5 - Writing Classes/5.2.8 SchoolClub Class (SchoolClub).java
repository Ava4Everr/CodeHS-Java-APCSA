public class SchoolClub
{

    private Student leader;
    private String name;
    private int numMembers;

    /* Add your constructor here
     * Constructor should take a leader and club name, then set
     * numMembers to 0.
     */
    
    public SchoolClub(Student theLeader, String theName){
        leader = theLeader;
        name = theName;
        numMembers = 0;
    }

    public void addMember() {
        numMembers ++;
    }

    public String toString(){
        return leader.getFirstName() + " is the leader of the " + name + " club.";
    }
}