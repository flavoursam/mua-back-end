package mua.services;

import mua.models.Bridal;
import mua.jpa.BridalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BridalServiceImpl implements BridalService {

    @Autowired
    private BridalRepository bridalRepository;

    @Autowired
    public BridalServiceImpl(BridalRepository productRepository) {
        this.bridalRepository = productRepository;
    }


    @Override
    public List<Bridal> listAll() {
        List<Bridal> bridals = new ArrayList<>();
        bridalRepository.findAll().forEach(bridals :: add);
        return bridals;
    }


    public void makeBooking(Bridal bridal) {
        bridalRepository.save(bridal);
        return;
    }


    // public Bridal getByFirstName(String firstName) {
    //     List<Bridal> x = listAll();
    //     for (int i = 0 ; i < x.size(); i++) {
    //         if (x.get(i).getFirstName().equals(firstName)){
    //             return x.get(i);
    //         }
    //     }
    //     return null;
    // }
}
