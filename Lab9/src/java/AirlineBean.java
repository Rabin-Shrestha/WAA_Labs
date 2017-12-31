import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class AirlineBean {

    List<AirlineChoice> alist = new ArrayList<>();
    List<AirlineChoice> allList = new ArrayList<>();

    public List<AirlineChoice> getAllList() {
        return allList;
    }

    public void setAllList(List<AirlineChoice> allList) {
        this.allList = allList;
    }

    public List<AirlineChoice> getAlist() {
        return alist;
    }

    public void setAlist(List<AirlineChoice> alist) {
        this.alist = alist;
    }

	public void checkAirline(ValueChangeEvent e) {
        if(e.getNewValue().equals("All"))
        {
            alist = new ArrayList<>();
            alist = allList;
        }
        else
        {
            alist = new ArrayList<>();
            for(AirlineChoice ll : allList){
                if(ll.getAirline().equals(e.getNewValue()))
                {
                    alist.add(ll);
                }
            }
        }
        

    }
	
    public AirlineBean() {
        AirlineChoice a1 = new AirlineChoice("Amsterdam", "NYC", "2/11/06", "KLM", 790.08);
        AirlineChoice a2 = new AirlineChoice("Amsterdam", "NYC", "2/11/06", "North West", 795.55);
        AirlineChoice a3 = new AirlineChoice("Amsterdam", "NYC", "2/11/06", "KLM", 280.00);
        AirlineChoice a4 = new AirlineChoice("Amsterdam", "NYC", "2/11/06", "United Airlines", 720.08);
        AirlineChoice a5 = new AirlineChoice("Amsterdam", "NYC", "2/11/06", "North West", 895.55);
        AirlineChoice a6 = new AirlineChoice("Amsterdam", "NYC", "2/11/06", "KLM", 880.00);
        AirlineChoice a7 = new AirlineChoice("Amsterdam", "NYC", "2/11/06", "United Airlines", 990.08);
        allList.add(a1);
        allList.add(a2);
        allList.add(a3);
        allList.add(a4);
        allList.add(a5);
        allList.add(a6);
        allList.add(a7);
        alist = allList;

    }

    

}
