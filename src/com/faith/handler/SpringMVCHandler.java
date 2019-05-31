package com.faith.handler;

import com.faith.entity.People;
import com.faith.entity.Student;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-26
 * @Description: com.faith.handler
 * @version: 1.0
 */

@Controller
@RequestMapping(value = "promotion")
public class SpringMVCHandler {

    @RequestMapping(value = "welcome")
    public String welcome() {
        return "success";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add() {
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, params = {"yang=杨"})
    public String addYang() {
        return "add";
    }

    // 一层
    @RequestMapping(value = "welcome/*/abc", method = RequestMethod.GET)
    public String welcomeAnt1() {
        return "success";
    }

    // 任意多层
    @RequestMapping(value = "welcome/**/abc", method = RequestMethod.GET)
    public String welcomeAnt2() {
        return "success";
    }

    // 接收参数
    @RequestMapping(value = "welcome/{name}", method = RequestMethod.GET)
    public String welcomeParams(@PathVariable("name") String name) {
        System.out.println(name);
        return "success";
    }

    // 通过RequestParam拿到参数
    @RequestMapping(value = "testParam")
    public String testParam(@RequestParam("yang") String yang,
                            @RequestParam(value = "age", required = false, defaultValue = "23") Integer age) {
        System.out.println(yang);
        System.out.println(age);
        return "success";
    }

    @RequestMapping(value = "testObjectProperties")
    public String  testObjectProperties(Student student) {
        // student属性 必须 和 form表单中的属性Name值一致（支持级联属性）
		/*
		    过去的做法：
			String name = 	request.getParameter("name");
		    int age= Integer.parseInt(request.getParameter("age")s)	;
		    String haddrss = 	request.getParameter("homeaddress");
		    String saddress = 	request.getParameter("schooladdress");
		    Address address = new Address();
		    address.setHomeAddress(haddrss);
		    address.setSchoolAddress(saddress);

			Student student = new Student();
			student.setName(name);
			student.setAddress(address);
		*/
        System.out.println(student.getAge()+","
                +student.getName()+","+
                student.getAddress().getHomeAddress()+","+
                student.getAddress().getSchoolAddress());
        return "success" ;
    }

    @RequestMapping("testI18n")
    public String testI18n() {
        return "success";
    }

    @RequestMapping("testDateFormat")
    public String testDateFormat(@Valid Student student, BindingResult result, Map<String, Object> map) {
        if(result.getErrorCount() > 0) {
            for(FieldError error:  result.getFieldErrors() ) {
                map.put("errors", result.getFieldErrors());  // 将错误信息传入request域中
                System.out.println(error.getDefaultMessage().getClass());
            }
        }
        System.out.println(student.getName() + student.getBirthday() + student.getEmail());
        return "success";
    }

    @ResponseBody // 告诉springMVC此时的返回值是一个ajax返回值，返回给调用地方
    @RequestMapping(value = "testJson")
    public People testJson() {
        People people1 = new People("黑人", 34);
        People people2 = new People("拜仁", 12);
        People people3 = new People("黄人", 14);
        List<People> list = new ArrayList<>();
        list.add(people1);
        list.add(people2);
        list.add(people3);
        for(People item: list) {
            System.out.println(item.getName());
        }

        return people1;
    }

//    @RequestMapping(value="testUpload") //abc.png
//    public String testUpload(@RequestParam("desc") String desc,
//                             @RequestParam("file") MultipartFile file  ) throws IOException {
//
//        System.out.println("文件描述信息："+desc);
//        //jsp中上传的文件：file
//
//        InputStream input = file.getInputStream() ;//IO
//        String fileName = file.getOriginalFilename() ;
//
//        OutputStream out = new FileOutputStream("/faith/ff/output/"+fileName) ;
//
//
//        byte[] bs = new byte[1024];
//        int len = -1;
//        while(( len = input.read(bs)) !=-1 ) {
//            out.write(bs, 0, len);
//        }
//        out.close();
//        input.close();
//        //将file上传到服务器中的 某一个硬盘文件中
//        System.out.println("上传成功！");
//
//        return "success";
//    }

}
