package graphs;

import java.util.Collection;

public interface DirectedGraph<T> {

	public void addNode(T node);

	public void removeNode(T node);

	public void addEdge(T first, T second);

	public void removeEdge(T first, T second);

	public Collection<T> getNodes();

	public boolean containsNode(T node);

	public boolean containsEdge(T first, T second);

	public Collection<T> getNeighbors(T node);

	public DirectedGraph<T> topoSorted();

	public DirectedGraph<T> copy();
}
