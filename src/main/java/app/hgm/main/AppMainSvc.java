package main.java.app.hgm.main;

import main.java.common.satelite.kr.FileVO;
import main.java.common.satelite.kr.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.List;

@Service
public class AppMainSvc {

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private DataSourceTransactionManager txManager;

	public AppMainVO selectAppMain1One(AppMainVO param) {
		return sqlSession.selectOne("selectAppMain1One", param);
	}
	
	public AppMainVO selectAppMain1One(String param) {
		return sqlSession.selectOne("selectAppMain1One", param);
	}
	
	public AppMainVO selectAppMain2One(AppMainVO param) {
		return sqlSession.selectOne("selectAppMain2One", param);
	}
	
	public AppMainVO selectAppMain2One(String param) {
		return sqlSession.selectOne("selectAppMain2One", param);
	}

	public List<?> selectBoxproject(SearchVO param) {

		return sqlSession.selectList("selectBoxproject3", param);
	}


	public void insertAppMain1One(AppMainVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {
			sqlSession.insert("insertAppMain1One", param);
			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);
		}
	}
	
	public void insertAppMain2One(AppMainVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {

			sqlSession.insert("insertAppMain2One", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}

	public void insertAppMain1(AppMainVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {
			sqlSession.insert("insertAppMain1One", param);
			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}
	
	public void updateAppMain1(AppMainVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		try {
			sqlSession.update("updateAppMain1One", param);
			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
		
		
	}
	
	public void updateAppMain2(AppMainVO param, List<FileVO> filelist,
							   String[] fileno) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		for (FileVO f : filelist) {

			//param.setImgfile(f.getFilename());
			param.setCreatorimg(f.getFilename());

			
		}
		
		try {
			if (!param.getCreatorimg().equals("")) {
				sqlSession.update("updateAppMain2One", param);
			} else {

				sqlSession.update("updateAppMain22One", param);
			}

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
		
		
	}
	
	public void insertAppMain2(AppMainVO param, List<FileVO> filelist, String[] fileno) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		for (FileVO f : filelist) {

			param.setCreatorimg(f.getFilename());
		}
		try {

			sqlSession.insert("insertAppMain2One", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}

	public Integer selectAppMain1Count(SearchVO param) {
		return sqlSession.selectOne("selectAppMain1Count", param);
	}

	public List<?> selectAppMain1List(SearchVO param) {

		return sqlSession.selectList("selectAppMain1List", param);
	}

	
	public Integer selectAppMain2Count(SearchVO param) {
		return sqlSession.selectOne("selectAppMain2Count", param);
	}

	public List<?> selectAppMain2List(SearchVO param) {

		return sqlSession.selectList("selectAppMain2List", param);
	}
	
	public void appmain1Delete(String param) {

		sqlSession.delete("appmain1Delete", param);
	}

	public void chkPopDelete(String param) {

		sqlSession.delete("chkPopDelete", param);
	}


}
