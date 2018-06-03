import static org.junit.Assert.*;

import org.junit.Test;

import extra.Vault;

public class vaulttest {

	@Test
	public void test() {
		Vault object = new Vault();
		JamesBond code = new JamesBond();
		
		assertEquals(true, object.tryCode(12345));
		assertEquals(false,object.tryCode(233425));
		assertEquals(12345,code.findCode(object));
	}

}
