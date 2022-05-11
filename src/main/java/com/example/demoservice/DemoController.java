package com.example.demoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class DemoController {

  @GetMapping("/id")
  public String getName() {
    return "1";
  }

  @GetMapping("/username")
  public String getAddress() {
    return "umitsancakli";
  }

  @GetMapping("/email")
  public String getStatus() {
    return "umitsancakli98@gmail.com";
  }

}
