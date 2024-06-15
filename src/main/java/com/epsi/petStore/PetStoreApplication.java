package com.epsi.petStore;
import com.epsi.petStore.service.PetStoreService;
import com.epsi.petStore.service.PrintAnimalPetStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class PetStoreApplication implements CommandLineRunner {


    private PrintAnimalPetStoreService printAnimalPetStoreService;
    private PetStoreService petStoreService;

    @Autowired
    public PetStoreApplication(PrintAnimalPetStoreService printAnimalPetStoreService, PetStoreService petStoreService) {
        this.printAnimalPetStoreService = printAnimalPetStoreService;
        this.petStoreService = petStoreService;
    }



    public static void main(String[] args) {
        SpringApplication.run(PetStoreApplication.class, args);
    }

    /**
     * Initializes data for pet stores and prints animals in a selected pet store.
     * This method initializes the pet stores with predefined data such as addresses,
     * products, and animals. It ensures that necessary data is set up before printing
     * the animals present in a selected pet store.
     *
     * Example usage:
     * <pre>{@code
     * petStoreService.initializeData();
     * printAnimalPetStoreService.printAnimalsInPetStore();
     * }</pre>
     */
    @Transactional
    @Override
    public void run(String... args) throws Exception {

        petStoreService.initializeData();
        printAnimalPetStoreService.printAnimalsAndProductsInPetStore();

    }
}

