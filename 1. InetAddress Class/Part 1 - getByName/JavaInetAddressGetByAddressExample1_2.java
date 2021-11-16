import java.net.InetAddress;  
public class JavaInetAddressGetByAddressExample1_2 {  
    public static void main(String[] args) {  
        try{  
            // passing null value  
            InetAddress ia = InetAddress.getByName(null);  
            System.out.println(ia);  
        }
        catch (Exception ex){  
            System.err.println(ex);  
        }
    }  
}  