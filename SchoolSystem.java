import java.util.ArrayList;
import java.util.List;

class SchoolSystem {
    private List<Person> people;

    public SchoolSystem() {
        people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
        System.out.println(p.getRole() + " added successfully " + p.getName());
    }


    public Person getById(String id) {
        for(Person p : people) {
            if (p.getId().equalsIgnoreCase(id)) {
                return(p);
            }
        }

        return null;
    }

    public boolean removeById(String id) {
        Person p = getById(id);
        if (p != null) {
            people.remove(p);
            return true;
        }

        return false;
    }

    public void displayAll() {
        if (people.isEmpty()) {
            System.out.println("Not Available");
            return;
        }

        else {
            for(Person p : people) {
                p.displayInfo();
            }
        }
    }

    public List<Person> getPeople() {
        return people;
    }
}