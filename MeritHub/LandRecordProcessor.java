package MeritHub;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LandRecord {
    String name;
    String parent;
    String spouse;
    int land;

    public LandRecord(String name, String parent, String spouse, int land) {
        this.name = name;
        this.parent = parent;
        this.spouse = spouse;
        this.land = land;
    }
}

public class LandRecordProcessor {

    private List<LandRecord> landRecords;

    public LandRecordProcessor() {
        landRecords = new ArrayList<>();
    }

    public void addRecord(LandRecord record) {
        landRecords.add(record);
    }

    public int selectLandByName(String name) {
        int totalLand = 0;
        for (LandRecord record : landRecords) {
            if (record.name.equals(name)) {
                totalLand += record.land;
            }
        }
        return totalLand;
    }

    public int selectLandSumByFamilyTree(String treeName) {
        List<String> familyMembers = new ArrayList<>();
        familyMembers.add(treeName);

        for (LandRecord record : landRecords) {
            if (record.parent != null && familyMembers.contains(record.parent)) {
                familyMembers.add(record.name);
            }
            if (record.spouse != null && familyMembers.contains(record.spouse)) {
                familyMembers.add(record.name);
            }
        }

        int totalLand = 0;
        for (LandRecord record : landRecords) {
            if (familyMembers.contains(record.name)) {
                totalLand += record.land;
            }
        }

        return totalLand;
    }

    public static void main(String[] args) {
        LandRecordProcessor processor = new LandRecordProcessor();

        // Add land records
        processor.addRecord(new LandRecord("Arun Kumar", "Suraj Kumar", null, 10));
        processor.addRecord(new LandRecord("Amit Kumar", "Arun Kumar", null, 15));
        processor.addRecord(new LandRecord("Ram Kumar", "Arun Kumar", null, 20));
        processor.addRecord(new LandRecord("Anjal Devi", null, "Amit Kumar", 12));
        processor.addRecord(new LandRecord("Manish Kumar", "Amit Kumar", "Priya", 17));
        processor.addRecord(new LandRecord("Amit Kumar", "Arun Kumar", null, -10));
        processor.addRecord(new LandRecord("Priya", null, null, 0));  // Placeholder for spouse

        // Execute queries
        System.out.println("Total Land Owned by Arun Kumar: " + processor.selectLandByName("Arun Kumar"));
        System.out.println("Total Land Owned by the Amit Kumar Family: " + processor.selectLandSumByFamilyTree("Amit Kumar"));
    }
}


