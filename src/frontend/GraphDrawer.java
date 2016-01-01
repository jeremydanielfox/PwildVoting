package frontend;

import java.util.List;
import java.util.Map;

import javafx.scene.Scene;
import backend.Pair;

public interface GraphDrawer {

	public Scene drawGraph(int width, int length,
			List<Map<Pair, Integer>> ranking);
}
