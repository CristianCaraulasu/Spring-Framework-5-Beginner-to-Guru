package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.model.services.OwnerService;
import guru.springframework.sfgpetclinic.model.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setFirstName("Gina");
        owner.setLastName("Basina");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setFirstName("Alexia");
        owner1.setLastName("Limuzina");

        ownerService.save(owner1);

        System.out.println("Hello California!!!");

        Vet vet = new Vet();
        vet.setFirstName("cutu-cutu");
        vet.setLastName("bimbo");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jaga-laga");
        vet1.setLastName("Cara-Paga");

        vetService.save(vet);
        vetService.save(vet1);

    }
}
