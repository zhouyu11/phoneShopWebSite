package Service;

import module.Phone;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
    public PhoneService() {
        setPhones(new Phone()
                .setName("phone")
                .setAge("10")
                .setId("phoneId")
                .setImageUrl("img/phones/motorola-xoom.0.jpg")
                .setSnippet("The Next, Next Generation\\n\\nExperience the future with MOTOROLA XOOM, the world's first tablet powered by Android 3.0 (Honeycomb)."));
    }

    private Phone[] phones;

    public Phone[] getPhones() {
        return phones;
    }

    public void setPhones(Phone... phones) {
        this.phones = phones;
    }
}
