package ty.springboot.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ty.springboot.mybatis.domain.City;
import ty.springboot.mybatis.domain.CityMapper;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private CityMapper cityMapper;

	@Test
	public void findCityByState() {
		City city = cityMapper.findState("CA");
		assertNotNull(city);
	}
	@Test
	public void findCity() {
		List<City> city = cityMapper.findAllCity();
		assertNotNull(city);
	}

}
