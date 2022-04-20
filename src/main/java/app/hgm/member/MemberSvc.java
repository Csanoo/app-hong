package main.java.app.hgm.member;

import main.java.app.hgm.kr.BannerVO;
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
public class MemberSvc {

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private DataSourceTransactionManager txManager;

	
	public MemberVO selectMainStat(String param) {
		return sqlSession.selectOne("selectMainStat", param);
	}
	
	public MemberVO selectMainStat2(String param) {
		return sqlSession.selectOne("selectMainStat2", param);
	}
	
	
	
	public MemberVO selectMember1One(MemberVO param) {
		return sqlSession.selectOne("selectMember1One", param);
	}
	
	public MemberVO selectMember1Read(String param) {
		return sqlSession.selectOne("selectMember1Read", param);
	}

	public void insertMember1One(MemberVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {

			sqlSession.insert("insertMember1One", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}
	
	public void updateMember1One(MemberVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		
		try {

			sqlSession.update("updateMember1One", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}
	
	public void updateMember1One2(MemberVO param, List<FileVO> filelist,
								  String[] fileno) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		for (FileVO f : filelist) {

			param.setImgfile(f.getFilename());

			
		}
		
		try {
			
			if (!param.getImgfile().equals("")) {
				sqlSession.update("updateMember1One", param);
			} else {

				sqlSession.update("updateMember11One", param);
			}

			

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}

	public Integer selectMember1Count(SearchVO param) {
		return sqlSession.selectOne("selectMember1Count", param);
	}

	public List<?> selectMember1List(SearchVO param) {

		return sqlSession.selectList("selectMember1List", param);
	}
	
	public Integer selectCode1Count(SearchVO param) {
		return sqlSession.selectOne("selectCode1Count", param);
	}

	public List<?> selectCode1List(SearchVO param) {

		return sqlSession.selectList("selectCode1List", param);
	}


	public Integer selectMemberCodeCount(SearchVO param) {
		return sqlSession.selectOne("selectMemberCodeCount", param);
	}

	public List<MemberVO> selectMemberCode(SearchVO param) {

		return sqlSession.selectList("selectMemberCode", param);
	}

    public List<MemberVO> loginHistory(SearchVO param) {

        return sqlSession.selectList("selectLogin", param);
    }
    public Integer selectLoginCount(SearchVO param) {
        return sqlSession.selectOne("selectLoginCount", param);
    }

	public void insertUserType(MemberVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {

			if (param.getSn().equals("")) {
				sqlSession.insert("insertUserType", param);
			} else {
				sqlSession.insert("updateCode1One", param);
			}

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}

	public List<?> selectCode1SelList() {

		return sqlSession.selectList("selectCode1SelList");
	}

	public List<?> selectCode2SelList() {

		return sqlSession.selectList("selectCode2SelList");
	}

	public List<?> selectCodetype() {

		return sqlSession.selectList("selectCodetype");
	}

	public MemberVO selectCode1One(String param) {
		return sqlSession.selectOne("selectCode1One", param);
	}
	
	public void insertCode1One(MemberVO param) {
			if (param.getSn().equals("")) {
				sqlSession.insert("insertCode1One", param);
			} else {
				sqlSession.insert("updateCode1One", param);
			}

	}
	
	public void deleteCode1One(String param) {


			sqlSession.insert("deleteCode1One", param);

	}

	public void deletePost1One(String param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {

			sqlSession.insert("deletePost1One", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}
	
	public Integer selectContents1Count(SearchVO param) {
		return sqlSession.selectOne("selectcontentsCount0", param);
	}

	public List<?> selectContents1List(SearchVO param) {

		return sqlSession.selectList("selectcontentsList0", param);
	}


	public List<MemberVO> selectexcelList(SearchVO param) {

		return sqlSession.selectList("selectexcelList2", param);
	}

	public Integer selectContents12Count(SearchVO param) {
		return sqlSession.selectOne("selectContents12Count", param);
	}

	public List<?> selectContents12List(SearchVO param) {

		return sqlSession.selectList("selectContents12List", param);
	}

	public List<?> selectMember1Excel(SearchVO param) {

		return sqlSession.selectList("selectMember1Excel", param);
	}



	public List<?> projectmember(SearchVO param) {

		return sqlSession.selectList("project_member", param);
	}

	public void updateContents(BannerVO param, List<FileVO> filelist) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		
		for (FileVO f : filelist) {

			param.setImgfile(f.getFilename());
		}
	
		try {

			if (!param.getImgfile().equals("")) {
				sqlSession.update("updateContents", param);
			} else {

				sqlSession.update("updateContents2", param);
			}

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}
	
	public void ContentsDelete(String param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		
		
	
		try {

			

				sqlSession.delete("ContentsDelete", param);
			

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}
	
	public void insertContents(BannerVO param, List<FileVO> filelist) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		for (FileVO f : filelist) {

			param.setImgfile(f.getFilename());
		}
	
		try {

			sqlSession.insert("insertContents", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);

		}
	}

	public Integer selDupUserid(String param) {
		return sqlSession.selectOne("selDupUserid", param);
	}
	public Integer sumYtbQuata() {
		return sqlSession.selectOne("ytbQuata");
	}
	public Integer selCodeTitCt(String param) {
		return sqlSession.selectOne("selCodeTitCt", param);
	}


}
