package com.example.demo;

import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Resource
	UserInfoMapper userInfoMaper;

	@Resource
	DemoService demoService;

	@Test
	public void contextLoads() {
//		DateFormat dateFormat;
//		dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");//设定格式
//		Date date = null;
//		try {
//			date = dateFormat.parse("2018-04-17 12:00:00");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		Timestamp timestamp  = new Timestamp(date.getTime());
//		Long time = timestamp.getTime();
//		System.out.println(time);
//		demoService.addUser();

		List<UserInfo> list = demoService.getUser();
		if(list != null && list.size() > 0){
			for (UserInfo userInfo : list){
				logger.info("userName is :" + userInfo.getUserName());
			}
		}
		logger.info("over");
	}
}
