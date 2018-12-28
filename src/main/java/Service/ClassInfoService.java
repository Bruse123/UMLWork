package Service;


import Dao.ClassInfoDao;
import Dao.EvalatorDao;
import Domain.ClassInfo;
import Domain.Online_Evalator;

import java.util.List;

public class ClassInfoService {

    ClassInfoDao classInfoDao =new ClassInfoDao();

    public List<ClassInfo> getClassInfoList(int page) {
        return classInfoDao.getClassInfoList(page);
    }
    public int getClassInfoTotal() {
        return classInfoDao.getClassInfoTotal();
    }
    public void addClassInfo(ClassInfo classInfo) {
        classInfoDao.addEvaClassInfo(classInfo);
    }
    public void deleteClassInfo(String class_name){
        classInfoDao.deleteClassInfo(class_name);
    }
}
