import static org.junit.Assert.*;

import org.junit.Test;

public class ABBADiv1Test {

	@Test
	public void testCanObtain() {
		ABBADiv1 ab = new ABBADiv1();
		
		assertEquals(ab.canObtain("A", "BABA"), "Possible");
		assertEquals(ab.canObtain("BAAAAABAA", "BAABAAAAAB"), "Possible");
		assertEquals(ab.canObtain("A", "ABBA"), "Impossible");
		assertEquals(ab.canObtain("AAABBAABB", "BAABAAABAABAABBBAAAAAABBAABBBBBBBABB"), "Possible");
		assertEquals(ab.canObtain("AAABAAABB", "BAABAAABAABAABBBAAAAAABBAABBBBBBBABB"), "Impossible");
	}

}
