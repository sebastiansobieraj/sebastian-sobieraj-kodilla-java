package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getByte("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlInsert = "INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)" +
                "VALUES (2, 2, CURDATE() - 5, null)";
        String sqlInsert2 = "INSERT INTO RENTS(BOOK_ID, READER_ID, RENT_DATE, RETURN_DATE)" +
                "VALUES (2, 2, CURDATE() - 1, null)";
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = FALSE";
        Statement statement = dbManager.getConnection().createStatement();
        statement.execute(sqlInsert);
        statement.execute(sqlInsert2);
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlCallUpdateBestsellers = "CALL UpdateBestsellers()";
        statement.execute(sqlCallUpdateBestsellers);

        //Then
        String sqlCheckUpdate = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = 1";
        ResultSet st = statement.executeQuery(sqlCheckUpdate);
        int howMany = 0;
        if(st.next()) {
            howMany = st.getByte("HOW_MANY");
        }
        assertEquals(2, howMany);

        //Cleanup
        String sqlCleanUpInsert = "DELETE FROM RENTS WHERE RENT_DATE = curdate() - 5";
        String sqlCleanUpInsert2 = "DELETE FROM  RENTS WHERE RENT_DATE = curdate() - 1";
        statement.execute(sqlCleanUpInsert);
        statement.execute(sqlCleanUpInsert2);
    }
}
