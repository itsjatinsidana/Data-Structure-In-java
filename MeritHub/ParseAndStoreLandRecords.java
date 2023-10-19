package MeritHub;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LandRecord {
    String name;
    String father;
    int land;

    public LandRecord(String name, String father, int land) {
        this.name = name;
        this.father = father;
        this.land = land;
    }
}

public class ParseAndStoreLandRecords {
    public static void main(String[] args) {
        String[] statements = {
                "Mr. Arun Kumar S/o Mr. Suraj Kumar has purchased 10 acres of land.",
                "Mr. Amit Kumar S/o Mr. Arun Kumar has purchased 15 acres of land.",
                "Mr. Ram Kumar S/o Mr. Arun Kumar and Mr. Amit Kumar S/o Mr. Arun Kumar have purchased 20 acres of land.",
                "Mrs. Anjali Devi W/o Mr. Amit Kumar has purchased 12 acres of land.",
                "Mr. Manish Kumar S/o Mrs. Anjali Devi has purchased 17 acres of land.",
                "Mr. Amit Kumar S/o Mr. Arun Kumar has sold 10 acres of land.",
                "Mr. Manish Kumar S/o Mr. Amit Kumar and Ms. Priya D/o Mrs. Anjali Devi have purchased 20 acres of land.",
                "Mr. Ram Kumar S/o Mr. Arun Kumar and Mr. Amit Kumar S/o Mr. Arun Kumar have sold 10 acres of land."
        };

        List<LandRecord> landRecords = new ArrayList<>();

        // Regular expression pattern to match and extract relevant information
        Pattern pattern = Pattern.compile(
                "(Mr\\.\\s|Mrs\\.\\s)([A-Za-z ]+)\\s(?:S/o\\s)?([A-Za-z ]+)?\\s(has\\spurchased|has\\ssold)\\s(\\d+)\\sacres\\sof\\sland\\.");

        for (String statement : statements) {
            Matcher matcher = pattern.matcher(statement);

            if (matcher.find()) {
                String name = matcher.group(2);
                String father = matcher.group(3);
                String transactionType = matcher.group(4);
                int land = Integer.parseInt(matcher.group(5));

                if (transactionType.equals("has sold")) {
                    land = -land; // Convert sold land to a negative value

                }

                landRecords.add(new LandRecord(name, father, land));
            }
        }

        // Print the parsed land records
        for (LandRecord record : landRecords) {
            System.out.println(
                    "Name :" + record.name + " ,Father : " + record.father + ",Land : " + record.land + "acres");
        }
    }
}
