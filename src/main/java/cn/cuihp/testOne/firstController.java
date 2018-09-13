package cn.cuihp.testOne;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个
 *
 * @ClassName: firstController
 * @Author: cuihp
 * @BelongsProject: springboot2
 * @BelongsPackage: cn.cuihp.testOne
 * @CreateTime: 2018-09-13
 */

@RestController
@RequestMapping("/one")
public class firstController {

    @RequestMapping("/hello")
    @ResponseBody
    public static String hello(){

        return "Hello Spring Boot_第san次修改!!!";
    }


}