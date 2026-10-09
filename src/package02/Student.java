package package02;

public class Student {
        public String name;
        private int age;
        public Student(String name, int age){
            this.name=name;
            this.age=age;
        }

        public int getAge() {
            return age;
        }
        public void bunk(){
            System.out.println("students are bunking");
        }

        private void run(){
            System.out.println("students running");
        }



        public void getRun(){
            run();
        }
}
