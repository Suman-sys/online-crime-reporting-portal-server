package tda.darkarmy.onlinecrimereportingportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


import tda.darkarmy.onlinecrimereportingportal.model.Role;
import tda.darkarmy.onlinecrimereportingportal.model.Roles;
import tda.darkarmy.onlinecrimereportingportal.repository.RolesRepository;

@SpringBootApplication
public class OnlineCrimeReportingPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCrimeReportingPortalApplication.class, args);
	}

	private RolesRepository rolesRepository;

	public OnlineCrimeReportingPortalApplication(RolesRepository rolesRepository) {
		this.rolesRepository = rolesRepository;
	}


	@EventListener(ApplicationReadyEvent.class)
	public void initializeRoles() {
		if(rolesRepository.findByRoleName(Role.USER)==null)
			rolesRepository.save(new Roles(Role.USER));
		if(rolesRepository.findByRoleName(Role.COP)==null)
			rolesRepository.save(new Roles(Role.COP));
		if(rolesRepository.findByRoleName(Role.POLICE_STATION)==null)
			rolesRepository.save(new Roles(Role.POLICE_STATION));
		
	}
}
