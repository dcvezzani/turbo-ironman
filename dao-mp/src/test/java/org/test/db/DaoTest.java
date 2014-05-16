package org.test.db;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/**
 * The Class DaoTest.
 *
 * <p>Quick and easy way to test that Maven sub-modules
 * can depend on one another and not install any project JAR files
 * to the local repository
 */
public class DaoTest {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Dao dao = new Dao();
		try {
			String actual = dao.getUtil().getBlah();
			assertEquals("bleh", actual);

			String userHome = System.getProperty("user.home");
			File f = new File(userHome + "/.m2/repository/org/test");
			boolean localArtifactWasInstalled = (f.isDirectory());
			assertFalse("Articles for the org.test namespace shouldn't have been installed", localArtifactWasInstalled);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exception should not have been thrown");
		}
	}

}
