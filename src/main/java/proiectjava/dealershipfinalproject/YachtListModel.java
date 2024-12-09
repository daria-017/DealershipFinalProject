package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class YachtListModel extends AbstractListModel<String> {
    private final List<String> yachts = new ArrayList<>();

    @Override
    public int getSize() {
        return yachts.size();
    }

    @Override
    public String getElementAt(int index) {
        return yachts.get(index);
    }

    public void addYacht(String yacht) {
        yachts.add(yacht);
        int index = yachts.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
