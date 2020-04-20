/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
/**
 *
 * @author pb41483
 */

@Controller
public class CalculatorController {
    
@RequestMapping("/")
public String home(Model model) {
   

    return "home";
}
@RequestMapping("/hello")
public String hello(Model model, Integer a, Integer b,Integer c,String znak ,CalculatorForm obiekt) {
    
    //zad2
    model.addAttribute("a", a);
    model.addAttribute("b", b);
     model.addAttribute("znak", znak);
     
     if(znak.equals("+"))c=a+b;
     if(znak.equals("-"))c=a-b;
     if(znak.equals("*"))c=a*b;
     
 model.addAttribute("c",c);
 
 
 //zad3
  model.addAttribute("obiekt", obiekt);
  
if((obiekt.getZnak().equals("+")))  obiekt.setC(obiekt.getA() + obiekt.getB());
if((obiekt.getZnak().equals("-")))  obiekt.setC(obiekt.getA() - obiekt.getB());
if((obiekt.getZnak().equals("*")))  obiekt.setC(obiekt.getA() * obiekt.getB());


    return "hello";
}
}

 
