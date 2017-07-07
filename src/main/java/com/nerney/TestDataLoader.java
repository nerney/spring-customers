package com.nerney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.nerney.model.Customer;
import com.nerney.model.CustomerRepository;

@Component
public class TestDataLoader implements ApplicationRunner {

    @Autowired
    private CustomerRepository repo;

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        repo.save(
            new Customer("Jacob Nerney", "nerneyj@gmail.com", "2702274322", "1662 Ryan Ave.", "Murray", "KY", "42071")
        );
        repo.save(
            new Customer(
                "Nancy Zechner", "dancner@yahoo.com", "2702933730", "3092 Carman Rd.", "Schenectady", "NY", "12303"
            )
        );
        repo.save(
            new Customer(
                "Julianne Smith", "jlsmith@gmail.com", "2702109949", "236 Gordon Ave.", "Warwick", "RI", "02889"
            )

        );
        repo.save(
            new Customer("Carl Jenkins", "cjboss@gmail.com", "4013394495", "223 Main Ave.", "Coventry", "RI", "02855")

        );
        repo.save(
            new Customer(
                "Cory White", "cwhitey@gmail.com", "6764537767", "4500 MacPherson Dr.", "Pittsburgh", "PA", "15228"
            )

        );
        repo.save(
            new Customer("Hank Williams", "hilliams@yahoo.com", "1236657890", "99 Grove St.", "New York", "NY", "33049")

        );
        repo.save(
            new Customer("Jim Brody", "seriousbrah@gmail.com", "4439985611", "7 Caldwell St.", "Boston", "MA", "02534")

        );
        repo.save(
            new Customer(
                "Rhett Clark", "rhettmaster@minecraft.org", "4218879021", "345 Cherry Ln.", "Chicago", "IL", "54567"
            )
        );
    }
}

// Loads some test data into the database to get started
