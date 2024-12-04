
import java.util.Comparator;


// To sort visitor by name and then by age
public class VisitorSort implements Comparator<Visitor> {
    @Override
    public int compare (Visitor v1, Visitor v2) {
        int nameComparison = v1.getName().compareTo(v2.getName());      // Compare names
        if (nameComparison == 0) {
            return Integer.compare(v1.getAge(), v2.getAge());           // Compare Age
        }
        return nameComparison;
    }
}

