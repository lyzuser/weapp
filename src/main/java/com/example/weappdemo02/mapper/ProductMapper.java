package com.example.weappdemo02.mapper;

import com.example.weappdemo02.bean.Product;
import com.example.weappdemo02.bean.ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
@Mapper
public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    List<Product> selectByExampleWithRowbounds(ProductExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu Aug 03 17:27:41 GMT+08:00 2023
     */
    int updateByPrimaryKey(Product record);

    List<Product> selectAllProduct();
}