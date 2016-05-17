package br.com.firstcxf.FirstCXF;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

