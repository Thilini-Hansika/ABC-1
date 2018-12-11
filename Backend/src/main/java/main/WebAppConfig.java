package main;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import repository.StudentRepo;

/**
 * Created by Thilini Hansika on 12/11/2018.
 */


@EnableWebMvc
@Configuration
//@ComponentScan("")
@EnableJpaRepositories(basePackageClasses = StudentRepo.class)
@EnableTransactionManagement
public class WebAppConfig {
}
