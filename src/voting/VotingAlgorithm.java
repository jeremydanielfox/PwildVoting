package voting;

import java.util.List;
import java.util.Map;

public interface VotingAlgorithm<T> {

	public Map<T, Integer> rank(List<Map<T, Integer>> input);
}
