package MeritHub;

import java.util.*;
import java.util.stream.Collectors;

class LandRecord {
    private String name;
    private String fatherName;
    private String spouseName;
    private int land;

    public LandRecord(String name, String fatherName, String spouseName, int land) {
        this.name = name;
        this.fatherName = fatherName;
        this.spouseName = spouseName;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public int getLand() {
        return land;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LandRecord> landRecords = new ArrayList<>();

        // Parse the statements and store them in the data structure
        String[] statements = {
            "Mr. Arun Kumar S/o Mr. Suraj Kumar has purchased 10 acres of land.",
            "Mr. Amit Kumar S/o Mr. Arun Kumar has purchased 15 acres of land.",
            "Mr. Ram Kumar S/o Mr. Arun Kumar and Mr. Amit Kumar S/o Mr. Arun Kumar have purchased 20 acres of land.",
            "Mrs. Anjali Devi W/o Mr. Amit Kumar has purchased 12 acres of land.",
            "Mr. Manish Kumar S/o Mrs. Anjali Devi has purchased 17 acres of land.",
            "Mr. Amit Kumar S/o Mr. Amit Kumar and Ms. Priya D/o Mrs. Anjali Devi have purchased 20 acres of land.",
            "Mr. Manish Kumar S/o Mr. Amit Kumar and Ms. Priya D/o Mrs. Anjali Devi have purchased 20 acres of land.",
            "Mr. Ram Kumar S/o Arun Kumar and Mr. Amit Kumar S/o Mr. Arun Kumar have sold 10 acres of land."
        };

        for (String statement : statements) {
            String[] parts = statement.split(" ");
            int land = 0;

            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equals("acres")) {
                    land = Integer.parseInt(parts[i - 1]);
                    break;
                }
            }

            String name = parts[1] + " " + parts[2];
            String fatherName = "N/A";
            String spouseName = "N/A";

            for (int i = 3; i < parts.length; i++) {
                if (parts[i].equals("S/o")) {
                    fatherName = parts[i + 1];
                } else if (parts[i].equals("W/o")) {
                    spouseName = parts[i + 1];
                }
            }

            landRecords.add(new LandRecord(name, fatherName, spouseName, land));
        }

        // Handle user input for queries
        System.out.println("Enter your query (e.g., 'Select * from LR where name = 'Arun Kumar'): ");
        String query = scanner.nextLine();

        // Process the query
        if (query.contains("name = ")) {
            String nameToSearch = query.substring(query.indexOf("'") + 1, query.lastIndexOf("'"));
            int totalLand = 0;

            for (LandRecord record : landRecords) {
                if (record.getName().equals(nameToSearch)) {
                    System.out.println(record.getName() + ", Father: " + record.getFatherName());
                }
            }
        }
    }
}