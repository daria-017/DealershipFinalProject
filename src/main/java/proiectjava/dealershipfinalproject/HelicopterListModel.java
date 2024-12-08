package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class HelicopterListModel extends AbstractListModel<String> {
    private final List<String> helicopters = new ArrayList<>();

    @Override
    public int getSize() {
        return helicopters.size();
    }

    @Override
    public String getElementAt(int index) {
        return helicopters.get(index);
    }

    public void addHelicopter(String helicopter) {
        helicopters.add(helicopter);
        int index = helicopters.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
