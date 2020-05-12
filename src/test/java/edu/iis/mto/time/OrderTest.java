package edu.iis.mto.time;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

    @Test (expected = OrderExpiredException.class)
    public void confirmShouldThrowOrderExpiredException(){
        DateTime dateTime = new DateTime();
        TimeData time = new TimeData(dateTime);
        Order order = new Order(time);
        order.submit();
        time.changeTimeBy(90001);
        order.confirm();
        Assert.assertEquals(Order.State.SUBMITTED, order.getOrderState());
    }

    @Test
    public void confirmShouldntThrowOrderExpiredException(){
        TimeData timeData = new TimeData();
        Order order = new Order(timeData);
        order.submit();
        order.confirm();
    }

}