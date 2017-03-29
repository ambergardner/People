
public class Person implements Comparable{


    String id;
    String first_name;
    String last_name;
    String email;
    String country;
    String ip_address;
    String details;


    public Person(String id, String first_name, String last_name, String email, String country, String ip_address) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
        this.details = first_name + "" + last_name + "" + country;
    }

    public Person(Integer id, String last_name) {
    }

    public Person(String column) {

    }
    @Override
    public String toString() {
        return String.format("%s %s is from %s", first_name, last_name, country);
    }

    @Override
    public int compareTo(Object o) {
        Person otherPerson = (Person) o;
        return last_name.compareTo(otherPerson.last_name);
    }
}

