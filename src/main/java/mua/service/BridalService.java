package mua.service;

import mua.model.Bridal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BridalService {

    private List<Bridal> bridals = new ArrayList<>(Arrays.asList(
            new Bridal(1, "Tracey", "Truong", "0401888787",
                    "tracey@hotmail.com", "78 frontiers ave, edmondson park", "27/18/2018" ,
                    "1:00pm", "10:00am", 1, 4,
                    true),
            new Bridal(2, "Samuel", "Grennan", "21312312123",
                    "hjskdfajsdf@hotmail.com", "address here", "27/18/2018" ,
                    "1:00pm", "10:00am", 1, 4,
                    true),
            new Bridal(3, "werqwerq", "Truong", "0401888787",
                    "tracey@hotmail.com", "78 frontiers ave, edmondson park", "27/18/2018" ,
                    "1:00pm", "10:00am", 1, 4,
                    true)
    ));

    public List<Bridal> getAllBridals() {
        return bridals;
    }

    public Bridal getBridal(int id) {
        for(Bridal booking : bridals) {
            if(booking.getId() == id) {
                return booking;
            }
        }
        return null;
    }

    public void makeBooking(Bridal bridal) {
        bridals.add(bridal);
    }
}
