
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
        this.details = first_name + " " + last_name + " " + country;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

