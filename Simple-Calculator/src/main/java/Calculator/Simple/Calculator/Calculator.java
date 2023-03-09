package Simple.Calculator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages="Entity,+Controller")
public class Calculator

 {
//it is used to get the request for the specific method
 @GetMapping("/calculator/add")
 public String calculate(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
		 @RequestParam(value="n2",required=true,defaultValue="10")int n2)
 {
	 return "<h2> The sum is"+CalculatorLogic.addNo(n1, n2)+"<h2>";// call the CalculatorLogic class addNo() method
 }

//it is used to get the request for the specific method

 @GetMapping("/calculator/sub")
 public String calculate1(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
		 @RequestParam(value="n2",required=true,defaultValue="2")int n2)
 {
	 return "<h2> The substraction is"+CalculatorLogic.subNo(n1, n2)+"<h2>";// call the CalculatorLogic class subNo() method
 }


//it is used to get the request for the specific method

 @GetMapping("/calculator/mul")
 public String calculate2(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
		 @RequestParam(value="n2",required=true,defaultValue="2")int n2)
 {
	 return "<h2> The multiplication is"+CalculatorLogic.mulNo(n1, n2)+"<h2>";// call the CalculatorLogic class mulNo() method
 }


//it is used to get the request for the specific method
 @GetMapping("/calculator/div")

 public String calculate3(@RequestParam(value="n1",required=true,defaultValue="1")int n1, @RequestParam(value="n2",required=true,defaultValue="2")int n2)
 {
	 return "<h2> The division is"+CalculatorLogic.divNo(n1, n2)+"<h2>";// call the CalculatorLogic class divNo() method
 }
}
