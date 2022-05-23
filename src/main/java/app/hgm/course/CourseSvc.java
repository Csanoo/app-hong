package main.java.app.hgm.course;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class CourseSvc {
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private DataSourceTransactionManager txManager;

	public Integer countCourse(CourseExample example) {
		return sqlSession.selectOne("countCourse", example);
	}

	public List<CourseVO> selectCourse(CourseExample example) {
		return sqlSession.selectList("selectCourse", example);
	}

	public Integer countBook(CourseExample example) {
		return sqlSession.selectOne("countBook", example);
	}

	public List<CourseVO> selectBook(CourseExample example) {
		return sqlSession.selectList("selectBook", example);
	}

	public Integer countCP(CourseExample example) {
		return sqlSession.selectOne("countCP", example);
	}

	public List<CourseVO> selectCP(CourseExample example) {
		return sqlSession.selectList("selectCP", example);
	}

	public Integer countMyCourse(CourseExample example) {
		return sqlSession.selectOne("countMyCourse", example);
	}

	public List<CourseVO> selectMyCourse(CourseExample example) {
		return sqlSession.selectList("selectMyCourse", example);
	}

	public Integer countMyReserve(CourseExample example) {
		return sqlSession.selectOne("countMyReserve", example);
	}

	public List<CourseVO> selectMyReserve(CourseExample example) {
		return sqlSession.selectList("selectMyReserve", example);
	}

	public Integer countMyGoods(CourseExample example) {
		return sqlSession.selectOne("countMyGoods", example);
	}

	public List<CourseVO> selectMyGoods(CourseExample example) {
		return sqlSession.selectList("selectMyGoods", example);
	}

	public Integer countMyTest(CourseExample example) {
		return sqlSession.selectOne("countMyTest", example);
	}

	public List<CourseVO> selectMyTest(CourseExample example) {
		return sqlSession.selectList("selectMyTest", example);
	}

}
