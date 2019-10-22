public class Student {

    // data - properties
    private String name = "";
    private int gradeLevel = 9;

    private String mathScore;
    private String englishScore;
    private String csScore;

    // contsructor
    public Student(String name, int gradeLevel, String mathScore, String englishScore, String csScore) {
        this.name = name;
        this.gradeLevel = gradeLevel;

        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.csScore = csScore;
        // ? :/... :)
    }


    // functions - abilities

    // getters and setters
    public String getName() {
        return this.name;
    }

    public int getGradeLevel() {
        return this.gradeLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        }
    }
    
    // calculate gpa
    public double calculateGPA() {
        double gpa = 0;
        System.out.println("Calculating GPA...");
        int mathGrade = gradeValue(mathScore);
        int englishGrade = gradeValue(englishScore);
        int csGrade = gradeValue(csScore);
        gpa = mathGrade + englishGrade + csGrade;
        gpa = gpa / 3;
        return gpa;
    }
    private int gradeValue(String grade) {
        if (grade.equals("F")) return 0;
        if (grade.equals("D")) return 1;
        if (grade.equals("C")) return 2;
        if (grade.equals("B")) return 3;
        if (grade.equals("A")) return 4;
        return 0;
    }

}