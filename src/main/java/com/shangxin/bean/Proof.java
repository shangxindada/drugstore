package com.shangxin.bean;

import java.util.Date;

public class Proof {
	private int proofId;
	private int proofe;
	private boolean isUse;
	private Date proofDate;
	private int proofLe;
	
	
	public int getProofId() {
		return proofId;
	}
	public void setProofId(int proofId) {
		this.proofId = proofId;
	}
	public boolean isUse() {
		return isUse;
	}
	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	public Date getProofDate() {
		return proofDate;
	}
	public void setProofDate(Date proofDate) {
		this.proofDate = proofDate;
	}
	public int getProofLe() {
		return proofLe;
	}
	public void setProofLe(int proofLe) {
		this.proofLe = proofLe;
	}
	public int getProofe() {
		return proofe;
	}
	public void setProofe(int proofe) {
		this.proofe = proofe;
	}
}
