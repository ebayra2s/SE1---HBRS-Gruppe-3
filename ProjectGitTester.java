
package se_01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectGitTester {

	Project simple_example, simple_cycle, complex_cycle, complex_graph;

	@Before
	public void setUp() {
		simple_example = new Project(new String[][] { { "A", "C" }, { "C", "D" }, { "B", "C" } });
		simple_cycle = new Project(new String[][] { { "A", "A" } });
		complex_cycle = new Project(new String[][] { { "A", "B" }, { "B", "A" } });
		
	}

	@Test
	public void test_simple_example_1() {
		assertTrue(simple_example.isWellSorted(new String[] { "A", "B", "C", "D" }));
	}

}
