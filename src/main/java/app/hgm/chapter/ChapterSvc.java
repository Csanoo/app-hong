package main.java.app.hgm.chapter;

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
public class ChapterSvc {

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private DataSourceTransactionManager txManager;

	/* 홍지문 동영상 강의 목록 */
	public List<ChapterVO> selectAllChapter(ChapterExample example) {
		return sqlSession.selectList("selectAllChapter", example);
	}
	
	/* 홍지문 동영상 강의 상세 */
	public ChapterVO selectChapterOne(Integer param) {
		return sqlSession.selectOne("selectChapterOne", param);
	}
	
	/* 강의목록 중 패키지 아닌 단일 강좌 목록 */
	public List<ChapterVO> selListCourseHong2() {
		return sqlSession.selectList("selListCourseHong2");
	}
	
	/* 강좌명 조회 단일 쿼리 */
	public ChapterVO selCourseTitle(Integer param) {
		return sqlSession.selectOne("selCourseTitle", param);
	}

	public List<ChapterVO> selListCourse() {
		return sqlSession.selectList("selListCourseHong");
	}
	public List<ChapterVO> selListCourseHong() {
		return sqlSession.selectList("selListCourseHong");
	}
	
	
	public List<ChapterVO> selListPkg2() {
		return sqlSession.selectList("selListPkg2");
	}

	public Integer countAllChapter(ChapterExample example) {
		return sqlSession.selectOne("countAllChapter", example);
	}

	

	
	
	public ChapterVO selectChapterOneOrd(ChapterVO param) {
		return sqlSession.selectOne("selectChapterOneOrd", param);
	}
	
	

	public void insertChapter(ChapterVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {

			sqlSession.insert("insertChapter", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);
			System.out.println("Chapter 데이터 저장 오류: " + ex.toString());
		}
	}

	public void updateChapter(ChapterVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {

			sqlSession.update("updateChapter", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);
			System.out.println("Chapter 데이터 저장 오류: " + ex.toString());
		}
	}

	public void deleteChapter(ChapterVO param) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);

		try {

			sqlSession.delete("deleteChapter", param);

			txManager.commit(status);
		} catch (TransactionException ex) {
			txManager.rollback(status);
			System.out.println("Chapter 데이터 저장 오류: " + ex.toString());
		}
	}

}
