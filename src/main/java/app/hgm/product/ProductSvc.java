package main.java.app.hgm.product;
import java.util.List;

import main.java.app.hgm.chapter.ChapterVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;


@SuppressWarnings("unused")
@Service
public class ProductSvc implements ProductMapper {

	@Autowired
	private SqlSessionTemplate sqlSession;    
	@Autowired
	private DataSourceTransactionManager txManager;



	/* 강의 상세 */
	public ProductVO selectlecDetail(String leccode) {
		return sqlSession.selectOne("selLectureDetail", leccode);
	}

	public List<ChapterVO> selChapterList(String leccode){
		return sqlSession.selectList("selChapterList", leccode);
	}
	/* 교재 판매 이력 목록 */
	public List<ProductVO> selBookSellList(ProductExample example) {
		return sqlSession.selectList("selBookSellList", example);
	}
	
	/* 교재 판매 이력 상세 */
	public ProductVO selBookSellOne(String sn) {
		return sqlSession.selectOne("selBookSellOne", sn);
	}

	
	/* 교재 정보 목록 */
	public List<ProductVO> selBkList(ProductExample example) {
		return sqlSession.selectList("selectByExampleProduct", example);
	}
	
	
	@Override
	public List<ProductVO> selectByExample(ProductExample example) {
		return sqlSession.selectList("selectByExampleProduct", example);
	}
	
	
	public ProductVO selectBook(String sn) {
		return sqlSession.selectOne("selectByPrimaryKeyProduct", sn);
		
	}

	public List<ProductVO> selCartList(ProductVO productVO) {
		return sqlSession.selectList("selCartList", productVO);
	}

	public List<ProductVO> selOrderList(ProductVO productVO) {
		return sqlSession.selectList("selOrderList", productVO);
	}


	public int cartInsert(ProductVO cartvo) {
		String type = cartvo.getPrdtype();
		if(type.equals("L")){
			sqlSession.insert("insertCartL",cartvo);
		}else{
			sqlSession.insert("insertCart",cartvo);
		}

		return 0;
	}

	public int orderInsert(ProductVO cartvo) {
		sqlSession.insert("insertCheckout",cartvo);
		return 1;
	}

	public int cartCheck(ProductVO cartvo) {
		return sqlSession.selectOne("cartCheck", cartvo);

	}

	@Override
	public ProductVO selectByPrimaryKey(Integer sn) {
		return sqlSession.selectOne("", sn);
		
	}

	@Override
	public int deleteByExample(ProductExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer sn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ProductVO record) {
		sqlSession.insert("insertProduct",record);
		return 0;
	}

	@Override
	public int insertSelective(ProductVO record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int countByExample(ProductExample example) {
		return sqlSession.selectOne("countByExampleProduct", example);
	}
	
	
	
	
	public int countByExample2(ProductExample example) {
		return sqlSession.selectOne("countByExampleBasket", example);
	}

	

	@Override
	public int updateByExampleSelective(ProductVO record, ProductExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ProductVO record, ProductExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ProductVO record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ProductVO record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public int update(ProductVO record) {
		sqlSession.update("updateProduct",record);
		return 0;
	}
	
	
	
	public int delete(ProductVO record) {
		sqlSession.delete("deleteProduct",record);
		return 0;
	}
	
	
	
}
