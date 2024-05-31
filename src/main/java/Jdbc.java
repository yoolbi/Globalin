import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

//   public void testConnection() {
//
//      String driver = "oracle.jdbc.driver.OracleDriver";
//      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//      String userid = "scott";
//      String passwd = "tiger";
//      Connection con = null;
//      PreparedStatement stmt = null;
//      ResultSet rs = null;
//      try {
//         Class.forName(driver);
//         con = DriverManager.getConnection(url, userid, passwd);
//         con.setAutoCommit(false);
//         System.out.println(con);
//         String sql = "INSERT INTO DEPT ( "
//               + "               DEPTNO "
//               + "               ,DNAME "
//               + "               ,LOC "
//               + "            ) VALUES ( "
//               + "               ? "
//               + "               ,? "
//               + "                ,? "
//               + "            )";
//         stmt = con.prepareStatement(sql);
//         stmt.setInt(1, 50);
//         stmt.setString(2,  "2024-IT 2기");
//         stmt.setString(3,  "영등포");
//         int count = stmt.executeUpdate();
//         System.out.println(count);
//         if (1 == count) {
//        	 sql = "INSERT INTO DEPT ( "
//        			 + "               DEPTNO "
//        			 + "               ,DNAME "
//        			 + "               ,LOC "
//        			 + "            ) VALUES ( "
//        			 + "               ? "
//        			 + "               ,? "
//        			 + "                ,? "
//        			 + "            )";
//        	 stmt = con.prepareStatement(sql);
//        	 stmt.setInt(1, 60);
//             stmt.setString(2,  "2024-IT 3기");
//             stmt.setString(3,  "영등포");
//        	 count = stmt.executeUpdate();
//        	 System.out.println(count);
//        	 if (1 == count) {
//        		 con.commit();
//        	 }      	         	 
//         }
//
//         sql = "SELECT DEPTNO "
//               + "        ,DNAME "
//               + "        ,LOC "
//               + " FROM    DEPT";
//         stmt = con.prepareStatement(sql);
//         rs = stmt.executeQuery();
//         while (rs.next()) {
//            System.out.print(rs.getString("DEPTNO")+",");
//            System.out.print(rs.getString("DNAME")+",");
//            System.out.print(rs.getString("LOC"));
//            System.out.println();
//         }
//      } catch (Exception e) {
//         e.printStackTrace();
//         try {
//			con.rollback();
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//      } finally {
//         try {
//            if (rs != null)
//               rs.close();
//            if (stmt != null)
//               stmt.close();
//            if (con != null)
//               con.close();
//         } catch (SQLException e) {
//            e.printStackTrace();
//         }
//      }
//   }
	public void testConnection(int deptNo) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		Connection con = null;
		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			con.setAutoCommit(false);
			stmt = con.prepareCall("BEGIN P_DEPT(?, ?);END;");
			stmt.setInt(1, deptNo);
			stmt.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
			stmt.execute();
			rs = (ResultSet) stmt.getObject(2);
			while (rs.next()) {
				System.out.print(rs.getString("DEPTNO") + ",");
				System.out.print(rs.getString("DNAME") + ",");
				System.out.print(rs.getString("LOC"));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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