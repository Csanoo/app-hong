package main.java.common.satelite.kr;

        import org.mybatis.spring.SqlSessionTemplate;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.jdbc.datasource.DataSourceTransactionManager;

        import java.util.List;

        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;

@Service
public class ScheduleSvc {

    @Autowired
    private SqlSessionTemplate sqlSession;
    @Autowired
    private DataSourceTransactionManager txManager;



    public Integer selectReserveListCount(SearchVO param) {
        return sqlSession.selectOne("selectReserveListCount", param);
    }

    public Integer reserveChk(ScheduleVO param) {
        return sqlSession.selectOne("reserveChk", param);
    }


    public List<ScheduleVO> selectReserveList(SearchVO param) {

        return sqlSession.selectList("selectReserveList", param);
    }
    public List<ScheduleVO> selectReserve(ScheduleVO param) {

        return sqlSession.selectList("selectReserve", param);
    }
    public void updateUse(ScheduleVO param) {
        sqlSession.update("updateUse", param);
    }

    public void insertSchedule(ScheduleVO param) {
        sqlSession.insert("insertSchedule", param);
    }

    public void delReserve(ScheduleVO param) {
        sqlSession.delete("delReserve", param);
    }

    public ScheduleVO selectReserveOne(Integer param) {
        return sqlSession.selectOne("selectReserveOne", param);
    }

    public void updateReserve(ScheduleVO param) {
        sqlSession.update("updateReserve", param);
    }
}



