import java.util.List;

/**
 * Created by Broccoli on 2017/9/20.
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = criteria.meetCriteria(persons);

        for (Person person : otherCriteriaPersons) {
            if (!firstCriteriaPersons.contains(person)) {
                firstCriteriaPersons.add(person);
            }
        }
        return firstCriteriaPersons;
    }
}
