package com.cocky.conditional;

public class OsxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
