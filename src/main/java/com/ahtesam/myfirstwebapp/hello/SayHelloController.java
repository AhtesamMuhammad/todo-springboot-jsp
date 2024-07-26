package com.ahtesam.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body");
        sb.append("</body>");
        sb.append("</html>");
        
        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
        // Esto tiene que ser el nombre del archivo .jsp para que pueda ir a buscarlo en resources
		return "sayHello"; 
	}
}
