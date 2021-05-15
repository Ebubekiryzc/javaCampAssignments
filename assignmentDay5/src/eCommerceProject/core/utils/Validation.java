package eCommerceProject.core.utils;

public class Validation {

	public static boolean checkRules(boolean... rules) {
		for (boolean rule : rules) {
			if (!rule) {
				return rule;
			} else {
				continue;
			}
		}
		return true;
	}

}
