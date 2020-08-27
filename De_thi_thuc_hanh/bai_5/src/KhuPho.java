import java.util.List;

public class KhuPho {


    public KhuPho(){

    }

    public void addHoDan(List<HoDan> list,HoDan hoDan){
        list.add(hoDan);
    }

    public void editSoNguoiTrongHo(List<HoDan> list,int id,int newSoNguoi){
        for (HoDan i:list){
            if (i.getIdHodan()==id){
                i.setSoThanhVienTrongHo(newSoNguoi);
            }
        }
    }

    public void editSoNha(List<HoDan> list,int id, String soNha){
        for (HoDan i:list){
            if (i.getIdHodan()==id){
                i.setSoNha(soNha);
            }
        }
    }



}
