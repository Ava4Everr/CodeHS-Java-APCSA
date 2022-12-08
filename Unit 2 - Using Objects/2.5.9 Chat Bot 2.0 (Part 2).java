public class Bot2 {

    private String name;

    public Bot2 (String yourName){
        name = yourName;
    }

    // Prints a greeting
    public void greeting(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("! My name is UNIVAC!");
        System.out.println("Are you having fun programming today?");
    }

    // Prints the help menu
    public void help(){
        System.out.println("You can ask me about the first computer bug, or");
        System.out.println("which countries use the imperial measurement system.");
        System.out.println("I can even convert miles to kilometers!");
    }

    // Prints the origin of the first computer bug
    public void firstBug(){
        System.out.println("It's said that the first computer bug was found ");
        System.out.println("on September 9, 1945 by Harvard technicians who ");
        System.out.println("found a moth in their computer!");
    }

    // Prints a list of countries that use the imperial system
    public void imperialCountries() {
        System.out.print("There are 3 countries that use the imperial ");
        System.out.println("measurement system.");
        System.out.print("They are the United States of America, ");
        System.out.println("Liberia, and Myanmar");
    }

    // Prints a good-bye message
    public void goodbye(){
        System.out.println("It's always nice to chat!");
        System.out.println("Have a great day!");
    }

    // Prints my favorite number and how close my number is to yours
    public void favoriteNumber(int yourNumber){
        System.out.println("My favorite number is 3.");
        System.out.print("That is ");
        System.out.print(yourNumber - 3);
        System.out.println(" away from your number");
    }

    // Prints your and my favorite animal
    public void favoriteAnimal(String yourAnimal){
        System.out.print("Neat. I think ");
        System.out.print(yourAnimal);
        System.out.println("s are pretty cool, too.");
        System.out.println("My favorite animal is a turtle. Have you met Tracy?");
    }

    // Prints your and my destination vacation place
    public void destination(String place){
        System.out.print("I've heard ");
        System.out.print(place);
        System.out.println(" is a nice place to visit!");
        System.out.println("If I could go anywhere, I'd visit the mooon!");
    }
    
    // Converts miles to kilometers
    public double milesToKilometers(double miles){
        double kilometers = miles / 0.6214;
        return kilometers;
    }


}
