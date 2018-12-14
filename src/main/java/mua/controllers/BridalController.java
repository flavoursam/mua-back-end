package mua.controllers;

import mua.models.Bridal;
import mua.services.BridalService;
import mua.services.BridalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/bridal")
public class BridalController {

    @Autowired
    private BridalServiceImpl bridalServiceImpl;

    // get all bridal bookings
    @GetMapping("/")
    public List<Bridal> getAllBridalBookings() {
        System.out.println("Getting all bridal bookings...");
        return bridalServiceImpl.listAll();
    }

    // get bridal booking by first name
    // @GetMapping("/{firstName}")
    // public Bridal getByFirstName(@PathVariable String firstName){
    //     return bridalServiceImpl.getByFirstName(firstName);
    // }

    // create bridal booking
    @PostMapping(value = "/booking")
    public void makeBooking(@RequestBody Bridal bridal) {
        bridalServiceImpl.makeBooking(bridal);
    }


}
