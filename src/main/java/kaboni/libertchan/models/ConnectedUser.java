package kaboni.libertchan.models;

import java.util.List;

import javax.persistence.*;

@Entity
public class ConnectedUser {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "mail")
	private String email;
	
	@Column
	private Integer karma;
	
	@Column
	private String mainPseudo;
	
	@Column
	private String password;
	
	@Column
	private Integer accessLevel;
	
	@Column
	private String ip;
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@OneToMany
	@JoinColumn(name = "connected_user_id")
	private List<Message> messages;
	
	@ManyToOne
	private Role role;

	public ConnectedUser(String mainPseudo, String password, String email, Role admin) {
		this.mainPseudo = mainPseudo;
		this.password = password;
		this.email = email;
		this.role = admin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getKarma() {
		return karma;
	}

	public void setKarma(Integer karma) {
		this.karma = karma;
	}

	public String getMainPseudo() {
		return mainPseudo;
	}

	public void setMainPseudo(String mainPseudo) {
		this.mainPseudo = mainPseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(Integer accessLevel) {
		this.accessLevel = accessLevel;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	public ConnectedUser() {
	
	}
	
	

}
