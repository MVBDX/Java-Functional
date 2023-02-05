package combinatorpattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Customer {
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;
}
