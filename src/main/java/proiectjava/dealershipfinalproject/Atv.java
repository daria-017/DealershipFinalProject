
package proiectjava.dealershipfinalproject;
import javax.swing.ImageIcon;
import java.awt.Color;
/**
 *
 * @author hcosm
 */
public class Atv extends Vehicle {

String Usage;
boolean forYouth;
boolean offroad;
int rackCapacity;
String suspensionType;

        public Atv() {
        super();
        this.Usage = "Unknown";
        this.forYouth = false;
        this.offroad = false;
        this.rackCapacity = 0;
        this.suspensionType = "Unknown";
    }
        
        public Atv(int id, String brand, String model,short year, Color color, double price,int weight, Engine engine, Transmission transmission, ImageIcon photo,
                String Usage, boolean forYouth, boolean offroad, int rackCapacity, String suspensionType) {
         super(id, brand, model,year, color, price, weight, engine, transmission, photo);
        this.Usage = Usage;
        this.forYouth = forYouth;
        this.offroad = offroad;
        this.rackCapacity = rackCapacity;
        this.suspensionType = suspensionType;
    }
        public Atv(Atv copy)
        {
            super(copy);//continua asta
        this.Usage = copy.Usage;
        this.forYouth = copy.forYouth;
        this.offroad = copy.offroad;
        this.rackCapacity = copy.rackCapacity;
        this.suspensionType = copy.suspensionType;
        }
        
        @Override
    public String toString() {
        return super.toString()+"Atv{" + "Usage=" + Usage + ", forYouth=" + forYouth + ", offroad=" + offroad + ", rackCapacity=" + rackCapacity + ", suspensionType=" + suspensionType + '}';
    }




    public String getUsage() {
        return Usage;
    }

    public boolean isForYouth() {
        return forYouth;
    }

    public boolean isOffroad() {
        return offroad;
    }

    public int getRackCapacity() {
        return rackCapacity;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    public void setForYouth(boolean forYouth) {
        this.forYouth = forYouth;
    }

    public void setOffroad(boolean offroad) {
        this.offroad = offroad;
    }

    public void setRackCapacity(int rackCapacity) {
        this.rackCapacity = rackCapacity;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    
}


