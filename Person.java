import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person() {
        name = "usman";
        age = 21;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public class Gender extends Person {
        private String gender;
        private Boolean isMarried;

        public Gender() {
            gender = "male";
            isMarried = true;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

        public void setMaritalStatus(Boolean isMarried) {
            this.isMarried = isMarried;
        }

        public Boolean getMaritalStatus() {
            return isMarried;
        }
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Person person = new Person();
        Gender gen = person.new Gender();
        String name;
        String status = "";
        String nextLine = "";
        String isSingle = "";
        int age;
        String gender;
        Boolean isMarried = false;
        System.out.print("Enter your name : ");
        name = input.next();
        System.out.print("Enter your age : ");
        age = input.nextInt();
        System.out.print("What is your gender : ");
        gender = input.next();
        System.out.print("Are you married? (yes/no) : ");
        isSingle = input.next();

        // Updating values

        gen.setName(name);
        gen.setAge(age);
        gen.setMaritalStatus(isMarried);
        gen.setGender(gender);
        if (gen.getMaritalStatus() == true) {
            status = "got married";
            nextLine = "and enjoing a beautiful life";
        } else {
            status = "is single";
            nextLine = "and searching for love";
        }
        if (isSingle.equals("yes") || isSingle.equals("Yes") || isSingle.equals("YES")) {
            isMarried = true;
        } else if (isSingle.equals("no") || isSingle.equals("No") || isSingle.equals("NO")) {
            isMarried = false;
        }

        // Getting values

        System.out.println("There is a " + gen.getAge() + " year old person " + gen.getName() + " (" + gen.getGender()
                + ") lives in Pakistan " + status + " " + nextLine);
    }
}