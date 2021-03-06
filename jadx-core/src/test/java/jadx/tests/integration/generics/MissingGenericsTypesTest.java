package jadx.tests.integration.generics;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.junit.jupiter.api.Test;

import jadx.NotYetImplemented;
import jadx.core.dex.nodes.ClassNode;
import jadx.tests.api.SmaliTest;

public class MissingGenericsTypesTest extends SmaliTest {

	/*
		private int x;

		public void test() {
			Map<String, String> map = new HashMap();
			x = 1;
			for (String s : map.keySet()) {
				System.out.println(s);
			}
		}
	*/

	@Test
	@NotYetImplemented
	public void test() {
		ClassNode cls = getClassNodeFromSmaliWithPath("generics", "MissingGenericsTypesTest");
		String code = cls.getCode().toString();

		assertThat(code, containsString("Map<String"));
	}
}
