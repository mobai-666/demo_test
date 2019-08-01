package config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MyConfig {
	
	@Bean
	public A a() {
		A a=new A();
		a.setF1("val1");
		a.setF2("val2");
			
		
		return a();
		
	}

}
