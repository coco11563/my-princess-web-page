package sha0w.pub.myprincesswebpage.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "sha0w.pub.myprincesswebpage.mvc")
public class MyPrincessWebPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPrincessWebPageApplication.class, args);
	}
}
