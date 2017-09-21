/**
 * Created by Broccoli on 2017/9/20.
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStauts;

    public Person(String name, String gender, String maritalStauts) {
        this.name = name;
        this.gender = gender;
        this.maritalStauts = maritalStauts;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStauts() {
        return maritalStauts;
    }
}
