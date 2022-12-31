package com.cinema.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cinema.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	private static final Logger log = LoggerFactory.getLogger(MemberMapperTests.class);
    
    @Autowired
    private MemberMapper mapper;

    @Test
    public void testEnroll() {        
        MemberVO vo = new MemberVO();
        
        vo.setMem_userid("test");
        vo.setMem_password("test");
        vo.setMem_username("test");
        vo.setMem_nickname("test");
        vo.setMem_email("test@gmail.com");
        vo.setMem_phone("01012341234");
    
        mapper.join(vo);
        
    }
}
