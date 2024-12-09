package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class DroneListModel extends AbstractListModel<String> {
    private final List<String> drones = new ArrayList<>();

    @Override
    public int getSize() {
        return drones.size();
    }

    @Override
    public String getElementAt(int index) {
        return drones.get(index);
    }

    public void addDrone(String drone) {
        drones.add(drone);
        int index = drones.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
