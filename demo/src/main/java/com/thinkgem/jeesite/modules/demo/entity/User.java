package com.thinkgem.jeesite.modules.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(generator="idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "uuid")

    private String id;
	
    @Column(name="user_name", nullable = false, unique = true)
    private String userName;

    @Column(name="pass_word", nullable = false)

    private String passWord;

    @Column(name="email", nullable = false, unique = true)

    private String email;

    @Column(name="nick_name", nullable = true, unique = true)

    private String nickName;

    @Column(name="reg_time", nullable = false)

    private String regTime;
    
    public User(){
    	
    }

	public User(String userName, String email, String nickName, String passWord,
			String regTime) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.email = email;
		this.nickName = nickName;
		this.passWord = passWord;
		this.regTime = regTime;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	
	
}
