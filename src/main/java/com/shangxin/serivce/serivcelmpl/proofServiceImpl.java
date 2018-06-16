package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.Proof;
import com.shangxin.dao.proofDao;
import com.shangxin.serivce.proofSerivce;

@Service
public class proofServiceImpl implements proofSerivce{

	@Autowired
	proofDao dao;
	@Override
	public Proof selectByProof(String proof) {
		// TODO Auto-generated method stub
		return dao.selectByProof(proof);
	}
	@Override
	public void updateIfUse(Integer proofId) {
		// TODO Auto-generated method stub
		dao.updateIfUse(proofId);
	}
	@Override
	public int insertProof(Proof proof) {
		// TODO Auto-generated method stub
		return dao.insertProof(proof);
	}
	@Override
	public int deleteProof(Integer proofId) {
		// TODO Auto-generated method stub
		return dao.deleteProof(proofId);
	}
	@Override
	public List<Proof> selectAllproof() {
		// TODO Auto-generated method stub
		return dao.selectAllproof();
	}

}
