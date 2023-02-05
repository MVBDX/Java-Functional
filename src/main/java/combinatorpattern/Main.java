package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {
        var customer = new Customer("Yashar", "mvbdx@yahoo.com",
                LocalDate.of(1988, 6, 2), "+989365800000");

        // using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumber())
                .and(isAdult()) // till before apply, it's lazy
                .apply(customer);

        if (result != SUCCESS)
            throw new IllegalStateException(result.name());

        System.out.println(result);
    }
}
