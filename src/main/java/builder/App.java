package builder;

import com.google.common.collect.ImmutableList;

public class App {

    public static void main(String[] args) {

        Name name = new Name.Builder()
                .firstName("philip")
                .middleNames(ImmutableList.of("peter"))
                .surname("shturchek")
                .build();

        Address address = new Address.Builder()
                .city("Malmö")
                .houseNumber(13)
                .zipCode("21233")
                .build();

        Account account = new Account.Builder()
                .address(address)
                .name(name)
                .email("ohya@gmail.com")
                .id(1)
                .build();



    }
}
