package day12;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;
    private List<Integer> listTestScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        setTestScores(testScores);
    }

    public String calculate() {
        int cal = listTestScores.stream().reduce(0, (sub, ele) -> sub + ele) / listTestScores.size();
        if (cal >= 90 && cal <= 100) {
            return "O";
        } else if (cal >= 80 && cal < 90) {
            return "E";
        } else if (cal >= 70 && cal < 80) {
            return "A";
        } else if (cal >= 55 && cal < 70) {
            return "P";
        } else if (cal >= 40 && cal < 55) {
            return "D";
        } else {
            return "T";
        }
    }

    private void setTestScores(int[] testScores) {
        listTestScores = new ArrayList<>();
        for (int i: testScores) {
            listTestScores.add(i);
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int id = 0;
        int numScores = 0;
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
