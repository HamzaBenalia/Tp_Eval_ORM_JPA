package com.epsi.petStore.service;
import com.epsi.petStore.domain.Animal;
import com.epsi.petStore.domain.Product;
import com.epsi.petStore.repository.PetStoreRepository;
import com.epsi.petStore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

@Service
public class PrintAnimalPetStoreService {

    private PetStoreRepository petStoreRepository;

    @Autowired
    public PrintAnimalPetStoreService(PetStoreRepository petStoreRepository) {
        this.petStoreRepository = petStoreRepository;

    }

    /**
     * Prints animals present in a selected pet store based on user input.
     *
     * The method prompts the user to choose a pet store from a list of predefined pet stores
     * and prints the animals present in the selected pet store.
     *
     * Example usage:
     * <pre>{@code
     * PrintAnimalService printAnimalService = new PrintAnimalService();
     * printAnimalService.printAnimalsInPetStore();
     * }</pre>
     *
     * @throws InputMismatchException if user input is not an integer when selecting the pet store.
     */
    public void printAnimalsAndProductsInPetStore() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez choisir une animalerie :");
        System.out.println("1. feedYourPet");
        System.out.println("2. cleanYourPet");
        System.out.println("3. playWithYourPet");
        System.out.print("Entrez le numéro de l'animalerie : ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String petStoreName;
        switch (choice) {
            case 1:
                petStoreName = "feedYourPet";
                break;
            case 2:
                petStoreName = "cleanYourPet";
                break;
            case 3:
                petStoreName = "playWithYourPet";
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }

        // Récupérer les animaux
        Set<Animal> animals = petStoreRepository.findAnimalsByPetStoreName(petStoreName);

        // Récupérer les produits
        Set<Product> products = petStoreRepository.findProductsByPetStoreName(petStoreName);

        // Affichage des animaux et produits ensemble
        System.out.println("Informations sur l'animalerie " + petStoreName + ":");

        // Affichage des animaux
        if (animals.isEmpty()) {
            System.out.println("Aucun animal trouvé dans cette animalerie.");
        } else {
            System.out.println("Animaux :");
            for (Animal animal : animals) {
                System.out.println("Animal numéro " + animal.getId() + ", couleur " + animal.getColor() + ", né le " + animal.getBirth());
            }
        }

        // Affichage des produits
        if (products.isEmpty()) {
            System.out.println("Aucun produit trouvé dans cette animalerie.");
        } else {
            System.out.println("Produits :");
            for (Product product : products) {
                System.out.println("Produit : " + product.getLabel() + ", prix : " + product.getPrice() + " €");
            }
        }
    }
}
