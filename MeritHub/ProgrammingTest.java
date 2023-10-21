package MeritHub;

// NAME = JATIN SIDANA
// UNIVERSITY = GURU NANAK DEV UNIVERSITY
// CLASS = MCA
// PHONE NO. = 9876271597
//GMAIL = JATINSADANA1998@GMAIL.COM

public class ProgrammingTest {
    public static void main(String[] args) {
        String statements[] = {
            "Mr. Arun Kumar S/o Mr. Suraj Kumar has purchased 10 acres of land.Mr. Arun Kumar S/o Mr. Suraj Kumar has purchased 10 acres of land.",
            "Mr. Amit Kumar S/o Mr. Arun kumar has purchased 15 acres of land.",
            "Mr. Ram Kumar S/o Mr. Arun kumar and Mr. Amit Kumar S/o Mr. Arun kumar have purchased 20 acres of land.",
            "Mrs. Anjali Devi W/o  Mr. Amit Kumar has purchased 12 acres of land.",
            "Mr. Manish Kumar S/o Mrs.  Anjali Devi  has purchased 17 acres of land.",
            "Mr. Amit Kumar S/o Mr. Arun kumar has sold 10 acres of land.",
            "Mr. Manish Kumar S/o Mr. Amit Kumar and Ms. Priya D/o Mrs.  Anjali Devi  have purchased 20 acres of land.",
            "Mr. Ram Kumar S/o Mr. Arun kumar and Mr. Amit Kumar S/o Mr. Arun kumar have sold 10 acres of land."
        };

        String nameForFirstQuery = "Amit Kumar";
        String nameForSecondQuery = "Anjali";
        String nameForThirdQuery = "Manish Kumar";

        System.out.println("----------First Query Answer----------");
        String nam[] = nameForFirstQuery.split(" ");
        nameForFirstQuery = nam[0];

        for (String statement : statements) {
            if (statement.contains(nameForFirstQuery)) {
                String a[] = statement.split(" ");
                if (a[1].equals(nameForFirstQuery) || a[9].equals(nameForFirstQuery)) {
                    System.out.println(statement);
                }
            }
        }
        

        System.out.println("-----------Second Query Answer-----------");
        String ans = "";

        for (String statement : statements) {
            if (statement.contains(nameForSecondQuery)) {
                if (statement.indexOf(nameForSecondQuery) == 4 || statement.indexOf(nameForSecondQuery) == 5) {
                    ans = ans + statement + ";";
                }
            }
        }

        System.out.println(ans);
        int sum = sumOfLandIndividual(ans);
        System.out.println("land owened by Anjali Devi " + sum);
    
        System.out.println("------Third query answer-------");
        String nam2[] = nameForThirdQuery.split(" ");
        nameForThirdQuery = nam2[0];

        for (String statement : statements) {
            if (statement.contains(nameForThirdQuery)) {
                System.out.println(statement);
            }
        }
       
    }

    static int sumOfLandIndividual(String ans) {
        String[] statements = ans.split(";");
        int sum = 0;

        for (String statement : statements) {
            char a[] = statement.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : a) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }
            String num = sb.toString();
            int number = Integer.parseInt(num);
            sum += number;
        }

        return sum;
    }
}

