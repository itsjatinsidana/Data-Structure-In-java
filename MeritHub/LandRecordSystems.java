package MeritHub;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    String name;
    String fatherName;
    String motherName;
    int land;

    public Person(String name, String fatherName, String motherName, int land) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.land = land;
    }
}

public class LandRecordSystems {
    private Map<String, Person> people = new HashMap<>();

    public void addStatement(String statement) {
        String[] parts = statement.split("S/o|W/o|and|has purchased");
        String personName = parts[0].trim();
        String fatherOrMotherName = parts[1].trim();
        int land = Integer.parseInt(parts[2].trim());

        people.put(personName, new Person(personName, fatherOrMotherName, "", land));
    }

    public List<String> query(String query) {
        List<String> result = new ArrayList<>();

        if (query.startsWith("Select * from LR name =")) {
            String nameToQuery = query.split("=")[1].trim();
            for (Person person : people.values()) {
                if (person.name.contains(nameToQuery)) {
                    result.add(person.name);
                }
            }
        } else if (query.startsWith("Select * from LR where FamilyTree=")) {
            String familyTreeToQuery = query.split("=")[1].trim();
            for (Person person : people.values()) {
                if (isFamilyTree(person, familyTreeToQuery)) {
                    result.add(person.name);
                }
            }
        } else if (query.startsWith("Sum(Land) from LR where name =")) {
            String nameToQuery = query.split("=")[1].trim();
            int sumLand = 0;
            for (Person person : people.values()) {
                if (person.name.contains(nameToQuery)) {
                    sumLand += person.land;
                }
            }
            result.add(Integer.toString(sumLand));
        }

        return result;
    }

    private boolean isFamilyTree(Person person, String targetName) {
        if (person.name.contains(targetName)) {
            return true;
        } else {
            return isDescendantOf(person, targetName);
        }
    }

    private boolean isDescendantOf(Person person, String targetName) {
        if (person.fatherName != null && person.fatherName.contains(targetName)) {
            return true;
        }
        if (person.motherName != null && person.motherName.contains(targetName)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LandRecordSystems landRecordSystem = new LandRecordSystems();

        // Add statements to the system.
        landRecordSystem.addStatement("Mr. Arun Kumar S/o Mr. Suraj Kumar has purchased 10 acres of land.");
        landRecordSystem.addStatement("Mr. Amit Kumar S/o Mr. Arun Kumar has purchased 15 acres of land.");
        // Add more statements here.

        // Perform queries and display results.
        List<String> results = landRecordSystem.query("Select * from LR name = 'Arun Kumar'");
        System.out.println("Results for Select * from LR name = 'Arun Kumar': " + results);

        results = landRecordSystem.query("Sum(Land) from LR where name = 'Anjali Devi'");
        System.out.println("Result for Sum(Land) from LR where name = 'Anjali Devi': " + results);

        results = landRecordSystem.query("Select * from LR where FamilyTree= 'Amit Kumar'");
        System.out.println("Results for Select * from LR where FamilyTree= 'Amit Kumar': " + results);

        results = landRecordSystem.query("Sum(Land) from LR where FamilyTree= 'Suraj Kumar'");
        System.out.println("Result for Sum(Land) from LR where FamilyTree= 'Suraj Kumar': " + results);
    }
}

