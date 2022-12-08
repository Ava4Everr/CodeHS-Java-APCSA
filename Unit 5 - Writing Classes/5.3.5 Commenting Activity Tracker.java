public class ActivityTracker
{
    public static void main(String[] args)
    {
        //creates the object used throughout the code
        ActivityLog mylog = new ActivityLog();
        //adds the amount of miles ran and the amount of time it took
        mylog.addMiles(5);
        mylog.addHours(1);
        //prints out the total amount of hours logged
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        //creates a variable for the hours logged today
        double hoursToday = mylog.getHours();
        //adds hour to the activity log
        mylog.addHours(1.5);
        mylog.addHours(3);
        /*creates a variable that calculates the amount of
        increase in activity */
        double increase = mylog.getHours() - hoursToday;
        //print statment for the increase amount of hours
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
