package com.ibs.FlightBookingApp.dao;

import com.ibs.FlightBookingApp.entity.FlightDetails;
import com.ibs.FlightBookingApp.entity.PassengerEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDao {


    private String database="jdbc:postgresql://localhost:5432/Booking";
    private String usernamedb="postgres";
    private String password="manager123";
    ArrayList<FlightDetails> flightdetails= new ArrayList<FlightDetails>();

    public  PassengerEntity CheckEmailExists(String email)
    {
        boolean emailExists = false;
        PassengerEntity passengerEntity=null;
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(database,usernamedb,password);
            PreparedStatement st = connection.prepareStatement("select * from passengerdetails where email = ?");

            st.setString(1, email);

            ResultSet r1=st.executeQuery();


            //System.out.println(r1.toString());
            String emailCounter;
            Long idCounter;
            if(r1.next())
            {
                emailCounter =  r1.getString("email");
                idCounter=r1.getLong("id");


                if(emailCounter.equals(email))
                {
                   // System.out.println("username not available");
                    emailExists = true;
                    passengerEntity=new PassengerEntity(idCounter,r1.getString("first_name"),
                                r1.getString("last_name") ,r1.getLong("passport_number"),
                                r1.getString("email"),r1.getString("address"));

                }
            }

        }
    catch (ClassNotFoundException | SQLException cE)
        {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }

        return passengerEntity;

    }

    public List<FlightDetails> getAllFlights(Long id) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(database,usernamedb,password);
        PreparedStatement st = connection.prepareStatement("select * from flightdetails where id=? ");
        st.setLong(1,id);

        ResultSet r1=st.executeQuery();
        while (r1.next()) {



            FlightDetails flights =new FlightDetails(r1.getLong("flightid"),r1.getString("airlines"),
                    r1.getString("departure_date"),r1.getString("arrival_date"),r1.getDouble("price"),
                    r1.getString("trip_duration"),r1.getLong("pnr_number"));




             flightdetails.add(flights);


        }
        return flightdetails;
    }


}
