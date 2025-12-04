import com.sun.jdi.connect.Transport;

public class Car  extends Transport {

    @Override
    void move(){
        System.out.println("Машина едет");
    }
}
