package com.ivoronline.properties_read_fromhtml.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  @RequestMapping("/hello")
  public String sayHello() {
    System.out.println("Hello from sayHello()");
    return "Test";
  }

}
