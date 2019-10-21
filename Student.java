public class Student {

    // data - properties
    private String name = "";
    private int gradeLevel = 9;

    private String mathScore;
    private String englishScore;
    private String csScore;

    // contsructor
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;

        this.mathScore = "F";
        this.englishScore = "F";
        this.csScore = "F";
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
        int gpa = 0;
        System.out.println("Calculating GPA...");
        if (mathScore.equals("F")) gpa += 0;
        if (englishScore.equals("F")) gpa += 0;
        if (csScore.equals("F")) gpa += 0;
        gpa = gpa / 3;
        return gpa;
    }

}