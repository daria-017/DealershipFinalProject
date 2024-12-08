package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class SailBoatListModel extends AbstractListModel<String> {
    private final List<String> sailBoats = new ArrayList<>();

    @Override
    public int getSize() {
        return sailBoats.size();
    }

    @Override
    public String getElementAt(int index) {
        return sailBoats.get(index);
    }

    public void addSailBoat(String sailBoat) {
        sailBoats.add(sailBoat);
        int index = sailBoats.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
