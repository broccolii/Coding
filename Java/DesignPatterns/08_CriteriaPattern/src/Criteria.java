import java.util.List;

/**
 * Created by Broccoli on 2017/9/20.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
