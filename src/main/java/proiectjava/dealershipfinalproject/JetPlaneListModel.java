package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class JetPlaneListModel extends AbstractListModel<String> {
    private final List<String> jetPlanes = new ArrayList<>();

    @Override
    public int getSize() {
        return jetPlanes.size();
    }

    @Override
    public String getElementAt(int index) {
        return jetPlanes.get(index);
    }

    public void addJetPlane(String jetPlane) {
        jetPlanes.add(jetPlane);
        int index = jetPlanes.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
