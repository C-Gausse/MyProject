package logback;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {

//	private static Logger log = LoggerFactory.getLogger(LogbackDemo.class);  
    public static void main(String[] args) {  
        long s=System.currentTimeMillis();
		for(int i=0;i<100000000;i++){
			new Date();
		}
		System.out.println(System.currentTimeMillis()-s);
    } 
}
