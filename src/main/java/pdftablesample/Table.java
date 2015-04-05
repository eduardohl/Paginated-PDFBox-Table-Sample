package pdftablesample;

import java.util.List;

import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;

public class Table {

    // Table attributes
    private float margin;
    private float height;
    private PDRectangle pageSize;
    private boolean isLandscape;
    private float rowHeight;

    // font attributes
    private PDFont textFont;
    private float fontSize;

    // Content attributes
    private Integer numberOfRows;
    private List<Column> columns;
    private String[][] content;
    private float cellMargin;

    public Table() {
    }

    public Integer getNumberOfColumns() {
        return this.getColumns().size();
    }

    public float getWidth() {
        float tableWidth = 0f;
        for (Column column : columns) {
            tableWidth += column.getWidth();
        }
        return tableWidth;
    }

    public float getMargin() {
        return margin;
    }

    public void setMargin(float margin) {
        this.margin = margin;
    }

    public PDRectangle getPageSize() {
        return pageSize;
    }

    public void setPageSize(PDRectangle pageSize) {
        this.pageSize = pageSize;
    }

    public PDFont getTextFont() {
        return textFont;
    }

    public void setTextFont(PDFont textFont) {
        this.textFont = textFont;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    public String[] getColumnsNamesAsArray() {
        String[] columnNames = new String[getNumberOfColumns()];
        for (int i = 0; i < getNumberOfColumns() - 1; i++) {
            columnNames[i] = columns.get(i).getName();
        }
        return columnNames;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public Integer getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(Integer numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getRowHeight() {
        return rowHeight;
    }

    public void setRowHeight(float rowHeight) {
        this.rowHeight = rowHeight;
    }

    public String[][] getContent() {
        return content;
    }

    public void setContent(String[][] content) {
        this.content = content;
    }

    public float getCellMargin() {
        return cellMargin;
    }

    public void setCellMargin(float cellMargin) {
        this.cellMargin = cellMargin;
    }

    public boolean isLandscape() {
        return isLandscape;
    }

    public void setLandscape(boolean isLandscape) {
        this.isLandscape = isLandscape;
    }
}
