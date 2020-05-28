package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Client;

import java.util.List;
import java.util.Map;

public interface ClientDao {
    //增加联系人
    int InsertClient(Map map);

    //删除联系人
    int DeleteClient(Map map);

    //修改联系人
    int UpdateClient(Map map);

    //根据items_id查询联系人信息
    List<Client> FindClientByItemsId(Map map);
}
