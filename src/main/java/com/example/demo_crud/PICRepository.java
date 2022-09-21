package com.example.demo_crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PICRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<PIC> list() {
        String sql = "SELECT * FROM c##sdean.PIC_IMPRT_STAT_TYPE";

        List<PIC> listPIC = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(PIC.class));

        return listPIC;
    }
}

