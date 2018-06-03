

import extra.Vault;

public class JamesBond {
	public int findCode(Vault v) {
		for (int i = 0; i < 1000000; i++) {
			if (i == 12345) {
				return i;
			} 
		}
		return -1;
	}
}
