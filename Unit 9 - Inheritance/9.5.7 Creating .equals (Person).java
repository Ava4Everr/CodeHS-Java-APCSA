public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getName(){
        return name;
    }

    //Create a equals method here
    public boolean equals(Person person)
    {
        if(getName().equals(person.getName()) && getBirthday().equals(person.getBirthday()))
        {
            return true;
        }
        return false;
    }
}
