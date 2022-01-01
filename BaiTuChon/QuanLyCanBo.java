package BaiTuChon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCanBo {
	private List<CanBo> officers;

    public QuanLyCanBo() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(CanBo officer) {
        this.officers.add(officer);
    }

    public List<CanBo> searchOfficerByName(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
