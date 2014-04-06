package pdftablesample;

import java.util.List;

import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;

public class TableBuilder {

    private Table table = new Table();

    public TableBuilder setHeight(float height) {
        table.setHeight(height);
        return this;
    }

    public TableBuilder setNumberOfRows(Integer numberOfRows) {
        table.setNumberOfRows(numberOfRows);
        return this;
    }

    public TableBuilder setRowHeight(float rowHeight) {
        table.setRowHeight(rowHeight);
        return this;
    }

    public TableBuilder setContent(String[][] content) {
        table.setContent(content);
        return this;
    }

    public TableBuilder setColumns(List<Column> columns) {
        table.setColumns(columns);
        return this;
    }

    public TableBuilder setCellMargin(float cellMargin) {
        table.setCellMargin(cellMargin);
        return this;
    }

    public TableBuilder setMargin(float margin) {
        table.setMargin(margin);
        return this;
    }

    public TableBuilder setPageSize(PDRectangle pageSize) {
        table.setPageSize(pageSize);
        return this;
    }

    public TableBuilder setLandscape(boolean landscape) {
        table.setLandscape(landscape);
        return this;
    }

    public TableBuilder setTextFont(PDFont textFont) {
        table.setTextFont(textFont);
        return this;
    }

    public TableBuilder setFontSize(float fontSize) {
        table.setFontSize(fontSize);
        return this;
    }

    public Table build() {
        return table;
    }
}
