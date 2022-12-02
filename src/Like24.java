import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Like24 {
    public class Consecutives {

        public static List<Integer> sumConsecutives(List<Integer> s) {
            List<Integer> result = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < s.size(); i++) {
                count += s.get(i).intValue();
                if (i==s.size()-1){
                    result.add(count);
                    return result;
                }
                if (s.get(i)!=s.get(i+1)){
                    result.add(count);
                    count = 0;
                }
            }
            return result;
        }
    }
}
