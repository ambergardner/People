import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PeopleProcessor p1 = new PeopleProcessor();
        p1.readFileLoadMap();
        p1.updateHashMap();
        p1.sortList();
        p1.displayPeople();
        p1.writeJson();
    }


}