package constructorsUsingSuperandThis;

public class Student extends Person {

        //1. Let's create private fields
        private int age;
        private String studentNr;

        //4. Now after creating the getters and setters, let's create 2 constructors, one without parameters, and another with parameters

        public Student(String name, int age){
            super(name);
            this.age = age;
        }

        public Student(String name, int age, String studentNr){
            super(name);
            this.age = age;
            this.studentNr = studentNr;
        }

        //2. Let's create the getter for age
        public int getAge() {
            return age;
        }

        //3. Let's create the setter for age
        public void setAge(int age) {
            this.age = age;
        }
        public String getStudentNr() {
        return studentNr;
        }
        public void setStudentNr(String studentNr) {
        this.studentNr = studentNr;
    }


}
