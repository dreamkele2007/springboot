package com.huahua.base.web.ui;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author GYM
 * @date 2020/4/8 11:07
 * @Description: TODO
 */
public class Row implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 行标识（前端生成）
     */
    private String rowid;

    /**
     * 行标识（后端主键）
     */
    private String primaryKey;

    /**
     * 行状态
     */
    private RowStatus rowStatus;

    /**
     * 是否走过流量差异化被优化过，如果被处理，则关联项处理时，如果来源cell为空（可能被优化掉了），则不处理关联项
     */
    private boolean isOptimized = false;

    /**
     * 单元格集合
     */
    private final Map<String, Cell> values = new HashMap<String, Cell>();

    /**
     * 增加单元格
     *
     * @param name
     * @param cell
     */
    public void addCell(String name, Cell cell) {
        this.values.put(name, cell);
    }

    /**
     * 根据name获取单元格
     *
     * @param name
     * @return 单元格
     */
    public Cell getCell(String name) {
        return this.values.get(name);
    }

    /**
     * 获取单元格名称
     *
     * @return 名称数组
     */
    public String[] getCellNames() {
        int size = this.values.size();
        String[] names = new String[size];
        names = this.values.keySet().toArray(names);
        return names;
    }

    /**
     * 获取所有单元格
     *
     * @return 单元格数组
     */
    public Cell[] getCells() {
        int size = this.values.size();
        Cell[] cells = new Cell[size];
        cells = this.values.values().toArray(cells);
        return cells;
    }

    /**
     * 获取行标识
     *
     * @return 行标识
     */
    public String getRowid() {
        return this.rowid;
    }

    /**
     * 获取行状态
     *
     * @return 行状态
     */
    public RowStatus getRowStatus() {
        return this.rowStatus;
    }

    /**
     * 获取 单元格集合
     *
     * @return 单元格集合
     */
    public Map<String, Cell> getValues() {
        return this.values;
    }

    /**
     * 移除cell
     *
     * @param name
     */
    public void removeCell(String name) {
        this.values.remove(name);
    }

    /**
     * 设置行标识
     *
     * @param rowid
     *            行标识
     */
    public void setRowid(String rowid) {
        this.rowid = rowid;
    }

    /**
     * 设置行状态
     *
     * @param rowStatus
     */
    public void setRowStatus(RowStatus rowStatus) {
        this.rowStatus = rowStatus;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isOptimized() {
        return isOptimized;
    }

    public void setOptimized(boolean isOptimized) {
        this.isOptimized = isOptimized;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Row [rowid=").append(this.rowid).append(", RowStatus=").append(this.rowStatus.getName())
                .append(", values={");

        for (String value : this.values.keySet()) {
            Cell cell = this.values.get(value);
            sb.append(value).append(":").append(cell.toString()).append(";");
        }

        sb.append("}]");
        return sb.toString();
    }
}
