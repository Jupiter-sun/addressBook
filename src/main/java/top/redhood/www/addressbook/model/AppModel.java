package top.redhood.www.addressbook.model;


import top.redhood.www.addressbook.bean.StudentMsg;

import java.text.Collator;
import java.util.*;

/**
 * 模型后台
 * @author chengkeyu
 *
 */
public class AppModel {
    /**
     * 按照姓名首字母排序
      * @param list
     * @return
     */
    public List nameSort(List list) {
        Collections.sort(list, new Comparator<StudentMsg>() {
            @Override
            public int compare(StudentMsg o1, StudentMsg o2) {
                Comparator<Object> com = Collator.getInstance(Locale.CHINA);
                return com.compare(o1.getName(), o2.getName());
            }
        });
        return list;
    }

    /**
     * 按照性别分类
     * @param studentList
     * @param sex
     * @return
     */
    public ArrayList<StudentMsg> sexSort(ArrayList<StudentMsg> studentList, String sex) {

        ArrayList<StudentMsg> arraysex = new ArrayList<StudentMsg>();

        for (StudentMsg msg : studentList) {
            if (sex.equals(msg.getSex())) {

                arraysex.add(msg);
            } else {
                //System.out.println("异常");
            }
        }
        System.out.println(arraysex.size());
        return arraysex;
    }
    //按宿舍查看
    public ArrayList<StudentMsg> dormitorySort(ArrayList<StudentMsg> array, String dormitory) {
        ArrayList<StudentMsg> arraydormitory = new ArrayList<StudentMsg>();
        for (StudentMsg student : array) {
            if (dormitory.equals(student.getDormitory())) {
                arraydormitory.add(student);
                //System.out.println(student);
            }
        }
        return arraydormitory;
    }
    //按地址排序
    public ArrayList<StudentMsg> addressSort(ArrayList<StudentMsg> array, String address) {
        ArrayList<StudentMsg> arrayaddress = new ArrayList<StudentMsg>();
        for (StudentMsg student : array) {
            if (address.equals(student.getDormitory())) {
                arrayaddress.add(student);
            }
        }
        return arrayaddress;
    }
    //通过keyWord查询
    public ArrayList<StudentMsg> searchStudent(ArrayList<StudentMsg> array,String search){
        search = search.trim();
        ArrayList<StudentMsg> arraySearch = new ArrayList<StudentMsg>();
        for (StudentMsg student:array){
            if(student.getAddress().contains(search)||student.getName().contains(search)){
                arraySearch.add(student);
            }
        }
        return arraySearch;
    }





}
