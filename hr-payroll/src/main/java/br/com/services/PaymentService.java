package br.com.services;

import br.com.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int day){
        return new Payment("Bob",100D,day);
    }
}
