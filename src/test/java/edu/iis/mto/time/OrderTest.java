package edu.iis.mto.time;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

    @Test(expected = OrderExpiredException.class)
    public void confirmShouldThrowOrderExpiredException() {
        int time = -90001;
        Order order = new Order(time);
        order.submit();
        order.confirm();
    }

    @Test
    public void confirmShouldntThrowOrderExpiredException(){
        int time = 0;
        Order order = new Order(time);
        order.submit();
        order.confirm();
        Assert.assertEquals(Order.State.SUBMITTED, order.getOrderState());
    }

}