package org.test.db;

import org.test.common.Util;

public class Dao {
	private Util util;

	public Dao(){
		this.util = new Util("bleh");
	}

	public Util getUtil() {
		return util;
	}
}
