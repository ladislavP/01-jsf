package org.beat.it.backend.repository;

import org.beat.it.backend.data.DeliveryOptions;
import org.beat.it.backend.data.PaymentMethods;
import org.beat.it.backend.domain.DeliveryOption;
import org.beat.it.backend.domain.PaymentMethod;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PaymentMethodRepository {

    public List<PaymentMethod> listPaymentMethods(){
        return PaymentMethods.all();
    }
}
