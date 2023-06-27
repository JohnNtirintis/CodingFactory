package gr.aueb.cf.ch18.clientserver;

/**
 * A simple POJO class that acts as echo server
 *
 * @author Ntirintis John
 */
public class EchoServ {

    /**
     * Echos a String carried by the message argument
     *
     *
     * @param message The message to eho
     * @return the echo
     */
    public String echo(String message){
        return message;
    }
}
