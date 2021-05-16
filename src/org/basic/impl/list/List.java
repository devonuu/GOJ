package org.basic.impl.list;

public interface List {
    public void add();
    public void add(int index);
    public void update(int index, Object value);
    public void remove(int index);
    public int size();
    public void removeAll();
}
