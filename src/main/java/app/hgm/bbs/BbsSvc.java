package main.java.app.hgm.bbs;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class BbsSvc implements main.java.app.hgm.bbs.bbsMapper {

	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private DataSourceTransactionManager txManager;

	/* 게시판 종류 셀렉 박스 */
	public List<bbs> selBbsType() {
		return sqlSession.selectList("selBbsType");
	}

	/* 전체 게시물 목록 */
	@Override
	public List<bbs> selectByExample(bbsExample example) {
		return sqlSession.selectList("selectByExampleBbs", example);
	}

	/* 전체 게시물 카운팅 */
	@Override
	public int countByExample(bbsExample example) {
		return sqlSession.selectOne("countByExampleBbs", example);
	}

	/* 게시물 상세 */
	@Override
	public bbs selectByPrimaryKey(Integer sn) {
		return sqlSession.selectOne("selectByPrimaryKeyBbs", sn);

	}

	/* 게시물 저장, 업데이트 */
	public int updateByExampleBbs(bbs bbs) {
		if (bbs.getIdx() != null && bbs.getIdx() != "") {
			return sqlSession.update("updateByExampleBbs", bbs);
		} else {
			return sqlSession.update("updateByExampleBbs", bbs);
		}
	}

	public int countByExample2(bbsExample example) {
		return sqlSession.selectOne("countByExampleBbs2", example);
	}

	public List<bbs> selectByExample2(bbsExample example) {
		return sqlSession.selectList("selectByExampleBbs2", example);
	}


	/* 리뷰 게시물 목록 */

	public List<bbs> selectByReview(bbsExample example) {
		return sqlSession.selectList("selectByReview", example);
	}

	/* 전체 게시물 카운팅 */

	public int countByReview(bbsExample example) {
		return sqlSession.selectOne("countByReview", example);
	}




	@Override
	public int deleteByExample(bbsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer sn) {
		return sqlSession.delete("deleteByPrimaryKeyBbs", sn);
	}

	@Override
	public int insert(bbs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(bbs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public bbs selectByPrimaryKey2(Integer sn) {
		return sqlSession.selectOne("selectByPrimaryKeyBbs2", sn);

	}

	@Override
	public int updateByExampleSelective(bbs record, bbsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(bbs record, bbsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(bbs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(bbs bbs) {
		return 0;
	}

	public int updateByExampleBbs2(bbs bbs) {
		return sqlSession.update("updateByExampleBbs2", bbs);
	}

}
