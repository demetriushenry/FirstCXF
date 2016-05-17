
package br.com.firstcxf.FirstCXF;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.firstcxf.FirstCXF.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

