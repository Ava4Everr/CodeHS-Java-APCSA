import java.util.ArrayList;
import java.util.List;

public class DataPurge {

    public static void removeDuplicates(List<String> people) {
        // Create a new list to store the unique names
        List<String> uniqueNames = new ArrayList<>();
        // Iterate through the input list
        for (String name : people) {
            // If the name is not already in the unique names list, add it
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            } else {
                // Otherwise, print the duplicate name to the console
                System.out.println("Removed duplicate: " + name);
            }
        }
        // Replace the original list with the unique names list
        people.clear();
        people.addAll(uniqueNames);
    }

    public static void removeName(List<String> people, String search) {
        // Create a new list to store the names that do not contain the search string
        List<String> filteredNames = new ArrayList<>();
        // Iterate through the input list
        for (String name : people) {
            // If the name does not contain the search string, add it to the filtered names list
            if (!name.contains(search)) {
                filteredNames.add(name);
            } else {
                // Otherwise, print the removed name to the console
                System.out.println("Removed name: " + name);
            }
        }
        // Replace the original list with the filtered names list
        people.clear();
        people.addAll(filteredNames);
    }

    public static boolean correctlyFormatted(List<String> people) {
        // Iterate through the input list
        for (String name : people) {
            // Split the name into first and last name
            String[] parts = name.split(" ");
            if (parts.length != 2) {
                // If the name is not correctly formatted (does not have exactly one space), return false
                return false;
            }
            String firstName = parts[0];
            String lastName = parts[1];
            // Check if the first letter of the first and last name is uppercase
            if (!Character.isUpperCase(firstName.charAt(0)) || !Character.isUpperCase(lastName.charAt(0))) {
                return false;
            }
        }
        // If all names are correctly formatted, return true
        return true;
    }
}