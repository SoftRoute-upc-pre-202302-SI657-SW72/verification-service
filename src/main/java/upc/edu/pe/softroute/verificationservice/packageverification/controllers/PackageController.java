package upc.edu.pe.softroute.verificationservice.packageverification.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.softroute.verificationservice.packageverification.entities.Package;
import upc.edu.pe.softroute.verificationservice.packageverification.services.PackageService;

import java.util.Optional;

@RestController
@RequestMapping("/api/packages-validation")
public class PackageController {
    @Autowired
    private PackageService packageService;

    @GetMapping("/{id}")
    public Optional<Package> getPackageById(@PathVariable Long id) {
        return packageService.getPackageById(id);
    }

    @PostMapping("/{id}/update-status")
    public Package updatePackageStatus(@PathVariable Long id) {
        return packageService.updatePackageStatus(id, "delivered");
    }
}
