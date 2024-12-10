package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class TruckListModel extends AbstractListModel<String> {
    private final List<String> trucks = new ArrayList<>();

    @Override
    public int getSize() {
        return trucks.size();
    }

    @Override
    public String getElementAt(int index) {
        return trucks.get(index);
    }

    public void addTruck(String truck) {
        trucks.add(truck);
        int index = trucks.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
