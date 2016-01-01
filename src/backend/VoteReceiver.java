package backend;

import java.util.List;
import java.util.Map;

public interface VoteReceiver {

	public void receiveVote(List<Map<Pair,Integer>> voteMatrix);
}
