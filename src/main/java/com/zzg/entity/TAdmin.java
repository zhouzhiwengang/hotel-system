package com.zzg.entity;

import com.zzg.common.BaseModel;

public class TAdmin extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5836562752706040434L;

	private Integer sid;

    private String name;

    private String password;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}