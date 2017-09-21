import java.util.ArrayList;
import java.util.List;

/**
 * Created by Broccoli on 2017/9/20.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getMaritalStauts().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
