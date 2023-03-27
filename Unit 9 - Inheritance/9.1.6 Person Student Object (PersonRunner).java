public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person person1 = new Person("Wolfgang Amadeus Mozart", "January 27, 1756");
        Student student1 = new Student("Johann Nepomuk Hummel", "November 14, 1778", 10, 4.0);
        System.out.println(person1.getName());
        System.out.println(student1.getName());
        System.out.println(person1.getBirthday());
        System.out.println(student1.getBirthday());
        System.out.println(student1.getGrade());
        System.out.println(student1.getGpa());
    }
}
