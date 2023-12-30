package com.student.dao;

public interface StudentDao {

    public void selectALL();

    public void find(
        String cin
    );

    public void create(
        String cin,
        String name,
        int age,
    );

    public void update(
        String cin,
        String name,
        int age,
    );

    public void delete(
        String cin
    );

}