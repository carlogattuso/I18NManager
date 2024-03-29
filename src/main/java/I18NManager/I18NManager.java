package I18NManager;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NManager {
    private String l1;
    private String l2;
    private HashMap<String, ResourceBundle> data;
    private static I18NManager instance;

    private I18NManager(){
        this.data= new HashMap<>();
    }

    public static I18NManager getInstance(){
        if(instance==null){instance=new I18NManager();}
        return instance;
    }

    public String getlabel(String idioma, String label){
        ResourceBundle rs = data.get(idioma);
        if(rs==null)
        {
            Locale l = new Locale(idioma);
            rs = ResourceBundle.getBundle("bundle",l);
            data.put(idioma,rs);
        }

        return rs.getString(label);
    }
}
