package com.zzg.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zzg.common.BaseModel;

public class TConsume extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4418064776906436538L;

	private Integer sid;

    private BigDecimal money;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date consumeDate;

    private Integer cardSid;

    private Integer terminalSid;

    private String state;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    public Integer getCardSid() {
        return cardSid;
    }

    public void setCardSid(Integer cardSid) {
        this.cardSid = cardSid;
    }

    public Integer getTerminalSid() {
        return terminalSid;
    }

    public void setTerminalSid(Integer terminalSid) {
        this.terminalSid = terminalSid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}