package com.kagzz.jmix.rys.customer;

import com.kagzz.jmix.rys.customer.entity.Customer;
import com.kagzz.jmix.rys.entity.Address;
import com.kagzz.jmix.rys.test_support.DatabaseCleanup;
import com.kagzz.jmix.rys.test_support.ValidationVerification;
import io.jmix.core.DataManager;
import io.jmix.core.security.SystemAuthenticator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CustomerValidationTest {

    @Autowired
    DataManager dataManager;

    @Autowired
    SystemAuthenticator systemAuthenticator;

    @Autowired
    ValidationVerification validationVerification;

    @Autowired
    DatabaseCleanup databaseCleanup;

    private Customer customer;

    @BeforeEach
    void setUp() {
        databaseCleanup.removeAllEntities(Customer.class);
        customer = dataManager.create(Customer.class);
    }

    @Test
    void given_customerWithInvalidEmail_when_validateCustomer_then_oneViolationOccurs() {

//        Given
        customer.setLastName("Bar");
        customer.setEmail("invalidEmailAddress");

//        When
        List<ValidationVerification.ValidationResults> violations = validationVerification.validate(customer);

//        Then
        assertThat(violations).hasSize(1);
    }
    @Test
    void given_customerWithInvalidEmail_when_validateCustomer_then_customerIsInvalidBecauseOfEmail() {

//        Given
        customer.setLastName("Bar");
        customer.setEmail("invalidEmailAddress");

//        When
       ValidationVerification.ValidationResults  emailViolations = validationVerification.validateFirst(customer);

//        Then
        assertThat(emailViolations.getAttribute()).isEqualTo("email");
        assertThat(emailViolations.getErrorType())
                .isEqualTo(validationVerification.validationMessage("Email"));
    }

}