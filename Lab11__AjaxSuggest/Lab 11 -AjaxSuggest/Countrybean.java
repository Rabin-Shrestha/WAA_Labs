/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;

/**
 *
 * @author Rene
 */
@ManagedBean
@SessionScoped
public class Countrybean {
    private String selection;
    private Collection<String> fullcountrylist = new ArrayList();
    private Collection<SelectItem> listboxitems = new ArrayList<SelectItem>();


    public Countrybean() {
        fullcountrylist.add("Afghanistan");
        fullcountrylist.add("Albania");        
        fullcountrylist.add("Algeria");
        fullcountrylist.add("Andorra");
        fullcountrylist.add("Angola");
        fullcountrylist.add("Antarctica");
        fullcountrylist.add("Argentina");
        fullcountrylist.add("Armenia");
        fullcountrylist.add("Aruba");
        fullcountrylist.add("Australia");
        fullcountrylist.add("Austria");
        fullcountrylist.add("Azerbaijan");
        listboxitems.add(new SelectItem("Afghanistan","Afghanistan"));
    }

    public void update(AjaxBehaviorEvent event) {
          listboxitems.clear();
           for (String c : fullcountrylist){
                if (c.startsWith(selection)){
                   listboxitems.add(new SelectItem(c,c));
               }
           }
       }

    public Collection<SelectItem> getListboxitems() {
        return listboxitems;
    }

    public void setListboxitems(Collection<SelectItem> listboxitems) {
        this.listboxitems = listboxitems;
    }

    public Collection<String> getFullcountrylist() {
        return fullcountrylist;
    }

    public void setFullcountrylist(Collection<String> fullcountrylist) {
        this.fullcountrylist = fullcountrylist;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

}
