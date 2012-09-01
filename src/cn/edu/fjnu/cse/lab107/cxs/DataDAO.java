package cn.edu.fjnu.cse.lab107.cxs;

import java.util.ArrayList;

public interface DataDAO<T>{
   ArrayList<T> creat(ArrayList<T> arr);
   ArrayList<T> retrieve();
   ArrayList<T> update(ArrayList<T> arr);
   ArrayList<T> delete(ArrayList<T> arr);
}
