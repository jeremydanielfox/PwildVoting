package backend;

import java.util.List;

public interface SelectionScenario {

	public void addCandidate(Candidate candidate);

	public List<Pair> getRemainingPairs();

	public void removePair(Pair pair);

	public boolean pairIsSelected();

}
