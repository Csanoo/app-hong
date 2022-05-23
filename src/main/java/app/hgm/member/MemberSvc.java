package main.java.app.hgm.member;

import main.java.app.hgm.course.CourseExample;
import main.java.app.hgm.course.CourseVO;
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
public class MemberSvc {

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private DataSourceTransactionManager txManager;

	public MemberVO selectMemberLogin(MemberVO param) {
		return sqlSession.selectOne("selectMemberLogin", param);
	}
	
	public MemberVO selectMemberRead(String param) {
		return sqlSession.selectOne("selectMemberRead", param);
	}

	public Integer selDupUserid(String param) {
		return sqlSession.selectOne("selDupUserid", param);
	}

	public void insertMemberJoin(MemberVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		try {
			sqlSession.insert("insertMemberJoin", param);
			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);
		}
	}

	public void updateMember(MemberVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		try {
			sqlSession.update("updateMember", param);
			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);
		}
	}


}
