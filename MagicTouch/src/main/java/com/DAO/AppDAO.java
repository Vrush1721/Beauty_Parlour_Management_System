package com.DAO;

import java.util.List;


import com.entity.appointment;

public interface AppDAO {
  public boolean addAppoint(appointment a);
  public List<appointment> getAllapp();
  public List<appointment> getAlluapp(int uid);
  public appointment getsappById(int id);
  public boolean Updateapp(appointment a);
  public boolean Deleteapp(int id);
  public boolean cancelapp(int id);

}
