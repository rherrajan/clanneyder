package ${package};

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;

public class DBExampleTest {

	private DataSource dataSource;

	@Before
	public void provideDatabase() throws Exception {
		DBProvider dbProvider = new DBProvider();
		dbProvider.dbUrl = System.getenv("JDBC_DATABASE_URL");
		this.dataSource = dbProvider.dataSource();
	}
	
	@Test
	public void shouldReturnSomething() throws Exception {
		DBExample dBExample = new DBExample();
		dBExample.dataSource = dataSource;
		
		Object response = dBExample.getDbexample();
		assertThat(response, is(notNullValue()));
	}

}
