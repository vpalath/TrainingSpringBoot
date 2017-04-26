package com.bioauth.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import com.bioauth.domain.PoliticalParties;
import com.bioauth.domain.Users;
import com.bioauth.domain.VoteDetails;

@SpringBootApplication(scanBasePackages={"com.bioauth.*"})
@EntityScan(basePackageClasses={PoliticalParties.class,Users.class,VoteDetails.class})
public class BioAuthServApplication implements CommandLineRunner{
	
	@Autowired
	ApplicationContext appContext;

	public static void main(String[] args) {
		 SpringApplication.run(BioAuthServApplication.class, args);
		
		
		/*ObjectMapper mapper = new ObjectMapper();
		Users user = new Users();
		
		try {
			mapper.writeValue(System.out, user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
				
	}

	@Override
	public void run(String... arg0) throws Exception {
		UserService service=appContext.getBean(UserService.class);
		service.getUser(2);
		
	}
}
