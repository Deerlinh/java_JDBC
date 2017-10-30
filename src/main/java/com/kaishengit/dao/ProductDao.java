package com.kaishengit.dao;

import com.kaishengit.entity.Mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by 蔡林红 on 2017/10/30.
 */


    @Repository
    public class ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Mybatis mybatis) {
        String sql = "insert into mybatis (name,age,cls_id) values(?,?,?)";
        jdbcTemplate.update(sql, mybatis.getName(), mybatis.getAge(), mybatis.getClsId());
    }

    public Mybatis findById(int id) {

        String sql = "SELECT * from mybatis where id = ?";
        return jdbcTemplate.queryForObject(sql, new ProductMapper(), id);
    }

    public List<Mybatis> findAll() {
        String sql = "select * from mybatis";
        return jdbcTemplate.query(sql, new ProductMapper());

    }

    public  int count(){
        String sql="select count(*) from mybatis";
        return jdbcTemplate.queryForObject(sql,int.class);

    }




    private  class ProductMapper implements RowMapper<Mybatis>{
        @Override
        //匿名局部内部类
        public Mybatis mapRow(ResultSet resultSet, int i) throws SQLException {
            Mybatis mybatis = new Mybatis();
            mybatis.setId(resultSet.getInt("id"));
            mybatis.setName(resultSet.getString("name"));
            mybatis.setAge(resultSet.getInt("age"));
            mybatis.setClsId(resultSet.getInt("cls_id"));

            return mybatis;
        }
    }


}



