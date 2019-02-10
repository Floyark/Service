package service;

import pojo.Admin;

public interface AdminService {
    public Admin getAdmin(String username, String passwrod);
    public int  updateAdmin(int id);
}
