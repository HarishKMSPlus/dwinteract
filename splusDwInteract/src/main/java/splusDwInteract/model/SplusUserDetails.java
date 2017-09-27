package splusDwInteract.model;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SplusUserDetails extends Users implements UserDetails {

	
	
	
	public SplusUserDetails(final Users users) {
		super(users);
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<SimpleGrantedAuthority> listRoles=getRoles()
												.stream()
												.map(role-> new SimpleGrantedAuthority("ROLE_"+role.getRole()))
												.collect(Collectors.toList());
		
		return listRoles;
	}

	public String getPassword() {
		
		return super.getPassword();
	}

	public String getUsername() {
		
		return super.getName();
	}

	public boolean isAccountNonExpired() {
		
		return true;
	}

	public boolean isAccountNonLocked() {
		
		return true;
	}

	public boolean isCredentialsNonExpired() {
	
		return true;
	}

	public boolean isEnabled() {
		
		return true;
	}

}
