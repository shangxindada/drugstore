package com.shangxin.controller;

import java.util.List;

import com.shangxin.bean.Proof;

public interface proofDao {
	public Proof selectByProof(String proof);
	public void updateIfUse(Integer proofId);
	public int insertProof(Proof proof);
	public int deleteProof(Integer proofId);
	public List<Proof> selectAllproof();
}
