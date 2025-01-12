package jobportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JobPortalApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
	}
 //chmod +x ./mvnw && ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean dependency:list install
}
