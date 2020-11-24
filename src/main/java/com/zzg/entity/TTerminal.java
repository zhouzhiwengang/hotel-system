package com.zzg.entity;

import com.zzg.common.BaseModel;

public class TTerminal extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8248914524801004030L;

	private Integer sid;

    private String name;

    private Integer adminSid;

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

    public Integer getAdminSid() {
        return adminSid;
    }

    public void setAdminSid(Integer adminSid) {
        this.adminSid = adminSid;
    }
}