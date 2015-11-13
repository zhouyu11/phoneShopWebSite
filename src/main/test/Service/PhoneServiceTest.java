package Service;

import module.Phone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneServiceTest {

    private PhoneService service;
    private Phone phone;

    @Before
    public void setUp() throws Exception {
        phone = new Phone()
                .setName("phone")
                .setAge("10")
                .setId("phoneId")
                .setImageUrl("img/phones/motorola-xoom.0.jpg")
                .setSnippet("The Next, Next Generation\\n\\nExperience the future with MOTOROLA XOOM, the world's first tablet powered by Android 3.0 (Honeycomb).");
        service = new PhoneService();
        service.setPhones(phone);
    }

    @Test
    public void shouldGetPhone() throws Exception {
        Phone phone = service.getPhones()[0];
        assertEquals(this.phone.getName(), phone.getName());
        assertEquals(this.phone.getAge(), phone.getAge());
        assertEquals(this.phone.getId(), phone.getId());
        assertEquals(this.phone.getImageUrl(), phone.getImageUrl());
        assertEquals(this.phone.getSnippet(), phone.getSnippet());
    }
}