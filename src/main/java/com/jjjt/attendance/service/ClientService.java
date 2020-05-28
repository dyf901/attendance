package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.ClientDao;
import com.jjjt.attendance.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClientService implements ClientDao {
    @Autowired
    private ClientDao clientDao;

    //增加联系人
    @Override
    public int InsertClient(Map map) {
        return clientDao.InsertClient(map);
    }

    //删除联系人
    @Override
    public int DeleteClient(Map map) {
        return clientDao.DeleteClient(map);
    }

    //修改联系人
    @Override
    public int UpdateClient(Map map) {
        return clientDao.UpdateClient(map);
    }

    //根据items_id查询联系人信息
    @Override
    public List<Client> FindClientByItemsId(Map map) {
        return clientDao.FindClientByItemsId(map);
    }
}
