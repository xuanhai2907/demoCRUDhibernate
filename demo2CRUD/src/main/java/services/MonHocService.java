package services;

import java.util.List;
import models.MonHoc;
import repositories.MonHocRepository;

public class MonHocService {

    private MonHocRepository re;

    public MonHocService() {
        re = new MonHocRepository();
    }

    public List<MonHoc> getAll() {
        return re.getAll();
    }

    public int them(MonHoc m) {
        if (re.findByMa(m.getMaMon()) != null) {
            return 1;
        }
        if (re.save(m)) {
            return 0;
        }
        return -1;
    }

    public int sua(MonHoc m) {
        if (re.findByMa(m.getMaMon()) == null) {
            return 1;
        }
        if (re.update(m)) {
            return 0;
        }
        return -1;
    }
    
    public boolean xoa(MonHoc m){
        if(re.delete(m)){
            return  true;
        }
        return false;
    }
    
}
