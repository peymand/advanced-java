package com.kaheshan.dummy.util;

import com.kaheshan.dummy.config.HibernateConfig;
import com.kaheshan.dummy.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcTemplateTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HibernateConfig.class);





        JdbcTemplate jdbcTemplate = new JdbcTemplate( context.getBean(DataSource.class));
        int result = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM persons", Integer.class);
        System.out.println(result);

    }
}
