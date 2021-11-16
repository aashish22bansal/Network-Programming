//package InetAddress_Class;

import java.net.InetAddress;
public class JavaInetAddressGetByAddressExample1_1{  
    public static void main(String[] args){  
        try{  
            InetAddress ia = InetAddress.getByName("aashish22bansal.github.io");
            System.out.println(ia.getHostName());  
        }
        catch(Exception ex){  
            System.err.println(ex);  
        }  
    }  
}  