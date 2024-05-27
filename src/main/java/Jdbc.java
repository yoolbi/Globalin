import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

   public void testConnection() {

      String driver = "oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String userid = "scott";
      String passwd = "tiger";
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      try {
         Class.forName(driver);
         con = DriverManager.getConnection(url, userid, passwd);
         System.out.println(con);
         String sql = "INSERT INTO DEPT ( "
               + "               DEPTNO "
               + "               ,DNAME "
               + "               ,LOC "
               + "            ) VALUES ( "
               + "               '50' "
               + "               ,'2024-IT 2기' "
               + "                ,'영등포' "
               + "            )";
         stmt = con.createStatement();
         int count = stmt.executeUpdate(sql);
         System.out.println(count);

         sql = "SELECT DEPTNO "
               + "        ,DNAME "
               + "        ,LOC "
               + " FROM    DEPT";
         stmt = con.createStatement();
         rs = stmt.executeQuery(sql);
         while (rs.next()) {
            System.out.print(rs.getString("DEPTNO")+",");
            System.out.print(rs.getString("DNAME")+",");
            System.out.print(rs.getString("LOC"));
            System.out.println();
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (rs != null)
               rs.close();
            if (stmt != null)
               stmt.close();
            if (con != null)
               con.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
}