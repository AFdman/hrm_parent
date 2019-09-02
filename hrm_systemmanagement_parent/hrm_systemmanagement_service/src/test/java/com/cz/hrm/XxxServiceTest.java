package com.cz.hrm;

import com.cz.hrm.domain.Systemdictionary;
import com.cz.hrm.service.ISystemdictionaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SysManage9001Application.class)
public class XxxServiceTest {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;

    @Test
    public void test()throws Exception{
        for (Systemdictionary systemdictionary : systemdictionaryService.selectList(null)) {
            System.out.println(systemdictionary);
        }
    }
}
