package from.not.to.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


  @GetMapping("HelloWorld")
  public ResponseEntity<String> helloWorld(){


    return new ResponseEntity("Hello", HttpStatus.OK);
  }
}
