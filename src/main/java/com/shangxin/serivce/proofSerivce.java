package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.Proof;

public interface proofSerivce {
	public Proof selectByProof(String proof);
	public void updateIfUse(Integer proofId);
	public int insertProof(Proof proof);
	public int deleteProof(Integer proofId);
	public List<Proof> selectAllproof();
}
