package skilltracker.fse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SkillsTrackerApp {
	public static void main(String[] args) {
		SpringApplication.run(SkillsTrackerApp.class, args);
	}
}