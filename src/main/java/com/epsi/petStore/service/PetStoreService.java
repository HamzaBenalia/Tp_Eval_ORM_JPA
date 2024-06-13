package com.epsi.petStore.service;


import com.epsi.petStore.domain.*;
import com.epsi.petStore.repository.AddressRepository;
import com.epsi.petStore.repository.AnimalRepository;
import com.epsi.petStore.repository.PetStoreRepository;
import com.epsi.petStore.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

@Service
public class PetStoreService {


    private PetStoreRepository petStoreRepository;

    private ProductRepository productRepository;

    private AnimalRepository animalRepository;

    private AddressRepository addressRepository;


    @Autowired
    public PetStoreService(PetStoreRepository petStoreRepository, ProductRepository productRepository, AnimalRepository animalRepository, AddressRepository addressRepository) {
        this.petStoreRepository = petStoreRepository;
        this.productRepository = productRepository;
        this.animalRepository = animalRepository;
        this.addressRepository = addressRepository;
    }


    /**
     * Initializes data for three predefined pet stores: "feedYourPet", "cleanYourPet", and "playWithYourPet".
     * It creates or retrieves these pet stores from the repository, assigns addresses to them, and saves them
     * along with associated products and animals to the database.
     *
     * Example usage:
     * <pre>{@code
     * InitializeDataService initializeDataService = new InitializeDataService();
     * initializeDataService.initializeData();
     * }</pre>
     */
    public void initializeData() {

        // Initialize or retrieve existing pet stores
        PetStore petStoreFood = petStoreRepository.findByName("feedYourPet");
        if (petStoreFood == null) {
            petStoreFood = new PetStore();
            petStoreFood.setName("feedYourPet");
            petStoreFood.setManagerName("Hamza");
            petStoreRepository.save(petStoreFood);

        }
        PetStore petStoreCleaning = petStoreRepository.findByName("cleanYourPet");
        if (petStoreCleaning == null) {
            petStoreCleaning = new PetStore();
            petStoreCleaning.setName("cleanYourPet");
            petStoreCleaning.setManagerName("Sara");
            petStoreRepository.save(petStoreCleaning);
        }


        PetStore petStoreAccessories = petStoreRepository.findByName("playWithYourPet");
        if (petStoreAccessories == null) {
            petStoreAccessories = new PetStore();
            petStoreAccessories.setName("playWithYourPet");
            petStoreAccessories.setManagerName("Drake");
            petStoreRepository.save(petStoreAccessories);
        }


        /**
         * Creates and saves an address and assigns it to a pet store.
         *
         * @param petStore the pet store to which the address is assigned
         * @param city the city of the address
         * @param street the street of the address
         * @param zipCode the zip code of the address
         * @param number the number of the address
         */

        Address addressPetStoreFood = new Address();          //Address of foodpetStore
        addressPetStoreFood.setCity("Montpellier");
        addressPetStoreFood.setStreet("Jean josephe");
        addressPetStoreFood.setZipCode("34000");
        addressPetStoreFood.setNumber("13");
        addressRepository.save(addressPetStoreFood);
        petStoreFood.setAddress(addressPetStoreFood);
        petStoreRepository.save(petStoreFood);


        Address addressPetStoreCleaning = new Address();          //Address of cleaningStore
        addressPetStoreCleaning.setCity("Beziers");
        addressPetStoreCleaning.setStreet("Jean jack");
        addressPetStoreCleaning.setZipCode("34500");
        addressPetStoreCleaning.setNumber("14");
        addressRepository.save(addressPetStoreCleaning);
        petStoreCleaning.setAddress(addressPetStoreCleaning);
        petStoreRepository.save(petStoreCleaning);


        Address addressPetStoreAccessory = new Address();          //Address of AccessoryStore
        addressPetStoreAccessory.setCity("Toulouse");
        addressPetStoreAccessory.setStreet("Blagnac");
        addressPetStoreAccessory.setZipCode("31000");
        addressPetStoreAccessory.setNumber("15");
        addressRepository.save(addressPetStoreAccessory);
        petStoreAccessories.setAddress(addressPetStoreAccessory);
        petStoreRepository.save(petStoreAccessories);


        /**
         * Creates and saves a product.
         *
         * @param code the code of the product
         * @param label the label of the product
         * @param price the price of the product
         * @param type the type of the product
         * @param petStore the pet store associated with the product
         */

        Product productFood = new Product();
        productFood.setCode("1234");
        productFood.setLabel("croquette");
        productFood.setPrice(12.0);
        productFood.setType(ProdType.FOOD);
        petStoreFood.getProducts().add(productFood);
        productRepository.save(productFood);
        petStoreRepository.save(petStoreFood);

        Product product5 = new Product();
        product5.setCode("5555");
        product5.setLabel("Graines pour oiseaux");
        product5.setPrice(5.0);
        product5.setType(ProdType.FOOD);
        petStoreAccessories.getProducts().add(product5);
        productRepository.save(product5);
        petStoreRepository.save(petStoreFood);

        Product product6 = new Product();
        product6.setCode("6666");
        product6.setLabel("Cage pour oiseaux");
        product6.setPrice(30.0);
        product6.setType(ProdType.ACCESSORY);
        petStoreAccessories.getProducts().add(product6);
        productRepository.save(product6);
        petStoreRepository.save(petStoreAccessories);


        Product product4 = new Product();
        product4.setCode("4444");
        product4.setLabel("Perchoir pour oiseaux");
        product4.setPrice(18.0);
        product4.setType(ProdType.ACCESSORY);
        petStoreAccessories.getProducts().add(product4);
        productRepository.save(product4);
        petStoreRepository.save(petStoreAccessories);

        Product product3 = new Product();
        product3.setCode("3333");
        product3.setLabel("Shampooing pour chats");
        product3.setPrice(12.0);
        product3.setType(ProdType.CLEANING);
        petStoreCleaning.getProducts().add(product3);
        productRepository.save(product3);
        petStoreRepository.save(petStoreCleaning);


        Product product2 = new Product();
        product2.setCode("2222");
        product2.setLabel("Brosse à dents pour chats");
        product2.setPrice(8.5);
        product2.setType(ProdType.ACCESSORY);
        petStoreCleaning.getProducts().add(product2);
        productRepository.save(product2);
        petStoreRepository.save(petStoreCleaning);


        /**
         * Creates and saves an animal.
         *
         * @param animal  to be created and saved
         */
        Animal blackHorse = new Animal();             // adding a horse
        blackHorse.setBirth(LocalDateTime.of(2024, 2, 14, 11, 13));
        blackHorse.setColor("Black");
        blackHorse.setPetStore(petStoreFood);
        animalRepository.save(blackHorse);

        Fish lovelyFish = new Fish();    //  adding a fish to the dataBase
        lovelyFish.setLivingEnv(FishLivEnv.FRESH_WATER);
        lovelyFish.setBirth(LocalDateTime.of(2024, 3, 15, 12, 14));
        lovelyFish.setColor("Pink");
        lovelyFish.setPetStore(petStoreFood);
        animalRepository.save(lovelyFish);


        Cat tommyCat = new Cat();                     // adding a cat to the dataBase
        tommyCat.setChipId("1");
        tommyCat.setBirth(LocalDateTime.of(2024, 2, 14, 11, 13));
        tommyCat.setColor("Black");
        tommyCat.setPetStore(petStoreFood);
        animalRepository.save(tommyCat);


        Cat Katy = new Cat();                     // adding a cat to the dataBase
        Katy.setChipId("2");
        Katy.setBirth(LocalDateTime.of(2024, 2, 20, 11, 13));
        Katy.setColor("Black");
        Katy.setPetStore(petStoreFood);
        animalRepository.save(Katy);

        Cat kitty1 = new Cat();
        kitty1.setChipId("3");
        kitty1.setBirth(LocalDateTime.of(2024, 3, 10, 8, 0));
        kitty1.setColor("White");
        kitty1.setPetStore(petStoreCleaning);
        animalRepository.save(kitty1);

        Cat kitty2 = new Cat();
        kitty2.setChipId("4");
        kitty2.setBirth(LocalDateTime.of(2024, 4, 5, 9, 30));
        kitty2.setColor("Tabby");
        kitty2.setPetStore(petStoreCleaning);
        animalRepository.save(kitty2);

        Cat kitty3 = new Cat();
        kitty3.setChipId("5");
        kitty3.setBirth(LocalDateTime.of(2024, 5, 20, 15, 45));
        kitty3.setColor("Calico");
        kitty3.setPetStore(petStoreCleaning);
        animalRepository.save(kitty3);


        Fish fishy = new Fish();
        fishy.setLivingEnv(FishLivEnv.SEA_WATER);  // Environnement d'eau salée
        fishy.setBirth(LocalDateTime.of(2024, 4, 1, 8, 0));  // Date de naissance
        fishy.setColor("Blue");  // Couleur du poisson
        fishy.setPetStore(petStoreAccessories);  // Association avec le troisième PetStore
        animalRepository.save(fishy);


        Fish fishow = new Fish();
        fishow.setLivingEnv(FishLivEnv.FRESH_WATER);  // Environnement d'eau douce
        fishow.setBirth(LocalDateTime.of(2024, 5, 10, 10, 30));  // Date de naissance
        fishow.setColor("Gold");  // Couleur du poisson
        fishow.setPetStore(petStoreAccessories);  // Association avec le troisième PetStore
        animalRepository.save(fishow);


        Fish fish3 = new Fish();
        fish3.setLivingEnv(FishLivEnv.FRESH_WATER);  // Environnement d'eau salée
        fish3.setBirth(LocalDateTime.of(2024, 6, 20, 14, 45));  // Date de naissance
        fish3.setColor("Red");  // Couleur du poisson
        fish3.setPetStore(petStoreAccessories);  // Association avec le troisième PetStore
        animalRepository.save(fish3);


    }

}



