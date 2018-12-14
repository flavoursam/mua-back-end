package mua.services;

import mua.models.Bridal;


import java.util.List;


public interface BridalService {

    List<Bridal> listAll();

    void makeBooking(Bridal bridal);

    // Bridal getByFirstName(String firstName);

}
