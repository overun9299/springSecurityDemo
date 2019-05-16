package overun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @ClassName: app
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/5/15 11:02
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 * https://github.com/overun9299/springSecurityDemo.git
 */
@SpringBootApplication
@EnableCaching
public class app {


    public static void main(String[] args) {

        SpringApplication.run(app.class,args);
    }
}
