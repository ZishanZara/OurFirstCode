class MyProgram {

    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.doAdmission();
        admin.showInfoOfStudents();
    }

    private static class Admin {
        
        ClassRoom firstClass;

        Admin() {
            this.firstClass = new ClassRoom(2);
        }

        public void doAdmission() {
            firstClass.addNewStudent("Zishan", 1);
            firstClass.addNewStudent("Rohit", 2);
        }

        public void showInfoOfStudents() {
            firstClass.printNamesAndRollNumbers();
        }

    }

    private static class ClassRoom {

        private int totalStudent = 0;
        private Student[] students;

        ClassRoom(int size) {
            this.students = new Student[size];
        }

        public void addNewStudent(String name, int rollNumber) {
            this.students[totalStudent] = new Student(name, rollNumber);
            totalStudent++;
        }

        public void printNamesAndRollNumbers() {
            for (int i = 0; i < this.students.length; i++) {
                System.out.println(this.students[i].name + " " + this.students[i].rollNumber);
            }
        }
        
    }

    private static class Student {

        private String name;
        private int rollNumber;

        Student(String name_, int rollNumber_) {
            this.name = name_;
            this.rollNumber = rollNumber_;
        }

    }

}
