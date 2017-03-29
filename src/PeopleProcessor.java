import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Collections;

public class PeopleProcessor {
    ArrayList<Person> people = new ArrayList<>();
    HashMap<String, ArrayList<Person>> countrypeople = new HashMap<>();

    public void readFileLoadMap() throws IOException {

        File f = new File("people.csv");
        Scanner fileScanner = new Scanner(f);

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Person person = new Person(columns[0], columns[1], columns[2], columns[3], columns[4], columns[5]);
            people.add(person);
        }
    }

    public void updateHashMap() {
        for (Person person : people) {
            String country = person.country;
            ArrayList<Person> orginCountry = countrypeople.get(country);

            if (orginCountry == null) {
                orginCountry = new ArrayList<>();
            }
            orginCountry.add(person);
            countrypeople.put(country, orginCountry);
        }
    }

    public void sortList() {
        for (ArrayList<Person> people : countrypeople.values()) {
            Collections.sort(people);
        }

    }
    public void displayPeople() {
        for (Map.Entry entry:countrypeople.entrySet()) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
public void writeJson () throws IOException {
    File countryList = new File("people.json");

    JsonSerializer serializer = new JsonSerializer();
    String json = serializer.deep(true).serialize(countrypeople);
    FileWriter fw = new FileWriter(countryList);
    fw.write(json);
    fw.close();
}

}

