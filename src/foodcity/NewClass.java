/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcity;

import java.awt.List;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import static mondrian.olap.fun.vba.Vba.date;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


import org.joda.time.DurationFieldType;

/**
 *
 * @author TED
 */
public class NewClass {

    public static void main(String[] args) {
        String s1 = "welcome to split world";
//System.out.println("returning words:");  
//for(String w:s1.split("\\s",0)){  
//System.out.println(w);  
//}  
//System.out.println("returning words:");  
//for(String w:s1.split("\\s",1)){  
//System.out.println(w);  
//}  
//System.out.println("returning words:");  
//for(String w:s1.split("\\s",2)){  
//System.out.println(w);  
//}  

//String l="lop";
//        char p=l.charAt(0);
//System.out.println(p);
//String Str1 = new String("Welcome to Tutorialspoint.com");
//      String Str2 = new String("Tutorials" );
//
//      System.out.print("String Length :" );
//      System.out.println(Str1.length());
//
//      System.out.print("String Length :" );
//      System.out.println(Str2.length());
//    }
//try {
//      // ResultSet rs=db.search("SELECT * FROM attendance WHERE date('%M.%d %Y') BETWEEN '2017-09-01' AND '2017-09-31'");
//      ResultSet rs=db.search(" SELECT * FROM attendance where date BETWEEN '2017-09-01' AND '2017-09-29'");
//     
//       while (rs.next()) {
//           System.out.println(rs.getString("date"));
//    }
//        
//        } catch (Exception e) {
//        }
//        int year = 0;
//        int month = 0;
//        int day = 0;
//
//        String time[] = "2017:09:01".split(":");
//
//        year = Integer.parseInt(time[0]);
//        month = Integer.parseInt(time[1]);
//        day = Integer.parseInt(time[2]);
//        month--;
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.DAY_OF_MONTH, 1);
//        cal.set(year, month, day);
//        int myMonth = cal.get(Calendar.MONTH);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        while (myMonth == cal.get(Calendar.MONTH)) {
//            System.out.println(sdf.format(cal.getTime()));
//            cal.add(Calendar.DAY_OF_MONTH, 1);
        //}
//       try {
//            String path="‪C:\\ProgramData\\supercity\\2\\grn.jrxml";
//            JasperReport jr=JasperCompileManager.compileReport(path);
//            Map<String,Object> m=new HashMap<>();
//            m.put("id","grn01");
//            JasperPrint jp=JasperFillManager.fillReport(jr, m, db.con());
//            JasperViewer.viewReport(jp,false);
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
        try {
            String path="C:\\ProgramData\\supercity\\2\\grndup.jrxml";
            JasperReport jr=JasperCompileManager.compileReport(path);
            Map m=new HashMap<String, Object>();
            m.put("id","grn01");
            JasperPrint jp=JasperFillManager.fillReport(jr,m,db.con());
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }

}
