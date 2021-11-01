package Database;



public class Student {
    public enum Gender {
        MALE,FEMALE
    }
    
    private String name;
    private Gender sex;
    private int age;
    private String religion;

    public Student(String name, Gender sex, int age, String religion) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.religion = religion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "Database.Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", religion='" + religion + '\'' +
                '}';
    }
}
