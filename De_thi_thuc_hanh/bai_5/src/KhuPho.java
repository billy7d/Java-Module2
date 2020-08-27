import java.util.List;

public class KhuPho {


    public KhuPho(){

    }

    public void addHoDan(List<HoDan> list,HoDan hoDan){
        list.add(hoDan);
    }

    public void editSoNguoiTrongHo(List<HoDan> list,String soNha,int newSoNguoi){
        for (HoDan i:list){
            if (i.getSoNha().equals(soNha)){
                i.setThanhVienTrongHo(newSoNguoi);
            }
        }
    }

    public void editSoNha(List<HoDan> list,String soNha,int newSoNguoi){
        for (HoDan i:list){
            if (i.getThanhVienTrongHo()==newSoNguoi){
                i.setSoNha(soNha);
            }
        }
    }



}
