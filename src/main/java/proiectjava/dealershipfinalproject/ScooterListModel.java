package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class ScooterListModel extends AbstractListModel<String> {
    private final List<String> scooters = new ArrayList<>();

    @Override
    public int getSize() {
        return scooters.size();
    }

    @Override
    public String getElementAt(int index) {
        return scooters.get(index);
    }

    public void addScooter(String scooter) {
        scooters.add(scooter);
        int index = scooters.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
