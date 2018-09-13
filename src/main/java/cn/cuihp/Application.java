package cn.cuihp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导
 *
 * @ClassName: Application
 * @Author: cuihp
 * @BelongsProject: springboot2
 * @BelongsPackage: cn.cuihp
 * @CreateTime: 2018-09-13
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("项目启动了!!!");
    }
}