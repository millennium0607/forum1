package com.wjb.forum.service.Impl;

import com.google.gson.Gson;
import com.wjb.forum.db.dao.MenuMapper;
import com.wjb.forum.db.dao.RoleMenuRelationMapper;
import com.wjb.forum.db.po.Menu;
import com.wjb.forum.db.po.MenuExample;
import com.wjb.forum.db.po.RoleMenuRelation;
import com.wjb.forum.db.po.RoleMenuRelationExample;
import com.wjb.forum.service.MenuService;
import com.wjb.forum.utils.UserVOInfo;
import com.wjb.forum.vo.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.IntrospectionException;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private RoleMenuRelationMapper roleMenuRelationMapper;
    @Autowired
    private Gson gson;

    @Override
    public List<Menu> getUserMenu() {

        RoleMenuRelationExample example = new RoleMenuRelationExample();
        example.createCriteria().andRoleidEqualTo(UserVOInfo.getRoleId());
        List<RoleMenuRelation> roleMenuRelationList = roleMenuRelationMapper.selectByExample(example);
        List<Integer> menuIdList = new LinkedList<>();
        for (RoleMenuRelation roleMenuRelation : roleMenuRelationList) {
            menuIdList.add(roleMenuRelation.getMenuid());
        }

        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andIdIn(menuIdList);
        return  menuMapper.selectByExample(menuExample);
    }

    @Override
    public String menuTreeData() {
        TreeNode node = new TreeNode();
        node.setId(1);
        node.setText("role");
        node.setState("closed");
        List<TreeNode> childNode = new LinkedList<>();
        List<Menu> menuList = menuMapper.selectByExample(null);
        for (int i = 0; i < menuList.size(); i++) {
            TreeNode child = new TreeNode();
            child.setId(11+i);
            child.setText(menuList.get(i).getName());
            child.setState(null);
            childNode.add(child);
        }
        node.setChildren(childNode);
        List<TreeNode> treeNodeList = new LinkedList<>();
        treeNodeList.add(node);
        return gson.toJson(treeNodeList);

    }
}
