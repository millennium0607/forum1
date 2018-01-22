package com.wjb.forum.service;

import com.wjb.forum.db.po.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getUserMenu();

    String menuTreeData();
}
