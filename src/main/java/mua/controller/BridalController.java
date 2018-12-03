package mua.controller;

import mua.model.Bridal;
//import mua.repo.BridalRepo;
import mua.service.BridalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/bridal")
@CrossOrigin
public class BridalController {

    @Autowired
    private BridalService bridalService;

    // get all bridal bookings
    @GetMapping("/")
    public List<Bridal> getAllBridal() {
        return bridalService.getAllBridals();
    }

    // get a single bridal booking from id
    @GetMapping("/{id}")
    public Bridal getBridal(@PathVariable int id) {
        return bridalService.getBridal(id);
    }

    // create a booking
    @PostMapping("/")
    public void makeBooking(@RequestBody Bridal bridal) {
        bridalService.makeBooking(bridal);
    }

}
