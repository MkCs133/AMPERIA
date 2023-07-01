package frame.grid_layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

public class CustomGridLayout extends GridLayout {

    private static final long serialVersionUID = 1L;
    private double cellSizePercentage;

    public CustomGridLayout(int rows, int cols, double cellSizePercentage) {
        super(rows, cols);
        this.cellSizePercentage = cellSizePercentage;
    }

    @Override
    public void layoutContainer(Container parent) {
        synchronized (parent.getTreeLock()) {
            int ncomponents = parent.getComponentCount();
            if (ncomponents == 0) {
                return;
            }

            int nrows = getRows();
            int ncols = getColumns();
            int hgap = getHgap();
            int vgap = getVgap();

            int totalGapsWidth = (ncols - 1) * hgap;
            int totalGapsHeight = (nrows - 1) * vgap;

            int usableWidth = parent.getWidth() - totalGapsWidth;
            int usableHeight = parent.getHeight() - totalGapsHeight;

            int cellWidth = (int) (usableWidth / ncols * cellSizePercentage);
            int cellHeight = (int) (usableHeight / nrows * cellSizePercentage);

            int x = 0;
            int y = 0;
            for (int i = 0; i < ncomponents; i++) {
                Component comp = parent.getComponent(i);
                if (comp.isVisible()) {
                    comp.setBounds(x, y, cellWidth, cellHeight);
                }

                x += cellWidth + hgap;
                if (x >= parent.getWidth()) {
                    x = 0;
                    y += cellHeight + vgap;
                }
            }
        }
    }
}
