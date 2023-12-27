package com.example.glovis.adapter.persistence.user;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="user")
public class UserEntity { //implements UserDetails {

	@Id
	@GeneratedValue(generator = "custom-id")
	@GenericGenerator(name = "custom-id", strategy = "com.example.glovis.common.generator.IdGenerator")
	private Long id;

	@Column(nullable = false, unique = true, length = 30)
	private String userId;
	@Column(nullable = false, length = 100)
	private String password;
	@Column(nullable = false, length = 100)
	private String userName;
	@Column(length = 100)
	private String email;


//	@ElementCollection(fetch = FetchType.EAGER)
//	@Builder.Default
//	private List<String> roles = new ArrayList<>(); // 회원이 가지고 있는 권한 정보들
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return this.roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
//	}
//
//	@Override
//	public String getUsername() {
//		return this.userId;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
	
	
	
	

}
